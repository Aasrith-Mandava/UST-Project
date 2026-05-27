"""
Per-file context builders for the multi-agent spec generator.

Each function returns a structured dict tailored to that file kind, so the
agents get the right shape of artifact context. Rule 1 still holds: we hand
agents AST excerpts, parser-emitted JSON, and *targeted* source snippets
(parsed and tagged) — never raw COBOL handed wholesale.

Output dict shape varies by kind but always includes:
  file_name, file_kind, summary{...}, items[...] (kind-specific)

Source excerpts (for the UI's "code snippet" block) are returned in a
separate `source_excerpts` key — NOT passed to the LLM, only to the renderer.
"""
from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path
from typing import Any

ROOT = Path(__file__).resolve().parent.parent
CORPUS = ROOT / "corpus" / "carddemo"
ARTIFACTS = ROOT / "output" / "artifacts"

# ----------------------------------------------------------------------------
#  Public entry point
# ----------------------------------------------------------------------------

# Maps file-kind label (used by the UI) -> (corpus_subdir, file_extensions)
KIND_SUBDIRS = {
    "cobol":     ("cbl",      (".cbl", ".CBL")),
    "copybook":  ("cpy",      (".cpy", ".CPY")),     # also cpy-bms (handled below)
    "jcl":       ("jcl",      (".jcl", ".JCL")),
    "bms":       ("bms",      (".bms", ".BMS")),
    "csd":       ("csd",      (".csd", ".CSD")),
    "asm":       ("asm",      (".asm", ".ASM")),
    "mac":       ("maclib",   (".mac", ".MAC")),
    "proc":      ("proc",     (".prc", ".PRC")),
    "ctl":       ("ctl",      (".ctl", ".CTL")),
    "scheduler": ("scheduler", (".controlm", ".ca7")),
}


def list_files(kind: str) -> list[dict]:
    """Return all canonical files of one kind: [{name, path, bytes}, ...]."""
    if kind not in KIND_SUBDIRS:
        return []
    app = CORPUS / "app"
    subdir, exts = KIND_SUBDIRS[kind]
    candidates = [app / subdir]
    if kind == "copybook":
        candidates.append(app / "cpy-bms")  # both .cpy directories
    out = []
    for cdir in candidates:
        if not cdir.exists():
            continue
        for p in sorted(cdir.iterdir()):
            if not p.is_file():
                continue
            if p.suffix in exts:
                out.append({
                    "name": p.name,
                    "path": str(p.relative_to(CORPUS)),
                    "bytes": p.stat().st_size,
                })
    return out


def build_context(conn, kind: str, file_name: str) -> dict:
    """Dispatch to the right builder."""
    builders = {
        "cobol":     _cobol_context,
        "copybook":  _copybook_context,
        "jcl":       _jcl_context,
        "bms":       _bms_context,
        "csd":       _csd_context,
        "asm":       _asm_context,
        "mac":       _mac_context,
        "proc":      _proc_context,
        "ctl":       _ctl_context,
        "scheduler": _scheduler_context,
    }
    fn = builders.get(kind)
    if not fn:
        return {"file_name": file_name, "file_kind": kind,
                "summary": {"error": f"unknown kind {kind}"}, "items": []}
    ctx = fn(conn, file_name)
    ctx.setdefault("file_kind", kind)
    ctx.setdefault("file_name", file_name)
    return ctx


def _row_to_dict(row):
    return {k: row[k] for k in row.keys()}


# ----------------------------------------------------------------------------
#  COBOL
# ----------------------------------------------------------------------------

def _cobol_context(conn, file_name: str) -> dict:
    prog_row = conn.execute(
        "SELECT * FROM nodes WHERE kind='CompilationUnit' AND file=? LIMIT 1",
        (file_name,)
    ).fetchone()
    program = prog_row["name"] if prog_row else file_name.replace(".cbl", "").replace(".CBL", "")

    paragraphs = conn.execute(
        "SELECT uuid, name, start_line, end_line FROM nodes "
        "WHERE kind='Paragraph' AND file=? ORDER BY start_line",
        (file_name,)
    ).fetchall()

    # Data items (sampled — full list is in the graph; we send a representative subset)
    data_items = conn.execute(
        "SELECT name, payload_json FROM nodes "
        "WHERE kind='DataItem' AND file=? AND name IS NOT NULL "
        "ORDER BY start_line LIMIT 60",
        (file_name,)
    ).fetchall()

    # Calls + file I/O
    calls = conn.execute(
        "SELECT callee_program, edge_kind, line FROM call_graph WHERE caller_program=? ORDER BY line",
        (program,)
    ).fetchall()
    file_io = conn.execute(
        "SELECT operation, file_name, record_copybook, line FROM file_io WHERE program=? ORDER BY line",
        (program,)
    ).fetchall()
    copybooks = conn.execute(
        "SELECT DISTINCT copybook FROM copybook_use WHERE program=? OR program=?",
        (program, file_name)
    ).fetchall()
    inbound_calls = conn.execute(
        "SELECT caller_program, edge_kind, line FROM call_graph WHERE callee_program=? ORDER BY caller_program",
        (program,)
    ).fetchall()

    # Statement-type histogram
    stmt_kinds = defaultdict(int)
    for r in conn.execute(
        "SELECT payload_json FROM nodes WHERE kind='Statement' AND file=?", (file_name,)
    ).fetchall():
        try:
            pl = json.loads(r["payload_json"] or "{}")
            if pl.get("statement_type"):
                stmt_kinds[pl["statement_type"]] += 1
        except Exception:
            pass

    # Source excerpts for the UI (NOT sent to LLM agents — separate key)
    source_excerpts = _read_source_excerpts(file_name, paragraphs[:5])

    return {
        "file_name": file_name,
        "program_name": program,
        "summary": {
            "paragraphs": len(paragraphs),
            "data_items_total": conn.execute(
                "SELECT COUNT(*) c FROM nodes WHERE kind='DataItem' AND file=?", (file_name,)
            ).fetchone()["c"],
            "calls_out": len(calls),
            "calls_in": len(inbound_calls),
            "file_io_ops": len(file_io),
            "copybooks": len(copybooks),
            "total_statements": sum(stmt_kinds.values()),
        },
        "paragraphs": [_row_to_dict(p) for p in paragraphs],
        "data_items_sample": [_row_to_dict(d) for d in data_items],
        "calls_out": [_row_to_dict(c) for c in calls],
        "calls_in": [_row_to_dict(c) for c in inbound_calls],
        "file_io": [_row_to_dict(f) for f in file_io],
        "copybooks_included": [r["copybook"] for r in copybooks],
        "statement_kinds": dict(stmt_kinds),
        "source_excerpts": source_excerpts,
    }


def _read_source_excerpts(file_name: str, paragraphs: list) -> list[dict]:
    """Read short source excerpts for the first few paragraphs.
    For the UI snippet panel; not passed to LLM agents."""
    src_path = CORPUS / "app" / "cbl" / file_name
    if not src_path.exists():
        return []
    try:
        lines = src_path.read_text(errors="replace").splitlines()
    except Exception:
        return []
    out = []
    for p in paragraphs:
        sl, el = (p["start_line"] or 1), (p["end_line"] or p["start_line"] or 1)
        # Cap at 40 lines per paragraph
        end = min(el, sl + 39)
        snippet = "\n".join(lines[sl - 1: end]) if sl <= len(lines) else ""
        out.append({
            "title": p["name"] or f"line {sl}",
            "start_line": sl,
            "end_line": end,
            "code": snippet,
        })
    return out


# ----------------------------------------------------------------------------
#  Copybook
# ----------------------------------------------------------------------------

def _copybook_context(conn, file_name: str) -> dict:
    # Read the parsed artifact (Python scanner produces structured items)
    artifact = _read_artifact("copybook", file_name)
    cb_stem = file_name.replace(".cpy", "").replace(".CPY", "")
    consumers = conn.execute(
        "SELECT DISTINCT program FROM copybook_use WHERE copybook=? ORDER BY program",
        (cb_stem,)
    ).fetchall()
    src = _read_raw(CORPUS / "app" / "cpy" / file_name, max_lines=100)
    if not src:
        src = _read_raw(CORPUS / "app" / "cpy-bms" / file_name, max_lines=100)
    return {
        "file_name": file_name,
        "summary": {
            "data_items": len(artifact.get("items") or []),
            "conditions_88": len(artifact.get("conditions") or []),
            "consumers": [r["program"] for r in consumers],
            "consumer_count": len(consumers),
        },
        "items": (artifact.get("items") or [])[:80],
        "conditions": (artifact.get("conditions") or [])[:30],
        "source_excerpts": [{"title": file_name, "start_line": 1, "end_line": min(100, len(src.splitlines())), "code": src}],
    }


# ----------------------------------------------------------------------------
#  JCL
# ----------------------------------------------------------------------------

def _jcl_context(conn, file_name: str) -> dict:
    # Find the JOB name from the parsed artifact / nodes
    rows = conn.execute(
        "SELECT * FROM jcl_job WHERE source_file=? ORDER BY step_name, dd_name",
        (file_name,)
    ).fetchall() if _table_has_column(conn, "jcl_job", "source_file") else []
    if not rows:
        # Fall back to matching by job name in any related table
        rows = conn.execute("SELECT * FROM jcl_job ORDER BY job_name LIMIT 200").fetchall()
    job_names = sorted({r["job_name"] for r in rows if r["job_name"]})

    artifact = _read_artifact("jcl", file_name)
    steps = artifact.get("items") or []
    src = _read_raw(CORPUS / "app" / "jcl" / file_name, max_lines=80)
    return {
        "file_name": file_name,
        "summary": {
            "steps": len(steps),
            "programs_invoked": sorted({s.get("program") for s in steps if s.get("program")}),
            "dd_count": sum(len(s.get("dds") or []) for s in steps),
            "job_names": job_names[:5],
        },
        "steps": steps,
        "source_excerpts": [{"title": file_name, "start_line": 1, "end_line": min(80, len(src.splitlines())), "code": src}],
    }


def _table_has_column(conn, table: str, column: str) -> bool:
    try:
        cols = [c["name"] for c in conn.execute(f"PRAGMA table_info({table})").fetchall()]
        return column in cols
    except Exception:
        return False


# ----------------------------------------------------------------------------
#  BMS
# ----------------------------------------------------------------------------

def _bms_context(conn, file_name: str) -> dict:
    artifact = _read_artifact("bms", file_name)
    src = _read_raw(CORPUS / "app" / "bms" / file_name, max_lines=80)
    mapsets = conn.execute(
        "SELECT name, payload_json FROM nodes WHERE kind='BmsMapset' AND file=?",
        (file_name,)
    ).fetchall()
    maps = conn.execute(
        "SELECT name, payload_json FROM nodes WHERE kind='BmsMap' AND file=?",
        (file_name,)
    ).fetchall()
    fields = conn.execute(
        "SELECT name, payload_json, start_line FROM nodes WHERE kind='BmsField' AND file=? ORDER BY start_line",
        (file_name,)
    ).fetchall()
    return {
        "file_name": file_name,
        "summary": {
            "mapsets": len(mapsets),
            "maps": len(maps),
            "fields": len(fields),
        },
        "mapsets": [_row_to_dict(r) for r in mapsets],
        "maps": [_row_to_dict(r) for r in maps],
        "fields_sample": [_row_to_dict(r) for r in fields[:60]],
        "source_excerpts": [{"title": file_name, "start_line": 1, "end_line": min(80, len(src.splitlines())), "code": src}],
    }


# ----------------------------------------------------------------------------
#  CSD
# ----------------------------------------------------------------------------

def _csd_context(conn, file_name: str) -> dict:
    defines = conn.execute(
        "SELECT kind, name, payload_json FROM nodes WHERE file=? AND kind LIKE 'CsdDefine_%' ORDER BY name",
        (file_name,)
    ).fetchall()
    by_kind = defaultdict(list)
    for r in defines:
        by_kind[r["kind"].replace("CsdDefine_", "")].append(_row_to_dict(r))
    src = _read_raw(CORPUS / "app" / "csd" / file_name, max_lines=120)
    return {
        "file_name": file_name,
        "summary": {
            "total_defines": len(defines),
            "kinds": {k: len(v) for k, v in by_kind.items()},
        },
        "defines_by_kind": dict(by_kind),
        "source_excerpts": [{"title": file_name, "start_line": 1, "end_line": min(120, len(src.splitlines())), "code": src}],
    }


# ----------------------------------------------------------------------------
#  ASM / MAC / PROC / CTL / Scheduler — lightweight handlers
# ----------------------------------------------------------------------------

def _asm_context(conn, file_name: str) -> dict:
    return _generic_context(conn, "asm", "asm", file_name, max_lines=120)


def _mac_context(conn, file_name: str) -> dict:
    return _generic_context(conn, "mac", "maclib", file_name, max_lines=120)


def _proc_context(conn, file_name: str) -> dict:
    return _generic_context(conn, "proc", "proc", file_name, max_lines=80)


def _ctl_context(conn, file_name: str) -> dict:
    return _generic_context(conn, "ctl", "ctl", file_name, max_lines=60)


def _scheduler_context(conn, file_name: str) -> dict:
    return _generic_context(conn, "scheduler", "scheduler", file_name, max_lines=120)


def _generic_context(conn, kind: str, subdir: str, file_name: str, max_lines: int) -> dict:
    artifact = _read_artifact(kind, file_name)
    src = _read_raw(CORPUS / "app" / subdir / file_name, max_lines=max_lines)
    return {
        "file_name": file_name,
        "summary": artifact.get("summary") or {},
        "items": artifact.get("items") or [],
        "source_excerpts": [{"title": file_name, "start_line": 1,
                             "end_line": min(max_lines, len(src.splitlines())), "code": src}],
    }


# ----------------------------------------------------------------------------
#  Helpers
# ----------------------------------------------------------------------------

def _read_artifact(kind: str, file_name: str) -> dict:
    """Read the parsed JSON artifact for this file (Python scanner output)."""
    d = ARTIFACTS / kind
    if not d.exists():
        return {}
    # Direct filename match
    target = d / f"{file_name}.json"
    if target.is_file():
        try:
            return json.loads(target.read_text())
        except Exception:
            return {}
    # Path-slugged name (extra_scanners writes those)
    for p in d.glob("*.json"):
        if p.name.endswith(f"__{file_name}.json"):
            try:
                return json.loads(p.read_text())
            except Exception:
                return {}
    return {}


def _read_raw(path: Path, max_lines: int = 100) -> str:
    """Read the file's source for the UI snippet panel only."""
    if not path.exists():
        return ""
    try:
        lines = path.read_text(errors="replace").splitlines()[:max_lines]
        return "\n".join(lines)
    except Exception:
        return ""
