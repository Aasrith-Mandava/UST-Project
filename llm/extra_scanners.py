"""
Lightweight scanners for corpus file types that don't have a dedicated ANTLR grammar.

Each scanner reads its file type and emits a per-file JSON artifact under
output/artifacts/<kind>/<file>.json with a consistent shape:

    {
        "file": "<filename>",
        "kind": "<type>",
        "uuid": "<sha-256 of path:kind, formatted as UUID>",
        "summary": <type-specific dict>,
        "items": [<extracted records>]
    }

Scanned types (none of which has a real ANTLR grammar yet):
  - copybook (.cpy)           — standalone data items + 88-level conditions
  - proc     (.prc)           — JCL procedures: steps, DDs, params
  - ddl      (.ddl)           — DB2 schemas: CREATE TABLE/INDEX, columns, PKs
  - dclgen   (.dcl)           — DB2 DCLGEN host structures
  - dbd      (.dbd)           — IMS DBD: database name, segments
  - psb      (.psb)           — IMS PSB: pcb name, sensegs
  - ctl      (.ctl)           — IDCAMS / SORT control statements
  - mac      (.mac)           — Assembler macros: DSECT, EQU, DS
  - scheduler (.controlm, .ca7) — batch scheduler folders + jobs

Plus rescans of types with extended coverage:
  - cobol_extra — .cbl files outside the main cbl/ directory
  - csd_extra   — .CSD (uppercase) variants

Rule 2: stable UUID = SHA-256(file_path + kind), first 32 hex → UUID format.
Rule 3: cross-refs use UUIDs, never names.
"""
from __future__ import annotations

import hashlib
import json
import re
import sys
import xml.etree.ElementTree as ET
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any, Callable

ROOT = Path(__file__).resolve().parent.parent
CORPUS = ROOT / "corpus" / "carddemo"
ARTIFACTS = ROOT / "output" / "artifacts"

# Canonical first-level subdirs of corpus/carddemo/app/ that hold the main
# CardDemo source.  Variant subprojects (app-authorization-ims-db2-mq,
# app-transaction-type-db2, app-vsam-mq) and `samples/` are intentionally
# excluded — they're optional AWS extensions, not part of the core CardDemo.
SCAN_SUBDIRS = (
    "cbl", "cpy", "cpy-bms", "jcl", "bms", "csd", "asm",
    "maclib", "proc", "ctl", "scheduler",
)


def make_uuid(*parts: str) -> str:
    """Stable UUID derived from input parts (rule 2)."""
    h = hashlib.sha256(":".join(parts).encode()).hexdigest()[:32]
    return f"{h[:8]}-{h[8:12]}-{h[12:16]}-{h[16:20]}-{h[20:32]}"


def strip_seq(line: str) -> str:
    """Strip mainframe sequence columns: cols 1-6 if numeric, cols 73-80 always."""
    body = line[6:73] if len(line) > 7 and (line[:6].isdigit() or line[:6].isspace()) else line[:73]
    return body.rstrip("\n")


def is_comment(body: str) -> bool:
    s = body.strip()
    return s.startswith("*") or s.startswith("/*") or s.startswith("//*") or not s


# ============================================================================
#  Copybook (.cpy)
# ============================================================================

_PIC_RE = re.compile(
    r"^\s*(?P<level>\d{2})\s+(?P<name>[A-Z][A-Z0-9_-]*)\s+"
    r"(?:.*?\bPIC(?:TURE)?\s+(?P<pic>[A-Z0-9()V.\-+/$Z*]+))"
    r"(?:\s+(?:USAGE\s+(?:IS\s+)?)?(?P<usage>COMP-?\d?|COMPUTATIONAL-?\d?|PACKED-DECIMAL|BINARY|DISPLAY))?"
    r"(?:\s+VALUE\s+(?:IS\s+)?(?P<value>'[^']*'|\"[^\"]*\"|[A-Z0-9-]+))?",
    re.IGNORECASE,
)
_GROUP_RE = re.compile(r"^\s*(?P<level>\d{2})\s+(?P<name>[A-Z][A-Z0-9_-]*)", re.IGNORECASE)
_88_RE = re.compile(
    r"^\s*88\s+(?P<name>[A-Z][A-Z0-9_-]*)\s+VALUE(?:S)?\s+(?:IS\s+)?(?P<values>.+?)\.\s*$",
    re.IGNORECASE,
)


def scan_copybook(path: Path) -> dict:
    items: list[dict] = []
    conditions: list[dict] = []
    text = path.read_text(errors="replace")
    for lineno, raw in enumerate(text.splitlines(), 1):
        body = strip_seq(raw)
        if is_comment(body):
            continue
        m_88 = _88_RE.match(body)
        if m_88:
            conditions.append({
                "level": 88,
                "name": m_88.group("name").upper(),
                "values": m_88.group("values").strip(),
                "line": lineno,
            })
            continue
        m = _PIC_RE.match(body)
        if m:
            items.append({
                "level": int(m.group("level")),
                "name": m.group("name").upper(),
                "pic": m.group("pic").upper(),
                "usage": (m.group("usage") or "").upper() or None,
                "value": m.group("value"),
                "line": lineno,
                "kind": "scalar",
            })
            continue
        m_g = _GROUP_RE.match(body)
        if m_g and m_g.group("name").upper() != "FILLER":
            level = int(m_g.group("level"))
            if level in (1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 49):
                items.append({
                    "level": level,
                    "name": m_g.group("name").upper(),
                    "line": lineno,
                    "kind": "group",
                })
    return {
        "summary": {
            "data_items": len(items),
            "conditions_88": len(conditions),
            "groups": sum(1 for i in items if i["kind"] == "group"),
            "scalars": sum(1 for i in items if i["kind"] == "scalar"),
        },
        "items": items,
        "conditions": conditions,
    }


# ============================================================================
#  JCL PROC (.prc) — reuse JCL semantics
# ============================================================================

_JCL_STEP_RE = re.compile(r"^//(?P<step>\S+)\s+EXEC\s+(?P<exec>.+)$")
_JCL_DD_RE = re.compile(r"^//(?P<dd>\S+)\s+DD\s+(?P<body>.+)$")


def scan_jcl_like(path: Path, kind: str) -> dict:
    """Shared scanner for .jcl and .prc — extract steps + DDs."""
    steps: list[dict] = []
    current_step = None
    text = path.read_text(errors="replace")
    for lineno, raw in enumerate(text.splitlines(), 1):
        body = raw.rstrip()
        if not body or body.startswith("//*"):
            continue
        m = _JCL_STEP_RE.match(body)
        if m:
            program = None
            proc = None
            args = m.group("exec")
            pm = re.search(r"PGM=(\S+?)(?:,|$)", args)
            if pm:
                program = pm.group(1)
            else:
                pm = re.search(r"PROC=(\S+?)(?:,|$)", args)
                if pm: proc = pm.group(1)
            current_step = {
                "step": m.group("step"),
                "program": program,
                "proc": proc,
                "line": lineno,
                "dds": [],
            }
            steps.append(current_step)
            continue
        m = _JCL_DD_RE.match(body)
        if m and current_step is not None:
            dd_body = m.group("body")
            dsn = None
            disp = None
            dm = re.search(r"DSN=([^,\s]+)", dd_body)
            if dm: dsn = dm.group(1)
            dpm = re.search(r"DISP=\(?([^,\s)]+(?:,[^,\s)]+){0,2})\)?", dd_body)
            if dpm: disp = dpm.group(1)
            current_step["dds"].append({
                "dd_name": m.group("dd"),
                "dsn": dsn,
                "disp": disp,
                "line": lineno,
            })
    return {
        "summary": {
            "steps": len(steps),
            "dd_count": sum(len(s["dds"]) for s in steps),
            "programs": sorted({s["program"] for s in steps if s["program"]}),
        },
        "items": steps,
    }


# ============================================================================
#  DDL (.ddl) — DB2 schema
# ============================================================================

_CREATE_TABLE_RE = re.compile(
    r"CREATE\s+TABLE\s+(?P<name>[A-Z][A-Z0-9_.]*)\s*\((?P<body>.+?)\)\s*;",
    re.IGNORECASE | re.DOTALL,
)
_CREATE_INDEX_RE = re.compile(
    r"CREATE\s+(UNIQUE\s+)?INDEX\s+(?P<name>[A-Z][A-Z0-9_.]*)\s+ON\s+(?P<table>[A-Z][A-Z0-9_.]*)",
    re.IGNORECASE,
)
_COL_RE = re.compile(
    r"^\s*(?P<name>[A-Z][A-Z0-9_]*)\s+(?P<type>[A-Z][A-Z0-9_(),\s]*?)(?:\s+(?P<nullable>NOT\s+NULL|NULL))?\s*(?:,|$)",
    re.IGNORECASE,
)


def scan_ddl(path: Path) -> dict:
    text = path.read_text(errors="replace")
    text_nocomments = re.sub(r"--.*?$", "", text, flags=re.MULTILINE)
    tables = []
    for m in _CREATE_TABLE_RE.finditer(text_nocomments):
        name = m.group("name").upper()
        body = m.group("body")
        columns = []
        for col_match in _COL_RE.finditer(body):
            col_name = col_match.group("name").upper()
            if col_name in ("PRIMARY", "FOREIGN", "UNIQUE", "CONSTRAINT", "CHECK"):
                continue
            columns.append({
                "name": col_name,
                "type": re.sub(r"\s+", " ", col_match.group("type")).strip(),
                "nullable": "NOT NULL" not in (col_match.group("nullable") or "").upper(),
            })
        pk_match = re.search(r"PRIMARY\s+KEY\s*\(([^)]+)\)", body, re.IGNORECASE)
        primary_key = [c.strip().upper() for c in pk_match.group(1).split(",")] if pk_match else []
        tables.append({"name": name, "columns": columns, "primary_key": primary_key})
    indexes = []
    for m in _CREATE_INDEX_RE.finditer(text_nocomments):
        indexes.append({
            "name": m.group("name").upper(),
            "table": m.group("table").upper(),
            "unique": bool(m.group(1)),
        })
    return {
        "summary": {
            "tables": len(tables),
            "indexes": len(indexes),
            "total_columns": sum(len(t["columns"]) for t in tables),
        },
        "items": tables,
        "indexes": indexes,
    }


# ============================================================================
#  DCLGEN (.dcl) — DB2 + COBOL host vars
# ============================================================================

def scan_dclgen(path: Path) -> dict:
    text = path.read_text(errors="replace")
    table_match = re.search(r"DCLGEN\s+TABLE\s*\(\s*([A-Z][A-Z0-9_.]*)\s*\)", text, re.IGNORECASE)
    table_name = table_match.group(1).upper() if table_match else None
    # Extract column declarations from the DCLGEN header (lines starting with "* NAME")
    columns = []
    for raw in text.splitlines():
        body = strip_seq(raw)
        if is_comment(body):
            continue
        m = re.match(r"^\s*\d{2}\s+(?P<name>[A-Z][A-Z0-9_-]*)\s+(?P<type>.*)", body, re.IGNORECASE)
        if m and not body.strip().startswith("01"):
            columns.append({
                "name": m.group("name").upper(),
                "declaration": re.sub(r"\s+", " ", m.group("type")).strip().rstrip("."),
            })
    return {
        "summary": {
            "table": table_name,
            "host_variables": len(columns),
        },
        "items": columns,
    }


# ============================================================================
#  IMS DBD (.dbd) — database descriptor
# ============================================================================

_DBD_NAME_RE = re.compile(r"\bDBD\s+NAME=(?P<name>[A-Z0-9]+)", re.IGNORECASE)
_DBD_ACCESS_RE = re.compile(r"\bACCESS=\(?([A-Z,]+)", re.IGNORECASE)
_SEGM_RE = re.compile(r"\bSEGM\s+NAME=(?P<name>[A-Z0-9]+)(?:[^A-Z](?:.*?PARENT=(?P<parent>[A-Z0-9]+))?)?", re.IGNORECASE)
_FIELD_RE = re.compile(r"\bFIELD\s+NAME=\(?(?P<name>[A-Z0-9_]+)", re.IGNORECASE)


def scan_dbd(path: Path) -> dict:
    text = path.read_text(errors="replace")
    nm = _DBD_NAME_RE.search(text)
    name = nm.group("name") if nm else path.stem
    am = _DBD_ACCESS_RE.search(text)
    access = am.group(1) if am else None
    segments = []
    for m in _SEGM_RE.finditer(text):
        segments.append({
            "name": m.group("name").upper(),
            "parent": (m.group("parent") or None) and m.group("parent").upper(),
        })
    fields = [m.group("name").upper() for m in _FIELD_RE.finditer(text)]
    return {
        "summary": {
            "name": name,
            "access": access,
            "segments": len(segments),
            "fields": len(fields),
        },
        "items": segments,
        "fields": fields,
    }


# ============================================================================
#  IMS PSB (.psb) — program specification block
# ============================================================================

_PSB_GEN_RE = re.compile(r"\bPSBGEN\s+.*?PSBNAME=(?P<name>[A-Z0-9]+)", re.IGNORECASE)
_PCB_RE = re.compile(
    r"^(?P<label>\S*)\s*PCB\s+(?:TYPE=(?P<type>[A-Z]+))?\s*,?\s*(?:DBDNAME=(?P<dbd>[A-Z0-9]+))?\s*,?\s*(?:PROCOPT=(?P<procopt>[A-Z]+))?",
    re.IGNORECASE | re.MULTILINE,
)


def scan_psb(path: Path) -> dict:
    text = path.read_text(errors="replace")
    nm = _PSB_GEN_RE.search(text)
    name = nm.group("name") if nm else path.stem
    pcbs = []
    for m in _PCB_RE.finditer(text):
        if m.group("type") or m.group("dbd"):
            pcbs.append({
                "label": m.group("label") or None,
                "type": m.group("type"),
                "dbdname": m.group("dbd"),
                "procopt": m.group("procopt"),
            })
    return {
        "summary": {
            "name": name,
            "pcbs": len(pcbs),
            "dbds_referenced": sorted({p["dbdname"] for p in pcbs if p["dbdname"]}),
        },
        "items": pcbs,
    }


# ============================================================================
#  CTL (.ctl) — IDCAMS / SORT control
# ============================================================================

_CTL_VERB_RE = re.compile(
    r"^\s*(?P<verb>REPRO|SORT|MERGE|INCLUDE|OMIT|OUTREC|INREC|DEFINE|DELETE|"
    r"ALTER|LISTCAT|PRINT|EXPORT|IMPORT|SET|IF|END|OPTION)\b",
    re.IGNORECASE,
)


def scan_ctl(path: Path) -> dict:
    text = path.read_text(errors="replace")
    statements = []
    for lineno, raw in enumerate(text.splitlines(), 1):
        body = raw.strip()
        if not body or body.startswith("/*") or body.startswith("//*"):
            continue
        m = _CTL_VERB_RE.match(body)
        if m:
            statements.append({
                "verb": m.group("verb").upper(),
                "text": body[:160],
                "line": lineno,
            })
    return {
        "summary": {
            "statements": len(statements),
            "verbs": sorted({s["verb"] for s in statements}),
        },
        "items": statements,
    }


# ============================================================================
#  Assembler macros (.mac)
# ============================================================================

_DSECT_RE = re.compile(r"^(?P<name>[A-Z][A-Z0-9_#$@]*)\s+DSECT\b", re.IGNORECASE)
_EQU_RE = re.compile(r"^(?P<name>[A-Z][A-Z0-9_#$@]*)\s+EQU\s+(?P<value>\S+)", re.IGNORECASE)
_DS_RE = re.compile(r"^(?P<name>[A-Z][A-Z0-9_#$@]*)\s+DS\s+(?P<type>\S+)", re.IGNORECASE)


def scan_mac(path: Path) -> dict:
    text = path.read_text(errors="replace")
    dsects = []
    equs = []
    fields = []
    for lineno, raw in enumerate(text.splitlines(), 1):
        body = raw
        if body.startswith("*"):
            continue
        m = _DSECT_RE.match(body)
        if m:
            dsects.append({"name": m.group("name"), "line": lineno})
            continue
        m = _EQU_RE.match(body)
        if m:
            equs.append({"name": m.group("name"), "value": m.group("value"), "line": lineno})
            continue
        m = _DS_RE.match(body)
        if m:
            fields.append({"name": m.group("name"), "type": m.group("type"), "line": lineno})
    return {
        "summary": {
            "dsects": len(dsects),
            "equs": len(equs),
            "fields": len(fields),
        },
        "items": {"dsects": dsects, "equs": equs, "fields": fields},
    }


# ============================================================================
#  Scheduler — Control-M (.controlm, XML) + CA7 (.ca7, text)
# ============================================================================

def scan_controlm(path: Path) -> dict:
    """Parse the Control-M XML and extract folder + job inventory."""
    try:
        root = ET.fromstring(path.read_text(errors="replace"))
    except ET.ParseError as e:
        return {"summary": {"error": f"XML parse failed: {e}"}, "items": []}
    folders = []
    for folder in root.iter("FOLDER"):
        jobs = []
        for job in folder.iter("JOB"):
            jobs.append({
                "name": job.attrib.get("JOBNAME"),
                "memname": job.attrib.get("MEMNAME"),
                "description": job.attrib.get("DESCRIPTION"),
                "application": job.attrib.get("APPLICATION"),
                "sub_application": job.attrib.get("SUB_APPLICATION"),
            })
        folders.append({
            "name": folder.attrib.get("FOLDER_NAME"),
            "modified": folder.attrib.get("LAST_UPLOAD"),
            "jobs": jobs,
        })
    return {
        "summary": {
            "folders": len(folders),
            "total_jobs": sum(len(f["jobs"]) for f in folders),
        },
        "items": folders,
    }


_CA7_JOB_RE = re.compile(r"^\s*JOB\s+(?P<name>\S+)", re.IGNORECASE)
_CA7_DD_RE = re.compile(r"^\s*DD\s+(?P<name>\S+)", re.IGNORECASE)


def scan_ca7(path: Path) -> dict:
    text = path.read_text(errors="replace")
    jobs = []
    dds = []
    for lineno, raw in enumerate(text.splitlines(), 1):
        body = raw.strip()
        if body.startswith("**") or not body:
            continue
        m = _CA7_JOB_RE.match(body)
        if m:
            jobs.append({"name": m.group("name"), "line": lineno})
        m = _CA7_DD_RE.match(body)
        if m:
            dds.append({"name": m.group("name"), "line": lineno})
    return {
        "summary": {
            "jobs": len(jobs),
            "dds": len(dds),
        },
        "items": jobs,
        "dds": dds,
    }


# ============================================================================
#  Driver
# ============================================================================

@dataclass
class ScanResult:
    kind: str
    files_in: int = 0
    files_ok: int = 0
    files_err: int = 0
    errors: list[str] = field(default_factory=list)


def write_artifact(kind: str, path: Path, content: dict) -> None:
    out_dir = ARTIFACTS / kind
    out_dir.mkdir(parents=True, exist_ok=True)
    artifact = {
        "file": path.name,
        "path": str(path.relative_to(CORPUS)),
        "kind": kind,
        "uuid": make_uuid(str(path), kind),
        **content,
    }
    # Use a full-path slug to avoid collisions when files in different
    # variant subdirs share a name (e.g. REPROCT.ctl in both app/ctl/ and
    # app/app-transaction-type-db2/ctl/).
    rel = path.relative_to(CORPUS).as_posix().replace("/", "__")
    out_dir.joinpath(rel + ".json").write_text(
        json.dumps(artifact, indent=2, default=str)
    )


def scan_cobol_inventory(path: Path) -> dict:
    """Inventory-grade scan for COBOL programs (e.g. in app-* variant subdirs
    not covered by ProLeap)."""
    text = path.read_text(errors="replace")
    lines = text.splitlines()
    has_cics = any("EXEC CICS" in line.upper() for line in lines)
    has_sql = any("EXEC SQL" in line.upper() for line in lines)
    has_ims = any(any(tok in line.upper() for tok in ("CALL 'CBLTDLI'", "CALL \"CBLTDLI\"", "CBLTDLI")) for line in lines)
    has_mq = any("MQOPEN" in line.upper() or "MQPUT" in line.upper() or "MQGET" in line.upper() for line in lines)
    pgm_match = re.search(r"PROGRAM-ID\s*\.\s*([A-Z0-9_-]+)", text, re.IGNORECASE)
    return {
        "summary": {
            "program_id": pgm_match.group(1) if pgm_match else None,
            "line_count": len(lines),
            "has_exec_cics": has_cics,
            "has_exec_sql": has_sql,
            "has_ims_calls": has_ims,
            "has_mq_calls": has_mq,
        },
        "items": [],
    }


def scan_bms_inventory(path: Path) -> dict:
    """Inventory-grade scan for BMS mapsets in variant subdirs."""
    text = path.read_text(errors="replace")
    mapsets = re.findall(r"\b([A-Z0-9$#@]+)\s+DFHMSD\b", text, re.IGNORECASE)
    maps = re.findall(r"\b([A-Z0-9$#@]+)\s+DFHMDI\b", text, re.IGNORECASE)
    fields = re.findall(r"\b([A-Z0-9$#@]+)\s+DFHMDF\b", text, re.IGNORECASE)
    return {
        "summary": {
            "mapsets": len(mapsets),
            "maps": len(maps),
            "fields": len(fields),
        },
        "items": {"mapsets": mapsets, "maps": maps, "fields": fields},
    }


def scan_csd_inventory(path: Path) -> dict:
    """Inventory-grade scan for additional CSD files (e.g. uppercase or in variant subdirs)."""
    text = path.read_text(errors="replace")
    defines = re.findall(r"\bDEFINE\s+(PROGRAM|TRANSACTION|MAPSET|FILE|LIBRARY)\s*\(\s*([A-Z0-9_]+)\s*\)", text, re.IGNORECASE)
    return {
        "summary": {
            "total_defines": len(defines),
            "programs": sum(1 for k, _ in defines if k.upper() == "PROGRAM"),
            "transactions": sum(1 for k, _ in defines if k.upper() == "TRANSACTION"),
            "mapsets": sum(1 for k, _ in defines if k.upper() == "MAPSET"),
            "files": sum(1 for k, _ in defines if k.upper() == "FILE"),
        },
        "items": [{"kind": k.upper(), "name": n} for k, n in defines],
    }


@dataclass
class ScanSpec:
    kind: str
    extensions: tuple[str, ...]  # lowercase, with leading dot
    scanner: Callable[[Path], dict]
    exclude_dirs: tuple[str, ...] = ()


def all_specs() -> list[ScanSpec]:
    """Specs for the canonical CardDemo only. Variant-only types (DDL, DCLGEN,
    IMS DBD, IMS PSB) and *_extra scanners are excluded — those only matter
    when scanning the optional AWS variant subprojects, which we no longer do."""
    return [
        ScanSpec("copybook",  (".cpy",), scan_copybook),
        ScanSpec("proc",      (".prc",), lambda p: scan_jcl_like(p, "proc")),
        ScanSpec("ctl",       (".ctl",), scan_ctl),
        ScanSpec("mac",       (".mac",), scan_mac),
    ]


_DEEP_PARSED_TWIN = {
    "cobol_extra": "cbl",
    "csd_extra":   "csd",
    "jcl_extra":   "jcl",
    "bms_extra":   "bms",
}


def _has_deep_parsed_twin(spec_kind: str, path: Path) -> bool:
    """For the *_extra inventory scanners: skip files that have a deep-parsed
    artifact under output/artifacts/<canonical_kind>/, since deep-parse data
    supersedes inventory and we don't want both."""
    twin = _DEEP_PARSED_TWIN.get(spec_kind)
    if not twin:
        return False
    twin_path = ARTIFACTS / twin / f"{path.name}.json"
    return twin_path.is_file()


def run_all() -> list[ScanResult]:
    """Scan the canonical CardDemo subdirs only (no variant subprojects, no samples).
    Each canonical subdir is flat — files live directly under it — so iterdir()
    suffices and we don't accidentally descend into nested app-* variant dirs."""
    results: list[ScanResult] = []
    app = CORPUS / "app"
    canonical_dirs = [app / sub for sub in SCAN_SUBDIRS if (app / sub).exists()]
    for spec in all_specs():
        r = ScanResult(kind=spec.kind)
        for cdir in canonical_dirs:
            for path in sorted(cdir.iterdir()):
                if not path.is_file():
                    continue
                if path.suffix.lower() not in spec.extensions:
                    continue
                # Skip files whose canonical subdir is handled by a Java parser
                # (cobol_extra/csd_extra/etc. apply only to variants — no longer scanned).
                if spec.exclude_dirs and cdir.name in spec.exclude_dirs:
                    continue
                # Skip if a deep-parsed twin already exists — no double counting.
                if _has_deep_parsed_twin(spec.kind, path):
                    continue
                r.files_in += 1
                try:
                    content = spec.scanner(path)
                    write_artifact(spec.kind, path, content)
                    r.files_ok += 1
                except Exception as e:
                    r.files_err += 1
                    r.errors.append(f"{path.name}: {e}")
        results.append(r)

    # Scheduler: Control-M + CA7
    sched = ScanResult(kind="scheduler")
    sched_dir = CORPUS / "app" / "scheduler"
    if sched_dir.exists():
        for path in sorted(sched_dir.glob("*.controlm")):
            sched.files_in += 1
            try:
                write_artifact("scheduler", path, scan_controlm(path))
                sched.files_ok += 1
            except Exception as e:
                sched.files_err += 1; sched.errors.append(f"{path.name}: {e}")
        for path in sorted(sched_dir.glob("*.ca7")):
            sched.files_in += 1
            try:
                write_artifact("scheduler", path, scan_ca7(path))
                sched.files_ok += 1
            except Exception as e:
                sched.files_err += 1; sched.errors.append(f"{path.name}: {e}")
    results.append(sched)

    return results


def main():
    results = run_all()
    print("\nExtra scanner results (Python — ANTLR-free):")
    print(f"  {'kind':12} {'in':>5} {'ok':>5} {'err':>5}")
    print(f"  {'-' * 12} {'-' * 5} {'-' * 5} {'-' * 5}")
    total_in = total_ok = total_err = 0
    for r in results:
        print(f"  {r.kind:12} {r.files_in:5} {r.files_ok:5} {r.files_err:5}")
        total_in += r.files_in; total_ok += r.files_ok; total_err += r.files_err
        for e in r.errors[:3]:
            print(f"      ! {e}")
    print(f"  {'-' * 12} {'-' * 5} {'-' * 5} {'-' * 5}")
    print(f"  {'TOTAL':12} {total_in:5} {total_ok:5} {total_err:5}")
    print()


if __name__ == "__main__":
    main()
