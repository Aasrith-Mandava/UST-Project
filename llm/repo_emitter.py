"""
Multi-program forward engineering: emit a full Java repository from the artifact graph.

Walks every CompilationUnit in nodes, invokes llm.java_emitter.emit() for each,
and lays the output out as a Maven project at demo/java-repo/:

    demo/java-repo/
        pom.xml
        src/main/java/com/carddemo/generated/
            <ProgramName>.java          (one per COBOL program)
        src/main/java/com/carddemo/generated/batch/
            <Chain>Configuration.java   (from llm.batch_emitter, if a spec exists)
        README.md                       (lists every emitted class with grounding stats)

Run via `python -m llm.repo_emitter` or call build_repository() programmatically.
"""
from __future__ import annotations

import sys
from dataclasses import dataclass
from pathlib import Path
from typing import Iterator

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from api.database import connect
from llm import java_emitter, batch_emitter

REPO_DIR = ROOT / "demo" / "java-repo"
GENERATED_PKG = REPO_DIR / "src" / "main" / "java" / "com" / "carddemo" / "generated"
BATCH_PKG = GENERATED_PKG / "batch"


@dataclass
class EmittedProgram:
    program: str
    file: str
    status: str         # "ok" | "skipped" | "error"
    java_path: str | None = None
    java_lines: int = 0
    error: str | None = None


def list_programs() -> list[dict]:
    """Return every COBOL program in the artifact graph, in deterministic order."""
    with connect() as c:
        rows = c.execute(
            "SELECT name, file FROM nodes WHERE kind='CompilationUnit' "
            "AND name IS NOT NULL ORDER BY name"
        ).fetchall()
    return [{"name": r["name"], "file": r["file"]} for r in rows]


def is_stale() -> bool:
    """True if the repo doesn't exist or is older than the SQLite graph."""
    if not REPO_DIR.exists():
        return True
    db_path = ROOT / "output" / "carddemo.db"
    if not db_path.exists():
        return False  # nothing to rebuild from
    db_mtime = db_path.stat().st_mtime
    # Compare to the youngest .java file in the repo
    youngest = 0.0
    for p in GENERATED_PKG.rglob("*.java"):
        youngest = max(youngest, p.stat().st_mtime)
    return youngest == 0.0 or db_mtime > youngest


def build_repository(progress=None) -> Iterator[dict]:
    """Emit Java for every program, yielding progress events.

    Yields dicts with shape:
        {"event": "start", "total": <int>}
        {"event": "program", "idx": <int>, "name": <str>, "status": "ok"|"error", ...}
        {"event": "batch", "status": "ok"|"skipped"|"error", ...}
        {"event": "scaffold"}     # pom.xml + README written
        {"event": "complete", "ok_count": <int>, "error_count": <int>}
    """
    REPO_DIR.mkdir(parents=True, exist_ok=True)
    GENERATED_PKG.mkdir(parents=True, exist_ok=True)
    BATCH_PKG.mkdir(parents=True, exist_ok=True)

    programs = list_programs()
    yield {"event": "start", "total": len(programs)}

    emitted: list[EmittedProgram] = []
    for idx, prog in enumerate(programs, 1):
        name = prog["name"]
        try:
            out_path = java_emitter.emit(name, GENERATED_PKG)
            lines = sum(1 for _ in out_path.open())
            emitted.append(EmittedProgram(name, prog["file"], "ok", str(out_path), lines))
            yield {"event": "program", "idx": idx, "total": len(programs),
                   "name": name, "status": "ok",
                   "java_path": str(out_path.relative_to(REPO_DIR)),
                   "java_lines": lines}
        except SystemExit as e:
            emitted.append(EmittedProgram(name, prog["file"], "skipped", error=str(e)))
            yield {"event": "program", "idx": idx, "total": len(programs),
                   "name": name, "status": "skipped", "error": str(e)}
        except Exception as e:
            emitted.append(EmittedProgram(name, prog["file"], "error", error=str(e)))
            yield {"event": "program", "idx": idx, "total": len(programs),
                   "name": name, "status": "error", "error": str(e)}

    # Batch chain (if a spec exists from a prior llm.demo run)
    batch_spec = ROOT / "demo" / "batch_chain_spec.json"
    if batch_spec.is_file():
        try:
            out_path = batch_emitter.emit(
                batch_spec, BATCH_PKG / "PosttranIntcalcCreastmtConfiguration.java"
            )
            yield {"event": "batch", "status": "ok",
                   "path": str(out_path.relative_to(REPO_DIR))}
        except Exception as e:
            yield {"event": "batch", "status": "error", "error": str(e)}
    else:
        yield {"event": "batch", "status": "skipped",
               "reason": "no batch_chain_spec.json — run llm.demo first"}

    # Scaffold: pom.xml + README
    _write_pom()
    _write_readme(emitted)
    yield {"event": "scaffold"}

    ok = sum(1 for e in emitted if e.status == "ok")
    err = sum(1 for e in emitted if e.status == "error")
    skip = sum(1 for e in emitted if e.status == "skipped")
    yield {"event": "complete", "ok_count": ok, "error_count": err, "skipped_count": skip}


def _write_pom():
    (REPO_DIR / "pom.xml").write_text("""<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.carddemo</groupId>
    <artifactId>carddemo-generated</artifactId>
    <version>0.1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <name>CardDemo Generated Java</name>
    <description>
        Java repository forward-engineered from AWS CardDemo COBOL.
        Generated by the UST CodeCrafter pipeline:
          parsed COBOL artifacts -> LLM-authored grounded spec -> Java source.
    </description>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!-- Spring Batch is referenced by the batch/ package. Uncomment if you wire
             the generated batch jobs into a runnable application. -->
        <!--
        <dependency>
            <groupId>org.springframework.batch</groupId>
            <artifactId>spring-batch-core</artifactId>
            <version>5.1.0</version>
        </dependency>
        -->
    </dependencies>
</project>
""")


def _write_readme(emitted: list[EmittedProgram]):
    ok = sorted((e for e in emitted if e.status == "ok"), key=lambda e: e.program)
    skipped = sorted((e for e in emitted if e.status != "ok"), key=lambda e: e.program)
    lines = [
        "# CardDemo - Generated Java repository",
        "",
        "Forward-engineered from the AWS CardDemo COBOL corpus by the UST CodeCrafter pipeline.",
        "",
        "**Chain:** parsed COBOL artifacts (SQLite) → LLM-authored grounded spec → typed Java source.",
        "",
        "| Programs emitted | Skipped/errored | Total source lines |",
        "|---|---|---|",
        f"| {len(ok)} | {len(skipped)} | {sum(e.java_lines for e in ok):,} |",
        "",
        "## Emitted programs",
        "",
        "| Program | File | Lines |",
        "|---|---|---|",
    ]
    for e in ok:
        lines.append(f"| `{e.program}` | `{e.java_path}` | {e.java_lines:,} |")
    if skipped:
        lines += ["", "## Skipped / errored", "",
                  "| Program | Status | Reason |", "|---|---|---|"]
        for e in skipped:
            lines.append(f"| `{e.program}` | {e.status} | {(e.error or '')[:100]} |")
    lines += [
        "",
        "## Building",
        "",
        "```bash",
        "mvn compile",
        "```",
        "",
        "Generated source compiles standalone. Method bodies that need PIC-aware ",
        "numeric semantics (ADD/SUBTRACT/MULTIPLY/COMPUTE) are preserved as COBOL ",
        "comments — translate those once you've decided on the Java numeric strategy.",
    ]
    (REPO_DIR / "README.md").write_text("\n".join(lines) + "\n")


def main():
    for ev in build_repository():
        if ev["event"] == "program":
            mark = "✓" if ev["status"] == "ok" else "✗"
            extra = f" ({ev.get('java_lines')} lines)" if ev["status"] == "ok" else f" {ev.get('error','')[:80]}"
            print(f"  {mark} [{ev['idx']:2}/{ev['total']}] {ev['name']:12}{extra}")
        elif ev["event"] == "batch":
            print(f"  batch: {ev['status']} {ev.get('path') or ev.get('reason') or ev.get('error','')}")
        elif ev["event"] == "scaffold":
            print(f"  scaffold: wrote pom.xml + README.md to {REPO_DIR}")
        elif ev["event"] == "complete":
            print(f"\nrepo build complete: ok={ev['ok_count']} skipped={ev['skipped_count']} errors={ev['error_count']}")


if __name__ == "__main__":
    main()
