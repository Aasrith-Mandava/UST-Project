"""
Deep-parse the COBOL variant subprojects (IMS/DB2/MQ) via ProLeap.

The canonical `parse-cobol` subcommand only scans `corpus/carddemo/app/cbl/`.
The corpus has additional .cbl files under app-* variant subdirs (8 IMS/DB2/MQ
authorization programs, 3 DB2 transaction-type programs, 2 VSAM/MQ programs).
This module invokes the same Java jar repeatedly, once per variant root, with
the right --cpy-dirs so ProLeap can resolve all the variant copybooks.

Output goes to the same output/artifacts/cbl/ directory so build-graph picks
them up automatically. Programs that fail to parse (EXEC DLI not supported by
ProLeap; unusual identifiers) are reported but don't abort the pipeline.
"""
from __future__ import annotations

import os
import shutil
import subprocess
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
CORPUS = ROOT / "corpus" / "carddemo" / "app"
JAR = ROOT / "target" / "carddemo-pipeline.jar"
OUT = ROOT / "output" / "artifacts" / "cbl"

VARIANT_ROOTS = [
    "app-authorization-ims-db2-mq",
    "app-transaction-type-db2",
    "app-vsam-mq",
]


def _resolve_java() -> str:
    env_home = os.environ.get("JAVA_HOME")
    if env_home and Path(env_home, "bin", "java").exists():
        return str(Path(env_home, "bin", "java"))
    brew = Path("/opt/homebrew/Cellar/openjdk@17/17.0.18/libexec/openjdk.jdk/Contents/Home/bin/java")
    if brew.exists():
        return str(brew)
    return shutil.which("java") or "java"


def _all_cpy_dirs() -> str:
    """Comma-separated list of every copybook/dclgen directory in the corpus."""
    candidates = [
        CORPUS / "cpy",
        CORPUS / "cpy-bms",
        ROOT / "corpus" / "cics-stubs",
    ]
    for root in VARIANT_ROOTS:
        for sub in ("cpy", "cpy-bms", "dcl", "ddl", "ims", "cbl"):
            d = CORPUS / root / sub
            if d.is_dir():
                candidates.append(d)
    seen = set()
    out = []
    for c in candidates:
        s = str(c)
        if s not in seen and c.exists():
            seen.add(s)
            out.append(s)
    return ",".join(out)


def parse_variant(java: str, cpy_dirs: str, variant_dir: Path) -> tuple[int, int, list[str]]:
    """Run parse-cobol on one variant cbl dir. Return (ok, total, failures)."""
    proc = subprocess.run(
        [java, "-jar", str(JAR),
         "parse-cobol",
         f"--in={variant_dir}",
         f"--out={OUT}",
         f"--cpy-dirs={cpy_dirs}"],
        capture_output=True, text=True, cwd=str(ROOT),
    )
    ok = total = 0
    failures: list[str] = []
    for line in (proc.stdout + proc.stderr).splitlines():
        if "coverage:" in line:
            import re
            m = re.search(r"(\d+)/(\d+)", line)
            if m:
                ok, total = int(m.group(1)), int(m.group(2))
        elif line.strip().startswith("FAIL"):
            failures.append(line.strip())
    return ok, total, failures


def main():
    if not JAR.exists():
        print(f"ERROR: {JAR} not built. Run `mvn -DskipTests package` first.", file=sys.stderr)
        sys.exit(1)

    java = _resolve_java()
    cpy_dirs = _all_cpy_dirs()
    OUT.mkdir(parents=True, exist_ok=True)

    print(f"Java: {java}")
    print(f"Copybook search path: {len(cpy_dirs.split(','))} dirs")
    print()

    grand_ok = grand_total = 0
    for variant in VARIANT_ROOTS:
        variant_dir = CORPUS / variant / "cbl"
        if not variant_dir.is_dir():
            print(f"  (skipping missing {variant_dir})")
            continue
        ok, total, failures = parse_variant(java, cpy_dirs, variant_dir)
        marker = "OK" if ok == total else f"{ok}/{total}"
        print(f"  {variant:40} {marker}")
        for f in failures[:3]:
            print(f"      ! {f[:140]}")
        grand_ok += ok
        grand_total += total

    print()
    print(f"Variant programs deep-parsed: {grand_ok}/{grand_total}")
    if grand_ok < grand_total:
        print("  (remaining failures are typically ProLeap's EXEC DLI gap — those programs")
        print("   still get inventory-only artifacts via the extra-scanners step.)")


if __name__ == "__main__":
    main()
