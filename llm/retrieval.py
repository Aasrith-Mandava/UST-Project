"""
Given a UUID (paragraph, program) or a name, assemble a structured context packet
that the LLM can use to generate a spec.

Rule 1 of the architecture: no raw source goes to the LLM. We pass typed artifacts:
  - the paragraph AST (uuid + line range + statement list with verbs + args)
  - the data items it touches (with canonical type info)
  - its def-use chain (read/write sites)
  - its outgoing call targets (CALL / CICS LINK / XCTL)
  - the file I/O it performs
  - business rules / IF / EVALUATE statements it contains

The output is a JSON-serializable dict the LLM consumes verbatim.
"""
from __future__ import annotations

import json
from typing import Any

from api.database import connect, row_to_dict, rows_to_dicts


def paragraph_packet(paragraph_uuid: str) -> dict[str, Any]:
    with connect() as conn:
        para = conn.execute("SELECT * FROM nodes WHERE uuid=? AND kind='Paragraph'", (paragraph_uuid,)).fetchone()
        if not para:
            raise ValueError(f"Paragraph not found: {paragraph_uuid}")
        program_file = para["file"]
        program_row = conn.execute(
            "SELECT uuid, name FROM nodes WHERE file=? AND kind='ProgramUnit' LIMIT 1", (program_file,)
        ).fetchone()
        program_name = program_row["name"] if program_row else program_file.replace(".cbl", "").replace(".CBL", "")

        statements = conn.execute(
            "SELECT uuid, kind, start_line, end_line, payload_json FROM nodes "
            "WHERE parent_uuid=? AND kind IN ('Statement','ExecCicsBlock','ExecSqlBlock') "
            "ORDER BY start_line", (paragraph_uuid,)
        ).fetchall()
        statements = rows_to_dicts(statements)
        for s in statements:
            # Keep payload compact - only what the LLM needs
            pl = s.get("payload") or {}
            s["statement_type"] = pl.get("statement_type")
            s["verb"] = pl.get("verb")
            s["args"] = pl.get("args")
            s["text"] = pl.get("text")
            s.pop("payload", None)

        # Identifiers in this paragraph (cheap proxy: anything we see in statement text)
        identifiers = sorted({
            ident for s in statements
            for ident in _identifiers_in(s.get("text", ""))
            if ident and ident != program_name
        })
        # Data items defined in the same program
        data_items = conn.execute(
            "SELECT uuid, name, payload_json FROM nodes "
            "WHERE file=? AND kind='DataItem' AND name IN ({}) ".format(
                ",".join("?" * len(identifiers)) if identifiers else "NULL"
            ),
            (program_file, *identifiers) if identifiers else (program_file,)
        ).fetchall() if identifiers else []
        data_items = rows_to_dicts(data_items)
        for di in data_items:
            pl = di.get("payload") or {}
            di["level"] = pl.get("level")
            di["entry_type"] = pl.get("entry_type")
            di.pop("payload", None)

        # Def-use chain entries that fall inside this paragraph's line range
        sl, el = para["start_line"], para["end_line"]
        def_use = conn.execute(
            "SELECT data_item_name, access_kind, statement_kind, line, site_uuid "
            "FROM def_use WHERE program=? AND line BETWEEN ? AND ? ORDER BY line",
            (program_name, sl, el)
        ).fetchall()

        # File I/O inside this paragraph
        file_io = conn.execute(
            "SELECT operation, file_name, record_copybook, line, site_uuid FROM file_io "
            "WHERE program=? AND line BETWEEN ? AND ? ORDER BY line",
            (program_name, sl, el)
        ).fetchall()

        # Outgoing calls from this paragraph
        calls = conn.execute(
            "SELECT callee_program, edge_kind, line, caller_site_uuid FROM call_graph "
            "WHERE caller_program=? AND line BETWEEN ? AND ? ORDER BY line",
            (program_name, sl, el)
        ).fetchall()

        # Outgoing PERFORM edges
        cf = conn.execute(
            "SELECT to_paragraph, to_paragraph_uuid, edge_kind, line, site_uuid FROM control_flow "
            "WHERE program=? AND from_paragraph_uuid=? ORDER BY line",
            (program_name, paragraph_uuid)
        ).fetchall()

    return {
        "paragraph": row_to_dict(para),
        "program_name": program_name,
        "program_file": program_file,
        "statements": statements,
        "data_items": data_items,
        "def_use": rows_to_dicts(def_use),
        "file_io": rows_to_dicts(file_io),
        "calls": rows_to_dicts(calls),
        "control_flow": rows_to_dicts(cf),
    }


def program_packet(program_name: str) -> dict[str, Any]:
    """Assemble a whole-program packet for program-level spec generation.

    Drives forward engineering: the LLM produces a structured program spec
    (overview + one-line purpose per paragraph) that the Java emitter then
    embeds as class/method Javadoc.
    """
    with connect() as conn:
        prog = conn.execute(
            "SELECT * FROM nodes WHERE kind='CompilationUnit' AND name=?",
            (program_name,),
        ).fetchone()
        if not prog:
            raise ValueError(f"Program not found: {program_name}")
        program_file = prog["file"]

        paragraphs = conn.execute(
            "SELECT uuid, name, start_line, end_line FROM nodes "
            "WHERE file=? AND kind='Paragraph' AND name IS NOT NULL ORDER BY start_line",
            (program_file,),
        ).fetchall()
        paragraphs = rows_to_dicts(paragraphs)

        # Lightweight per-paragraph stats: # statements, file_io count, calls count
        for p in paragraphs:
            sl, el = p["start_line"], p["end_line"]
            p["statement_count"] = conn.execute(
                "SELECT COUNT(*) c FROM nodes "
                "WHERE parent_uuid=? AND kind IN ('Statement','ExecCicsBlock','ExecSqlBlock')",
                (p["uuid"],),
            ).fetchone()["c"]
            p["file_io_count"] = conn.execute(
                "SELECT COUNT(*) c FROM file_io WHERE program=? AND line BETWEEN ? AND ?",
                (program_name, sl, el),
            ).fetchone()["c"]
            p["call_count"] = conn.execute(
                "SELECT COUNT(*) c FROM call_graph WHERE caller_program=? AND line BETWEEN ? AND ?",
                (program_name, sl, el),
            ).fetchone()["c"]

        calls = conn.execute(
            "SELECT callee_program, edge_kind, line, caller_site_uuid FROM call_graph "
            "WHERE caller_program=? ORDER BY line",
            (program_name,),
        ).fetchall()
        file_io = conn.execute(
            "SELECT operation, file_name, record_copybook, line FROM file_io "
            "WHERE program=? ORDER BY line",
            (program_name,),
        ).fetchall()
        control_flow = conn.execute(
            "SELECT edge_kind, from_paragraph, to_paragraph, line FROM control_flow "
            "WHERE program=? ORDER BY line",
            (program_name,),
        ).fetchall()
        copybooks = conn.execute(
            "SELECT DISTINCT copybook FROM copybook_use WHERE program=? OR program=?",
            (program_name, program_name + ".cbl"),
        ).fetchall()

    return {
        "program": row_to_dict(prog),
        "program_name": program_name,
        "program_file": program_file,
        "paragraphs": paragraphs,
        "calls": rows_to_dicts(calls),
        "file_io": rows_to_dicts(file_io),
        "control_flow": rows_to_dicts(control_flow),
        "copybooks": [r["copybook"] for r in copybooks],
    }


def batch_chain_packet(job_names: list[str]) -> dict[str, Any]:
    """Assemble context for a chain of batch jobs."""
    with connect() as conn:
        jobs = []
        for job in job_names:
            steps = conn.execute(
                "SELECT DISTINCT step_name, step_program FROM jcl_job WHERE job_name=? ORDER BY step_name",
                (job,)
            ).fetchall()
            dds = conn.execute(
                "SELECT step_name, dd_name, dsn, disp FROM jcl_job "
                "WHERE job_name=? AND dd_name IS NOT NULL ORDER BY step_name, dd_name",
                (job,)
            ).fetchall()
            # for each program, gather its file I/O and outgoing calls
            programs = []
            for s in steps:
                pname = s["step_program"]
                if not pname:
                    continue
                # program UUID (the CompilationUnit node for this program)
                prog_row = conn.execute(
                    "SELECT uuid FROM nodes WHERE kind='CompilationUnit' AND (name=? OR file=? OR file=?) LIMIT 1",
                    (pname, pname + ".cbl", pname + ".CBL")
                ).fetchone()
                program_uuid = prog_row["uuid"] if prog_row else None
                file_io = conn.execute(
                    "SELECT operation, file_name, record_copybook, line, site_uuid FROM file_io "
                    "WHERE program=? ORDER BY line", (pname,)
                ).fetchall()
                calls = conn.execute(
                    "SELECT callee_program, edge_kind, line, caller_site_uuid FROM call_graph WHERE caller_program=? ORDER BY line",
                    (pname,)
                ).fetchall()
                copybooks = conn.execute(
                    "SELECT DISTINCT copybook FROM copybook_use WHERE program=? OR program=?",
                    (pname, pname + ".cbl")
                ).fetchall()
                programs.append({
                    "name": pname,
                    "uuid": program_uuid,
                    "step": s["step_name"],
                    "file_io": rows_to_dicts(file_io),
                    "calls": rows_to_dicts(calls),
                    "copybooks": [r["copybook"] for r in copybooks],
                })
            # cross-job dependencies into and out of this job
            upstream = conn.execute(
                "SELECT upstream_job, upstream_step, dataset, edge_uuid FROM jcl_dependency WHERE downstream_job=?",
                (job,)
            ).fetchall()
            downstream = conn.execute(
                "SELECT downstream_job, downstream_step, dataset, edge_uuid FROM jcl_dependency WHERE upstream_job=?",
                (job,)
            ).fetchall()
            jobs.append({
                "job_name": job,
                "steps": rows_to_dicts(steps),
                "dds": rows_to_dicts(dds),
                "programs": programs,
                "upstream_dependencies": rows_to_dicts(upstream),
                "downstream_dependencies": rows_to_dicts(downstream),
            })
    return {"chain": job_names, "jobs": jobs}


def _identifiers_in(text: str) -> list[str]:
    import re
    return [m.group() for m in re.finditer(r"[A-Z][A-Z0-9_-]*", text or "")]
