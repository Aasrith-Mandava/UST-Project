"""
Exhaustive spec generation across the WHOLE corpus.

For every CompilationUnit in the artifact graph (currently 39), generate:
  - a structured program-level spec (via the existing llm.demo.run_program_demo)

These are saved as demo/program_spec_<NAME>.{json,md} and an aggregate
demo/all_program_specs.json index so the web UI can navigate them.

Designed for unattended overnight runs:
  - Skips programs whose spec is already current
  - Handles Gemini rate-limits with adaptive cooldown
  - Falls back to Groq automatically when Gemini is exhausted
  - Always produces SOME output (fixture fallback if both providers fail)
  - Each program is its own try/except so one failure doesn't stop the rest

Usage:
  python -m llm.exhaustive_specs                   # all programs, skip if current
  python -m llm.exhaustive_specs --force           # regenerate everything
  python -m llm.exhaustive_specs --only COTRN02C,COBIL00C
  python -m llm.exhaustive_specs --limit 5
"""
from __future__ import annotations

import argparse
import json
import sys
import time
from dataclasses import dataclass, field
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from api.database import connect
from llm.demo import run_program_demo, save, _load_dotenv

_load_dotenv()

DEMO_DIR = ROOT / "demo"
INDEX_PATH = DEMO_DIR / "all_program_specs.json"


@dataclass
class SpecResult:
    name: str
    status: str          # "ok" | "skipped" | "failed"
    mode: str | None = None
    grounding_pct: float = 0.0
    references: int = 0
    paragraphs: int = 0
    spec_path: str | None = None
    error: str | None = None
    duration_s: float = 0.0


def list_programs() -> list[str]:
    with connect() as c:
        rows = c.execute(
            "SELECT name FROM nodes WHERE kind='CompilationUnit' AND name IS NOT NULL ORDER BY name"
        ).fetchall()
    return [r["name"] for r in rows]


def spec_is_current(program: str) -> bool:
    """A spec is 'current' if its file exists, has a parsed `spec` field, and
    is newer than the SQLite graph."""
    spec_file = DEMO_DIR / f"program_spec_{program}.json"
    if not spec_file.is_file():
        return False
    db = ROOT / "output" / "carddemo.db"
    if db.exists() and spec_file.stat().st_mtime < db.stat().st_mtime:
        return False
    try:
        data = json.loads(spec_file.read_text())
        return bool(data.get("spec"))
    except Exception:
        return False


def generate_one(program: str) -> SpecResult:
    t0 = time.time()
    try:
        result = run_program_demo(program)
    except Exception as e:
        return SpecResult(name=program, status="failed", error=str(e),
                          duration_s=time.time() - t0)
    save(f"program_spec_{program}", result)
    g = result.get("grounding") or {}
    spec = result.get("spec") or {}
    return SpecResult(
        name=program,
        status="ok",
        mode=result.get("mode"),
        grounding_pct=g.get("pct", 0.0),
        references=g.get("references", 0),
        paragraphs=len(spec.get("paragraphs") or []),
        spec_path=str((DEMO_DIR / f"program_spec_{program}.json").relative_to(ROOT)),
        duration_s=time.time() - t0,
    )


def write_index(results: list[SpecResult]) -> None:
    """Aggregate index that the web UI can load for fast navigation."""
    INDEX_PATH.write_text(json.dumps({
        "generated_at": int(time.time()),
        "total_programs": len(results),
        "ok": sum(1 for r in results if r.status == "ok"),
        "skipped": sum(1 for r in results if r.status == "skipped"),
        "failed": sum(1 for r in results if r.status == "failed"),
        "programs": [
            {
                "name": r.name,
                "status": r.status,
                "mode": r.mode,
                "grounding_pct": r.grounding_pct,
                "references": r.references,
                "paragraphs": r.paragraphs,
                "spec_path": r.spec_path,
                "error": r.error,
                "duration_s": round(r.duration_s, 2),
            }
            for r in results
        ],
    }, indent=2))


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--only", default="", help="Comma-separated subset of programs")
    parser.add_argument("--limit", type=int, default=0, help="Cap at N programs")
    parser.add_argument("--force", action="store_true", help="Regenerate even if current")
    parser.add_argument("--cooldown", type=int, default=20,
                        help="Seconds to sleep between Gemini calls (default 20)")
    args = parser.parse_args()

    DEMO_DIR.mkdir(parents=True, exist_ok=True)
    programs = list_programs()
    if args.only:
        wanted = {p.strip().upper() for p in args.only.split(",") if p.strip()}
        programs = [p for p in programs if p.upper() in wanted]
    if args.limit:
        programs = programs[: args.limit]

    print(f"Generating exhaustive program-level specs for {len(programs)} programs.")
    print(f"Output: {DEMO_DIR}/program_spec_<NAME>.{{json,md}}")
    print()

    results: list[SpecResult] = []
    needs_cooldown = False
    t_start = time.time()

    for i, prog in enumerate(programs, 1):
        if not args.force and spec_is_current(prog):
            results.append(SpecResult(name=prog, status="skipped",
                                      spec_path=str((DEMO_DIR / f"program_spec_{prog}.json").relative_to(ROOT))))
            print(f"  [{i:2}/{len(programs)}] {prog:12} skipped (current)")
            continue

        if needs_cooldown:
            print(f"      (cooldown {args.cooldown}s to respect Gemini per-minute quota)")
            time.sleep(args.cooldown)

        r = generate_one(prog)
        results.append(r)
        if r.status == "ok":
            print(f"  [{i:2}/{len(programs)}] {prog:12} ok  "
                  f"mode={r.mode}  grounding={r.grounding_pct}%  "
                  f"paragraphs={r.paragraphs}  ({r.duration_s:.1f}s)")
            needs_cooldown = (r.mode or "").startswith("live:gemini")
        else:
            print(f"  [{i:2}/{len(programs)}] {prog:12} FAILED: {r.error}")
            needs_cooldown = False

        # Persist index after every successful one so we never lose progress
        write_index(results)

    print()
    ok = sum(1 for r in results if r.status == "ok")
    skipped = sum(1 for r in results if r.status == "skipped")
    failed = sum(1 for r in results if r.status == "failed")
    print(f"Done in {time.time() - t_start:.1f}s: "
          f"ok={ok}  skipped={skipped}  failed={failed}")
    print(f"Index written to {INDEX_PATH.relative_to(ROOT)}")


if __name__ == "__main__":
    main()
