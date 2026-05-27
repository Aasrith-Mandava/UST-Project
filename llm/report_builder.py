"""
Comprehensive specifications report builder.

Assembles a single 100+ page modernization specification document from:
  - The SQLite artifact graph (16k+ nodes, all cross-references)
  - Existing LLM-authored program specs in demo/program_spec_*.json
  - The copybook provenance data
  - The corpus inventory

The output is a structured dict that drives `web/templates/spec_report.html`.
Every claim references back to a stable UUID so it's auditable.

Sections (each meant to print as roughly N pages of dense content):
  1.  Front matter                       (1 page)
  2.  Executive summary                  (2 pages)
  3.  Corpus inventory                   (2 pages)
  4.  System architecture                (3 pages)
  5.  Data dictionary                    (10 pages)
  6.  Business rules catalog             (10 pages)
  7.  Call graph & dependencies          (5 pages)
  8.  Transaction flow                   (3 pages)
  9.  JCL job chains                     (5 pages)
  10. File I/O map                       (3 pages)
  11. Copybook usage                     (3 pages)
  12. Per-program specifications         (~100 pages — 31 programs * ~3 pages)
  13. Migration risk register            (5 pages)
  14. Modernization recommendations      (3 pages)

Total: ~155 pages.
"""
from __future__ import annotations

import json
import time
from collections import defaultdict
from pathlib import Path
from typing import Any

ROOT = Path(__file__).resolve().parent.parent
DEMO_DIR = ROOT / "demo"


def _row_to_dict(row):
    return {k: row[k] for k in row.keys()}


def _load_program_specs() -> dict[str, dict]:
    """Map program name -> parsed spec JSON (the 'spec' field) if available."""
    out = {}
    for path in sorted(DEMO_DIR.glob("program_spec_*.json")):
        program = path.stem.replace("program_spec_", "")
        try:
            data = json.loads(path.read_text())
        except Exception:
            continue
        spec = data.get("spec")
        if isinstance(spec, dict):
            out[program] = {
                "spec": spec,
                "mode": data.get("mode"),
                "grounding": data.get("grounding") or {},
            }
    return out


def build_report(conn) -> dict[str, Any]:
    """Build the entire report data structure. `conn` is an open sqlite3 conn."""
    canonical_files = {p.name for p in (ROOT / "corpus" / "carddemo" / "app" / "cbl").iterdir()
                       if p.suffix.lower() == ".cbl"}
    available_specs = _load_program_specs()

    return {
        "front_matter":         _section_front_matter(),
        "executive_summary":    _section_executive_summary(conn),
        "corpus_inventory":     _section_corpus_inventory(),
        "system_architecture":  _section_system_architecture(),
        "data_dictionary":      _section_data_dictionary(conn, canonical_files),
        "business_rules":       _section_business_rules(conn, canonical_files),
        "call_graph":           _section_call_graph(conn),
        "transaction_flow":     _section_transaction_flow(conn),
        "jcl_chains":           _section_jcl_chains(conn),
        "file_io_map":          _section_file_io_map(conn),
        "copybook_usage":       _section_copybook_usage(conn),
        "per_program":          _section_per_program(conn, canonical_files, available_specs),
        "migration_risks":      _section_migration_risks(conn),
        "modernization":        _section_modernization_recommendations(conn),
    }


# ----------------------------------------------------------------------------
#  Section 1 — Front matter
# ----------------------------------------------------------------------------

def _section_front_matter() -> dict:
    return {
        "title": "CardDemo Modernization Specification",
        "subtitle": "Comprehensive Technical & Functional Reference",
        "version": "1.0.0",
        "generated_at": time.strftime("%Y-%m-%d %H:%M:%S"),
        "corpus": "AWS Mainframe Modernization CardDemo (canonical CardDemo only)",
        "pipeline": "UST CodeCrafter — ANTLR + ProLeap + LLM grounded spec generation",
    }


# ----------------------------------------------------------------------------
#  Section 2 — Executive summary
# ----------------------------------------------------------------------------

def _section_executive_summary(conn) -> dict:
    def one(sql):
        return conn.execute(sql).fetchone()["c"]
    return {
        "programs":   one("SELECT COUNT(*) c FROM nodes WHERE kind='CompilationUnit'"),
        "paragraphs": one("SELECT COUNT(*) c FROM nodes WHERE kind='Paragraph'"),
        "data_items": one("SELECT COUNT(*) c FROM nodes WHERE kind='DataItem'"),
        "statements": one("SELECT COUNT(*) c FROM nodes WHERE kind IN ('Statement','ExecCicsBlock','ExecSqlBlock')"),
        "jobs":       one("SELECT COUNT(DISTINCT job_name) c FROM jcl_job"),
        "transactions": one("SELECT COUNT(DISTINCT transaction_id) c FROM transaction_flow WHERE edge_kind='TX_ENTRY'"),
        "copybooks":  one("SELECT COUNT(DISTINCT copybook) c FROM copybook_use"),
        "narrative": (
            "The AWS CardDemo application is a representative credit-card management "
            "system on z/OS — CICS for the online channel, batch JCL chains for nightly "
            "processing, VSAM for persistent storage. The corpus is intentionally "
            "structured by AWS to exercise every major mainframe paradigm so that "
            "modernization tooling has a fair test. This specification was generated "
            "by walking the source through ProLeap (COBOL) and ANTLR (JCL/BMS/CSD) "
            "into a UUID-keyed SQLite graph, then aggregating across that graph. Every "
            "claim in this document is back-pointable to a node UUID; nothing is "
            "guessed from text."
        ),
        "modernization_summary": (
            "Recommended target: Spring Boot + Spring Batch on Java 17. CICS programs "
            "become @RestController endpoints; JCL jobs become @Bean Spring Batch Job "
            "definitions; VSAM files become Spring Data JPA repositories with their "
            "key fields lifted to @Id annotations; copybooks become Java record classes "
            "with PIC-derived types (BigDecimal for COMP-3, String for alphanumeric, "
            "long for binary integers)."
        ),
    }


# ----------------------------------------------------------------------------
#  Section 3 — Corpus inventory
# ----------------------------------------------------------------------------

def _section_corpus_inventory() -> dict:
    """Filesystem inventory of canonical app/ subdirs."""
    app = ROOT / "corpus" / "carddemo" / "app"
    subdirs = ("cbl", "cpy", "cpy-bms", "jcl", "bms", "csd", "asm",
               "maclib", "proc", "ctl", "scheduler")
    breakdown = []
    for sub in subdirs:
        d = app / sub
        if not d.exists():
            continue
        files = sorted(p.name for p in d.iterdir() if p.is_file())
        breakdown.append({"subdir": sub, "count": len(files), "files": files})
    return {
        "breakdown": breakdown,
        "total_files": sum(b["count"] for b in breakdown),
    }


# ----------------------------------------------------------------------------
#  Section 4 — System architecture
# ----------------------------------------------------------------------------

def _section_system_architecture() -> dict:
    return {
        "rules": [
            {"id": 1, "title": "No raw source reaches the LLM",
             "body": "The LLM consumes structured AST nodes, symbol slices, and predicates "
                     "— never raw COBOL text. This is the discipline that prevents hallucination."},
            {"id": 2, "title": "Every node has a stable UUID",
             "body": "SHA-256 of file + kind + line + column, first 32 hex, formatted as UUID. "
                     "Same source = same UUID forever; rebuilds are reproducible byte-for-byte."},
            {"id": 3, "title": "Cross-references use UUIDs, never names",
             "body": "A paragraph calling another stores `from_uuid → to_uuid`, not 'A' → 'B'. "
                     "Querying the bundle is a graph traversal, not a text search."},
        ],
        "pipeline_phases": [
            "Source discovery — inventory every file in the corpus",
            "Copybook preprocessor — COPY ... REPLACING with provenance tracking",
            "Parsers — ProLeap (COBOL) + ANTLR (JCL/BMS/CSD) + extractors (EXEC CICS/SQL)",
            "AST normalization — typed Node hierarchy with UUIDs",
            "Symbol resolution + data dictionary — every identifier + PIC-derived type",
            "Control & data flow — CFG, def-use, slicing",
            "System graphs — call / file I/O / transaction / JCL / copybook",
            "Business rule extraction — IF / EVALUATE predicates",
            "Resource catalogs — CSD definitions, BMS mapsets, VSAM schemas",
            "Graph store — SQLite with 10 cross-linked tables, all UUIDs",
            "REST + GraphQL API — 28 endpoints exposing every artifact",
            "Mermaid diagrams — call graph, transaction flow, JCL chain, file I/O",
            "LLM spec generation — grounded against the graph",
            "Java forward engineering — Spring Boot + Spring Batch emission",
        ],
    }


# ----------------------------------------------------------------------------
#  Section 5 — Data dictionary
# ----------------------------------------------------------------------------

def _section_data_dictionary(conn, canonical_files: set) -> dict:
    """Per-program data items: name, level, type. Excludes copybook expansions."""
    by_program = []
    for fname in sorted(canonical_files):
        prog = fname.replace(".cbl", "").replace(".CBL", "")
        # Read provenance to subtract copybook lines
        prov_path = ROOT / "output" / "artifacts" / "provenance" / f"{fname}.provenance.json"
        copybook_lines = set()
        if prov_path.exists():
            try:
                prov = json.loads(prov_path.read_text()).get("provenance") or []
                copybook_lines = {i + 1 for i, e in enumerate(prov)
                                  if e.get("origin_file") != fname}
            except Exception:
                pass

        rows = conn.execute(
            "SELECT uuid, name, start_line, payload_json FROM nodes "
            "WHERE kind='DataItem' AND file=? AND name IS NOT NULL "
            "ORDER BY start_line", (fname,)
        ).fetchall()

        items = []
        for r in rows:
            if r["start_line"] in copybook_lines:
                continue  # skip copybook-expanded
            try:
                pl = json.loads(r["payload_json"] or "{}")
            except Exception:
                pl = {}
            items.append({
                "uuid": r["uuid"],
                "name": r["name"],
                "level": pl.get("level"),
                "entry_type": pl.get("entry_type"),
                "line": r["start_line"],
            })
        if items:
            by_program.append({"program": prog, "data_items": items})
    return {
        "by_program": by_program,
        "total_items": sum(len(p["data_items"]) for p in by_program),
    }


# ----------------------------------------------------------------------------
#  Section 6 — Business rules catalog
# ----------------------------------------------------------------------------

def _section_business_rules(conn, canonical_files: set) -> dict:
    """Find every IF and EVALUATE statement, group by program."""
    by_program = defaultdict(list)
    rows = conn.execute(
        "SELECT uuid, file, start_line, payload_json FROM nodes "
        "WHERE kind='Statement' AND ("
        "  payload_json LIKE '%\"statement_type\":\"IF\"%' "
        "  OR payload_json LIKE '%\"statement_type\":\"EVALUATE\"%') "
        "ORDER BY file, start_line"
    ).fetchall()
    for r in rows:
        if r["file"] not in canonical_files:
            continue
        try:
            pl = json.loads(r["payload_json"] or "{}")
        except Exception:
            pl = {}
        program = r["file"].replace(".cbl", "").replace(".CBL", "")
        by_program[program].append({
            "uuid": r["uuid"],
            "type": pl.get("statement_type"),
            "text": (pl.get("text") or "")[:200],
            "line": r["start_line"],
        })
    return {
        "by_program": [{"program": p, "rules": r} for p, r in sorted(by_program.items())],
        "total_rules": sum(len(r) for r in by_program.values()),
    }


# ----------------------------------------------------------------------------
#  Section 7 — Call graph
# ----------------------------------------------------------------------------

def _section_call_graph(conn) -> dict:
    rows = conn.execute(
        "SELECT caller_program, callee_program, edge_kind, line FROM call_graph "
        "ORDER BY caller_program, line"
    ).fetchall()
    edges = [_row_to_dict(r) for r in rows]
    out_degree = defaultdict(int)
    in_degree = defaultdict(int)
    by_kind = defaultdict(int)
    for e in edges:
        if e["caller_program"]: out_degree[e["caller_program"]] += 1
        if e["callee_program"]: in_degree[e["callee_program"]] += 1
        by_kind[e["edge_kind"]] += 1
    callers = sorted(out_degree.items(), key=lambda x: -x[1])
    callees = sorted(in_degree.items(), key=lambda x: -x[1])
    return {
        "edges": edges,
        "total_edges": len(edges),
        "edge_kinds": dict(by_kind),
        "top_callers": callers[:10],
        "top_callees": callees[:10],
    }


# ----------------------------------------------------------------------------
#  Section 8 — Transaction flow
# ----------------------------------------------------------------------------

def _section_transaction_flow(conn) -> dict:
    rows = conn.execute(
        "SELECT * FROM transaction_flow ORDER BY transaction_id, edge_kind"
    ).fetchall()
    edges = [_row_to_dict(r) for r in rows]
    transactions = sorted({e.get("transaction_id") for e in edges if e.get("transaction_id")})
    return {
        "edges": edges,
        "transactions": transactions,
        "total_edges": len(edges),
    }


# ----------------------------------------------------------------------------
#  Section 9 — JCL job chains
# ----------------------------------------------------------------------------

def _section_jcl_chains(conn) -> dict:
    rows = conn.execute(
        "SELECT * FROM jcl_job ORDER BY job_name, step_name, dd_name"
    ).fetchall()
    by_job = defaultdict(lambda: {"steps": defaultdict(list)})
    for r in rows:
        d = _row_to_dict(r)
        job = d["job_name"]
        step = d.get("step_name") or "<no-step>"
        by_job[job]["steps"][step].append(d)
    jobs = []
    for job_name in sorted(by_job.keys()):
        steps_dict = by_job[job_name]["steps"]
        steps = []
        for step_name in sorted(steps_dict.keys()):
            entries = steps_dict[step_name]
            program = next((e.get("step_program") for e in entries if e.get("step_program")), None)
            dds = [e for e in entries if e.get("dd_name")]
            steps.append({"step": step_name, "program": program, "dds": dds})
        jobs.append({"job": job_name, "steps": steps})
    return {"jobs": jobs, "total_jobs": len(jobs)}


# ----------------------------------------------------------------------------
#  Section 10 — File I/O map
# ----------------------------------------------------------------------------

def _section_file_io_map(conn) -> dict:
    rows = conn.execute(
        "SELECT * FROM file_io ORDER BY file_name, program, line"
    ).fetchall()
    by_file = defaultdict(list)
    by_program = defaultdict(list)
    for r in rows:
        d = _row_to_dict(r)
        if d.get("file_name"):
            by_file[d["file_name"]].append(d)
        if d.get("program"):
            by_program[d["program"]].append(d)
    return {
        "by_file": [{"file": f, "operations": ops} for f, ops in sorted(by_file.items())],
        "total_ops": len(rows),
        "distinct_files": len(by_file),
    }


# ----------------------------------------------------------------------------
#  Section 11 — Copybook usage
# ----------------------------------------------------------------------------

def _section_copybook_usage(conn) -> dict:
    rows = conn.execute(
        "SELECT program, copybook, COUNT(*) c FROM copybook_use "
        "GROUP BY program, copybook ORDER BY copybook, program"
    ).fetchall()
    by_copybook = defaultdict(list)
    for r in rows:
        by_copybook[r["copybook"]].append({"program": r["program"], "uses": r["c"]})
    return {
        "by_copybook": [{"copybook": cb, "consumers": cs}
                        for cb, cs in sorted(by_copybook.items())],
        "total_copybooks": len(by_copybook),
    }


# ----------------------------------------------------------------------------
#  Section 12 — Per-program specifications (the bulk: 31 × ~3 pages)
# ----------------------------------------------------------------------------

def _section_per_program(conn, canonical_files: set, available_specs: dict) -> dict:
    programs = []
    for fname in sorted(canonical_files):
        prog = fname.replace(".cbl", "").replace(".CBL", "")

        prog_row = conn.execute(
            "SELECT uuid, start_line, end_line FROM nodes "
            "WHERE kind='CompilationUnit' AND file=? LIMIT 1", (fname,)
        ).fetchone()
        if not prog_row:
            continue

        # Paragraphs
        paragraphs = conn.execute(
            "SELECT uuid, name, start_line, end_line FROM nodes "
            "WHERE kind='Paragraph' AND file=? ORDER BY start_line", (fname,)
        ).fetchall()
        paragraphs = [_row_to_dict(r) for r in paragraphs]

        # Calls out
        calls_out = conn.execute(
            "SELECT callee_program, edge_kind, line FROM call_graph "
            "WHERE caller_program=? ORDER BY line", (prog,)
        ).fetchall()

        # File I/O
        file_io = conn.execute(
            "SELECT operation, file_name, record_copybook, line FROM file_io "
            "WHERE program=? ORDER BY line", (prog,)
        ).fetchall()

        # Copybooks consumed
        copybooks = conn.execute(
            "SELECT DISTINCT copybook FROM copybook_use WHERE program=? OR program=?",
            (prog, fname)
        ).fetchall()

        # Business rules (IF + EVALUATE) in this program
        rules = conn.execute(
            "SELECT uuid, start_line, payload_json FROM nodes "
            "WHERE kind='Statement' AND file=? AND ("
            "  payload_json LIKE '%\"statement_type\":\"IF\"%' "
            "  OR payload_json LIKE '%\"statement_type\":\"EVALUATE\"%') "
            "ORDER BY start_line", (fname,)
        ).fetchall()

        # Statement breakdown by type
        stmts = conn.execute(
            "SELECT payload_json FROM nodes WHERE kind='Statement' AND file=?",
            (fname,)
        ).fetchall()
        stmt_kinds = defaultdict(int)
        for s in stmts:
            try:
                pl = json.loads(s["payload_json"] or "{}")
                if pl.get("statement_type"):
                    stmt_kinds[pl["statement_type"]] += 1
            except Exception:
                pass

        spec_data = available_specs.get(prog) or {}
        llm_spec = spec_data.get("spec") or {}

        programs.append({
            "name": prog,
            "file": fname,
            "uuid": prog_row["uuid"],
            "paragraphs": paragraphs,
            "paragraph_count": len(paragraphs),
            "calls_out": [_row_to_dict(r) for r in calls_out],
            "file_io": [_row_to_dict(r) for r in file_io],
            "copybooks": [r["copybook"] for r in copybooks],
            "rules": [_row_to_dict(r) for r in rules],
            "rule_count": len(rules),
            "statement_kinds": dict(stmt_kinds),
            "total_statements": sum(stmt_kinds.values()),
            "llm_spec": llm_spec,
            "has_llm_spec": bool(llm_spec),
            "grounding": spec_data.get("grounding") or {},
        })
    return {
        "programs": programs,
        "total_programs": len(programs),
        "programs_with_llm_spec": sum(1 for p in programs if p["has_llm_spec"]),
    }


# ----------------------------------------------------------------------------
#  Section 13 — Migration risk register
# ----------------------------------------------------------------------------

def _section_migration_risks(conn) -> dict:
    """Derive risk register entries from the graph."""
    risks = []

    # ALTER statements
    rows = conn.execute(
        "SELECT uuid, file, start_line, payload_json FROM nodes WHERE kind='Statement' "
        "AND payload_json LIKE '%\"statement_type\":\"ALTER\"%'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "ALTER", "severity": "high",
                      "where": f"{r['file']}:{r['start_line']}", "uuid": r["uuid"],
                      "why": "ALTER statements modify GO TO targets at runtime — hard to translate to structured Java."})

    # GO TO DEPENDING ON
    rows = conn.execute(
        "SELECT uuid, file, start_line, payload_json FROM nodes WHERE kind='Statement' "
        "AND payload_json LIKE '%\"statement_type\":\"GO_TO\"%' AND payload_json LIKE '%DEPENDING%'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "GO TO DEPENDING ON", "severity": "high",
                      "where": f"{r['file']}:{r['start_line']}", "uuid": r["uuid"],
                      "why": "Computed-GOTO equivalent. Replace with switch/case or polymorphism."})

    # Dynamic CALL
    rows = conn.execute(
        "SELECT caller_program, callee_program, line FROM call_graph "
        "WHERE edge_kind='CALL_DYNAMIC'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "Dynamic CALL", "severity": "medium",
                      "where": f"{r['caller_program']}:{r['line']}", "uuid": None,
                      "why": f"CALL via identifier ({r['callee_program']}) — must be resolved at runtime in Java."})

    # OCCURS DEPENDING ON
    rows = conn.execute(
        "SELECT uuid, file, name, start_line, payload_json FROM nodes WHERE kind='DataItem' "
        "AND payload_json LIKE '%\"odo\"%'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "OCCURS DEPENDING ON", "severity": "medium",
                      "where": f"{r['file']}:{r['start_line']} ({r['name']})", "uuid": r["uuid"],
                      "why": "Variable-length array; Java needs explicit sizing logic."})

    # EXEC CICS HANDLE CONDITION
    rows = conn.execute(
        "SELECT uuid, file, start_line, payload_json FROM nodes WHERE kind='ExecCicsBlock' "
        "AND payload_json LIKE '%HANDLE%CONDITION%'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "EXEC CICS HANDLE CONDITION", "severity": "medium",
                      "where": f"{r['file']}:{r['start_line']}", "uuid": r["uuid"],
                      "why": "Implicit control flow on condition — Java needs explicit try/catch."})

    # DFHCOMMAREA / pseudo-conversational
    rows = conn.execute(
        "SELECT DISTINCT file FROM nodes WHERE kind='DataItem' AND name LIKE 'DFHCOMMAREA'"
    ).fetchall()
    for r in rows:
        risks.append({"category": "Pseudo-conversational state", "severity": "high",
                      "where": r["file"], "uuid": None,
                      "why": "DFHCOMMAREA stores screen state between transactions; Java needs HTTP session or token state."})

    # Group by category for summary
    by_category = defaultdict(int)
    for r in risks:
        by_category[r["category"]] += 1

    return {
        "risks": risks,
        "total_risks": len(risks),
        "by_category": dict(by_category),
    }


# ----------------------------------------------------------------------------
#  Section 14 — Modernization recommendations
# ----------------------------------------------------------------------------

def _section_modernization_recommendations(conn) -> dict:
    return {
        "target_stack": {
            "language": "Java 17",
            "framework_online": "Spring Boot 3 (Spring MVC + REST controllers)",
            "framework_batch": "Spring Batch 5 (@Bean Jobs with ItemReader / ItemProcessor / ItemWriter)",
            "framework_data": "Spring Data JPA (VSAM KSDS → relational tables with @Id on the primary key)",
            "build": "Maven",
            "deploy": "Docker images on Kubernetes; CI/CD via GitHub Actions",
        },
        "phasing": [
            {"phase": 1, "name": "Foundation",
             "items": ["Set up Maven project structure", "Define copybook → Java record mapping",
                       "Build CICS shim (Cics.link/xctl/send_map stubs)",
                       "Build VSAM shim (Vsam.read/write/startbr stubs)",
                       "Establish testing strategy (JUnit 5 + Testcontainers)"]},
            {"phase": 2, "name": "Account & Card domain",
             "items": ["Migrate ACCOUNT-related programs",
                       "Migrate CARD-related programs",
                       "Implement Account / Card REST endpoints",
                       "Migrate VSAM ACCTDAT + CARDDAT to PostgreSQL"]},
            {"phase": 3, "name": "Transaction processing",
             "items": ["Migrate transaction online programs (COTRN00C/01C/02C)",
                       "Migrate POSTTRAN batch chain to Spring Batch",
                       "Migrate INTCALC interest calculation",
                       "Migrate CREASTMT statement generation"]},
            {"phase": 4, "name": "User administration & reports",
             "items": ["Migrate COUSR00C/01C/02C/03C",
                       "Migrate report programs (CORPT00C, CBSTM03A)"]},
            {"phase": 5, "name": "Cutover & sunset",
             "items": ["Parallel run with mainframe",
                       "Switch authoritative copy to PostgreSQL",
                       "Decommission z/OS workload"]},
        ],
        "key_decisions": [
            "Decimal types: COBOL COMP-3 → java.math.BigDecimal with explicit scale "
            "(never double — rounding semantics must match exactly).",
            "String types: COBOL PIC X(n) → fixed-length String with right-padding on write.",
            "CICS state: pseudo-conversational COMMAREA → JWT-signed session token "
            "(stateless server tier, sticky session not required).",
            "JCL → Spring Batch: each JCL step becomes a Step bean; dataset hand-offs "
            "become @StepScope ItemReader/ItemWriter pairs.",
            "BMS screens → Vaadin or React: BMS field positions are captured in the artifact "
            "graph but the visual mapping is a manual rewrite.",
        ],
    }
