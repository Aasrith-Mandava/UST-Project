"""
Forward-engineering stretch: emit a Java skeleton for a single COBOL program.

Approach (intentionally minimal, per Day 5 plan):
  - one Java class named after the COBOL program
  - one method per paragraph (Java identifier sanitized)
  - data items become Java fields with types lowered from PIC clauses
      DISPLAY alphanumeric  -> String
      DISPLAY numeric       -> long  (or int if length <=9 and unsigned)
      COMP / COMP-4 / BINARY -> long
      COMP-3 / PACKED       -> BigDecimal (precision + scale from PIC)
      Group items           -> nested class (placeholder)
  - PERFORM target paragraph X -> this.x();
  - EXEC CICS LINK/XCTL PROGRAM('Y') -> Cics.link("Y") / Cics.xctl("Y") (stub)
  - EXEC CICS READ/WRITE FILE('F') -> Vsam.read("F") / Vsam.write("F") (stub)

The point is to demonstrate the *contract* the structured artifacts establish for
forward engineering. The emitter does NOT translate business logic; it produces a
typed shell whose body is filled with TODOs referencing the source UUIDs so a
human (or further LLM pass) can fill in semantics.
"""
from __future__ import annotations

import argparse
import json
import re
import sys
from pathlib import Path
from typing import Any

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from api.database import connect
from llm.cobol_lower import extract_pic_clauses, pic_to_java_type, translate_statement


def _load_llm_spec(program_name: str) -> dict | None:
    """Load demo/program_spec_<NAME>.json if a prior LLM pass produced it.

    Returns the parsed spec dict (with keys overview, responsibilities, paragraphs[], ...)
    or None if the spec is missing or the LLM output didn't parse as JSON.
    """
    spec_path = ROOT / "demo" / f"program_spec_{program_name}.json"
    if not spec_path.is_file():
        return None
    try:
        wrapper = json.loads(spec_path.read_text())
    except Exception:
        return None
    return wrapper.get("spec") if isinstance(wrapper, dict) else None


def _load_paragraph_specs(program_name: str) -> dict[str, dict]:
    """Load any paragraph-level specs for this program, keyed by paragraph name.

    Currently the demo only emits one paragraph spec at demo/paragraph_spec.json,
    targeting COTRN02C/VALIDATE-INPUT-DATA-FIELDS. We pick it up if its
    program_name matches.
    """
    out: dict[str, dict] = {}
    spec_path = ROOT / "demo" / "paragraph_spec.json"
    if not spec_path.is_file():
        return out
    try:
        wrapper = json.loads(spec_path.read_text())
    except Exception:
        return out
    spec = wrapper.get("spec") if isinstance(wrapper, dict) else None
    if not spec:
        return out
    if spec.get("program_name") == program_name and spec.get("paragraph_name"):
        out[spec["paragraph_name"]] = spec
    return out


def _wrap_javadoc(text: str, indent: str = "     ") -> str:
    """Format a string as wrapped Javadoc body lines (each prefixed with ' * ')."""
    if not text:
        return f"{indent}* (no description)"
    out = []
    for paragraph in str(text).split("\n"):
        words = paragraph.strip().split()
        line = ""
        for w in words:
            if len(line) + len(w) + 1 > 90:
                out.append(f"{indent}* {line}")
                line = w
            else:
                line = (line + " " + w).strip()
        if line:
            out.append(f"{indent}* {line}")
    return "\n".join(out) if out else f"{indent}*"


def emit(program_name: str, out_dir: Path) -> Path:
    with connect() as conn:
        prog = conn.execute(
            "SELECT * FROM nodes WHERE kind='CompilationUnit' AND name=?",
            (program_name,)
        ).fetchone()
        if not prog:
            raise SystemExit(f"Program {program_name} not found in nodes table.")
        program_file = prog["file"]
        paragraphs = conn.execute(
            "SELECT uuid, name, start_line, end_line FROM nodes "
            "WHERE file=? AND kind='Paragraph' ORDER BY start_line",
            (program_file,)
        ).fetchall()
        data_items = conn.execute(
            "SELECT uuid, name, payload_json FROM nodes "
            "WHERE file=? AND kind='DataItem' AND name IS NOT NULL ORDER BY start_line",
            (program_file,)
        ).fetchall()
        # Control flow edges -> PERFORM targets
        cf = conn.execute(
            "SELECT from_paragraph, to_paragraph, edge_kind, line FROM control_flow WHERE program=? ORDER BY line",
            (program_name,)
        ).fetchall()
        # File I/O grouped by paragraph (we use line ranges from paragraphs)
        file_io = conn.execute(
            "SELECT operation, file_name, line FROM file_io WHERE program=? ORDER BY line",
            (program_name,)
        ).fetchall()
        # Outgoing calls
        calls = conn.execute(
            "SELECT callee_program, edge_kind, line FROM call_graph WHERE caller_program=? ORDER BY line",
            (program_name,)
        ).fetchall()
        # Statement payloads, keyed by parent paragraph uuid (so we can translate each)
        stmt_rows = conn.execute(
            "SELECT parent_uuid, start_line, payload_json FROM nodes "
            "WHERE file=? AND kind='Statement' ORDER BY start_line",
            (program_file,)
        ).fetchall()

    statements_by_paragraph: dict[str, list[dict]] = {}
    for r in stmt_rows:
        payload = json.loads(r["payload_json"]) if r["payload_json"] else {}
        statements_by_paragraph.setdefault(r["parent_uuid"], []).append({
            "line": r["start_line"],
            "statement_type": payload.get("statement_type", ""),
            "text": payload.get("text", ""),
        })

    # Pull PIC clauses for every named data item by scanning the COBOL source.
    # This is local code generation; rule 1 (no source to LLM) is untouched.
    di_names = [r["name"] for r in data_items if r["name"]]
    pic_meta = extract_pic_clauses(program_file, di_names)

    classname = _sanitize(program_name, capitalize=True)
    fields_src = _fields(data_items, pic_meta)
    llm_spec = _load_llm_spec(program_name)
    spec_by_name = {p.get("name"): p for p in (llm_spec or {}).get("paragraphs", []) if p.get("name")}
    paragraph_specs = _load_paragraph_specs(program_name)

    methods_src = []
    for p in paragraphs:
        pname = p["name"] or f"para_{p['start_line']}"
        java_name = _sanitize(pname, capitalize=False)
        sl, el = p["start_line"], p["end_line"]
        para_spec = paragraph_specs.get(pname)
        para_stmts = statements_by_paragraph.get(p["uuid"], [])
        body = _body_for_paragraph(java_name, sl, el, p["uuid"], cf, file_io, calls, para_spec, para_stmts)
        spec_entry = spec_by_name.get(pname)
        if spec_entry:
            purpose = spec_entry.get("purpose", "")
            hint = spec_entry.get("java_method_hint", "")
            doc = (
                f"    /**\n"
                f"{_wrap_javadoc(purpose, '     ')}\n"
                f"     *\n"
                f"     * <p><strong>Java implementation hint (from LLM spec):</strong>\n"
                f"{_wrap_javadoc(hint, '     ')}\n"
                f"     *\n"
                f"     * <p>Source: {pname} (uuid:{p['uuid']}, lines {sl}-{el}).\n"
                f"     */\n"
            )
        else:
            doc = f"    /** {pname}  (uuid:{p['uuid']}, source lines {sl}-{el}). */\n"
        methods_src.append(doc + f"    public void {java_name}() {{\n{body}    }}\n")

    class_javadoc = _build_class_javadoc(program_name, program_file, llm_spec)

    # Auto-stub: any identifier referenced as `this.<x>` in any method body but
    # not declared as a field gets a no-op `Object` stub so the file compiles.
    # These cover CICS-supplied identifiers (EIBCALEN, EIBAID, ...), copybook
    # fields whose PIC we couldn't reach, and qualified-name leaves.
    declared = {_sanitize(di["name"], False) for di in data_items if di["name"]}
    referenced = set()
    for body_block in methods_src:
        referenced.update(re.findall(r"\bthis\.([a-zA-Z_][a-zA-Z0-9_]*)\b", body_block))
    method_names = {_sanitize(p["name"], False) for p in paragraphs if p["name"]}
    undeclared = sorted(referenced - declared - method_names)
    auto_stubs = "\n".join(
        f"    public Object {n};  // auto-stub for undeclared reference"
        for n in undeclared
    )

    java = (
        f"// Generated from {program_file} - COBOL Parser (forward engineering).\n"
        f"// Chain: parsed artifacts -> LLM program spec -> Java skeleton with translated\n"
        f"// MOVE/SET/ADD/IF/DISPLAY/PERFORM/CALL statements (where statically safe).\n"
        f"// Class/method Javadocs come from the LLM spec at\n"
        f"// demo/program_spec_{program_name}.json (grounded in the SQLite artifact graph).\n"
        f"package com.carddemo.generated;\n\n"
        f"import java.math.BigDecimal;\nimport java.math.BigInteger;\n\n"
        f"{class_javadoc}"
        f"public class {classname} {{\n\n"
        f"{fields_src}\n"
        + ("\n    // --- auto-generated stubs for undeclared references ---\n"
           f"{auto_stubs}\n\n" if auto_stubs else "")
        + "\n".join(methods_src)
        + f"\n    public static void main(String[] args) {{\n"
        f"        new {classname}().mainPara();\n"
        f"    }}\n\n"
        f"    // --- stubs for unresolved mainframe primitives (placeholders) ---\n"
        f"    static final class Cics {{\n"
        f"        static void link(String program) {{ /* TODO: dispatch */ }}\n"
        f"        static void xctl(String program) {{ /* TODO: transfer */ }}\n"
        f"    }}\n"
        f"    static final class Vsam {{\n"
        f"        static void read(String file) {{ /* TODO */ }}\n"
        f"        static void write(String file) {{ /* TODO */ }}\n"
        f"        static void rewrite(String file) {{ /* TODO */ }}\n"
        f"        static void delete(String file) {{ /* TODO */ }}\n"
        f"        static void startbr(String file) {{ /* TODO */ }}\n"
        f"        static void readnext(String file) {{ /* TODO */ }}\n"
        f"        static void readprev(String file) {{ /* TODO */ }}\n"
        f"        static void endbr(String file) {{ /* TODO */ }}\n"
        f"    }}\n"
        f"}}\n"
    )
    out_dir.mkdir(parents=True, exist_ok=True)
    out_file = out_dir / f"{classname}.java"
    out_file.write_text(java)
    return out_file


def _build_class_javadoc(program_name: str, program_file: str, spec: dict | None) -> str:
    if not spec:
        return (
            f"/**\n"
            f" * {program_name} (no LLM spec available).\n"
            f" *\n"
            f" * <p>Forward-engineered skeleton from the parsed artifact graph only —\n"
            f" * run the LLM pipeline phase to enrich this Javadoc.\n"
            f" *\n"
            f" * <p>Source file: {program_file}\n"
            f" */\n"
        )
    parts = ["/**\n"]
    overview = spec.get("overview", "")
    parts.append(_wrap_javadoc(overview, " ") + "\n")
    resp = spec.get("responsibilities") or []
    if resp:
        parts.append(" *\n * <p><strong>Responsibilities:</strong>\n * <ul>\n")
        for r in resp:
            parts.append(f" *   <li>{r}\n")
        parts.append(" * </ul>\n")
    deps = spec.get("external_dependencies") or {}
    if deps:
        parts.append(" *\n * <p><strong>External dependencies:</strong>\n * <ul>\n")
        for k in ("called_programs", "files", "copybooks"):
            vals = deps.get(k) or []
            if vals:
                parts.append(f" *   <li>{k.replace('_', ' ')}: {', '.join(vals)}\n")
        parts.append(" * </ul>\n")
    risks = spec.get("migration_risks") or []
    if risks:
        parts.append(" *\n * <p><strong>Migration risks:</strong>\n * <ul>\n")
        for r in risks:
            parts.append(f" *   <li>{r}\n")
        parts.append(" * </ul>\n")
    parts.append(f" *\n * <p>Source file: {program_file}\n")
    parts.append(" */\n")
    return "".join(parts)


def _body_for_paragraph(name, sl, el, para_uuid, cf, file_io, calls, para_spec=None, statements=None):
    body = []
    # If a paragraph-level LLM spec is available, lead the body with its pseudocode
    # and key-decisions as structured comments — these guide the developer through
    # what the method needs to do before they see the mechanical edges below.
    if para_spec:
        pseudocode = para_spec.get("java_implementation", {}).get("pseudocode") or []
        decisions = para_spec.get("java_implementation", {}).get("key_decisions") or []
        if pseudocode:
            body.append("        // --- Pseudocode (from grounded LLM paragraph spec) ---")
            for i, step in enumerate(pseudocode, 1):
                body.append(f"        // {i}. {step}")
        if decisions:
            body.append("        //")
            body.append("        // --- Key decisions ---")
            for d in decisions:
                body.append(f"        //  - {d}")
        if pseudocode or decisions:
            body.append("        // --- Translated COBOL statements ---")

    # Translate each statement in line order. This is the substantive forward-
    # engineering work: MOVE/SET/ADD/COMPUTE/IF/EVALUATE/DISPLAY/PERFORM/CALL etc.
    # become Java lines (best-effort). Anything we can't translate stays as a
    # comment with the original COBOL preserved.
    if statements:
        for s in statements:
            stype = s.get("statement_type") or ""
            text = s.get("text") or ""
            translated = translate_statement(stype, text, _sanitize)
            for line in translated:
                body.append(f"        {line}")
        return "\n".join(body) + "\n" if body else "        // (empty paragraph)\n"

    # Fallback path (no statements provided): emit mechanical edges only.
    # PERFORMs originating from this paragraph (matched by line range)
    for e in cf:
        if e["from_paragraph"] and _matches_paragraph(e, sl, el):
            target_name = e["to_paragraph"]
            if target_name:
                body.append(f"        this.{_sanitize(target_name, False)}();  // PERFORM line {e['line']}")
    # File I/O within this paragraph's line range
    for f in file_io:
        if sl <= f["line"] <= el:
            op = (f["operation"] or "READ").lower()
            body.append(f'        Vsam.{op}("{f["file_name"]}");  // line {f["line"]}')
    # Calls within line range
    for c in calls:
        if sl <= c["line"] <= el:
            ek = c["edge_kind"]
            if ek == "CALL_STATIC":
                body.append(f'        // CALL {c["callee_program"]}() line {c["line"]}')
            elif ek in ("CICS_LINK", "CICS_XCTL"):
                verb = ek.split("_")[-1].lower()
                body.append(f'        Cics.{verb}("{c["callee_program"]}");  // line {c["line"]}')
    if not body:
        body.append(f"        // TODO: implement {name}.  See uuid:{para_uuid}")
    return "\n".join(body) + "\n"


def _matches_paragraph(edge, sl, el):
    return sl <= (edge["line"] or 0) <= el


def _fields(data_items, pic_meta: dict | None = None) -> str:
    pic_meta = pic_meta or {}
    lines = []
    for di in data_items:
        name = di["name"]
        if not name or not _is_valid_id_root(name):
            continue
        payload = json.loads(di["payload_json"]) if di["payload_json"] else {}
        level = payload.get("level", 0)
        # Skip 88-level (conditions) and 66-level (renames)
        if level in (88, 66):
            continue
        java_name = _sanitize(name, capitalize=False)
        # Prefer the real PIC clause we extracted from source; fall back to the
        # name-suffix heuristic if the data item isn't found (e.g. copybook
        # we couldn't reach, or FILLER).
        meta = pic_meta.get(name.upper())
        if meta:
            java_type = pic_to_java_type(meta)
            pic_doc = f"PIC {meta.get('pic','?')}" + (f" {meta['usage']}" if meta.get("usage") else "")
        else:
            java_type = _pic_to_type(payload)
            pic_doc = "PIC unknown — fell back to name-suffix heuristic"
        lines.append(f"    /** {name} (uuid:{di['uuid']}, level {level}, {pic_doc}). */")
        lines.append(f"    public {java_type} {java_name};")
        lines.append("")
    return "\n".join(lines) if lines else "    // (no data items detected)\n"


def _pic_to_type(payload: dict) -> str:
    entry_type = payload.get("entry_type") or "SCALAR"
    if entry_type == "GROUP":
        return "Object /* group item - nested class placeholder */"
    # We don't currently capture PIC/USAGE in payload; default sensibly.
    # If a future pass enriches data items with canonical_type, key off that.
    name = payload.get("name", "")
    # crude heuristic from name suffixes
    if name.endswith(("-AMT", "-AMOUNT", "-RATE", "-PCT", "-PERCENT", "-BAL", "-BALANCE")):
        return "BigDecimal"
    if name.endswith(("-NUM", "-NO", "-COUNT", "-CT", "-IDX")):
        return "long"
    return "String"


_IDENT_RE = re.compile(r"[A-Za-z][A-Za-z0-9_-]*")


def _is_valid_id_root(s: str) -> bool:
    return bool(_IDENT_RE.match(s))


def _sanitize(name: str, capitalize: bool) -> str:
    parts = re.split(r"[-_\s]+", name)
    parts = [p for p in parts if p]
    if not parts:
        return "x"
    if capitalize:
        return "".join(p[0].upper() + p[1:].lower() for p in parts)
    first = parts[0].lower()
    rest = "".join(p[0].upper() + p[1:].lower() for p in parts[1:])
    out = first + rest
    if out and out[0].isdigit():
        out = "p" + out
    return out


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("program")
    parser.add_argument("--out", default="demo/java")
    args = parser.parse_args()
    p = emit(args.program, Path(args.out))
    print(f"wrote {p}")


if __name__ == "__main__":
    main()
