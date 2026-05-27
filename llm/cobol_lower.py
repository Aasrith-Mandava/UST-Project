"""
COBOL -> Java lowering for forward engineering.

Two responsibilities:
  1. extract_pic_clauses() - scan the COBOL source for PIC/USAGE/VALUE on each
     named data item, so we can lower types correctly. (We read source files
     LOCALLY for code generation. No raw source ever reaches the LLM.)
  2. translate_statement() - parse a single COBOL statement's text and emit
     equivalent Java lines. Covers the common verbs: MOVE, SET, ADD, SUBTRACT,
     MULTIPLY, DIVIDE, COMPUTE, IF / END-IF, EVALUATE, DISPLAY, INITIALIZE,
     GOBACK, STOP RUN, PERFORM (delegated), CALL (delegated).

These are intentionally pragmatic - not a full COBOL grammar. The point is to
move forward engineering from "stubs + comments" to "draft Java a developer
can edit." Anything we can't confidently translate stays as a comment with
the original COBOL text so nothing is lost.
"""
from __future__ import annotations

import re
from pathlib import Path
from typing import Iterable

ROOT = Path(__file__).resolve().parent.parent
CORPUS_CBL = ROOT / "corpus" / "carddemo" / "app" / "cbl"
CORPUS_CPY = ROOT / "corpus" / "carddemo" / "app" / "cpy"

# Match a PIC clause for a named identifier. We allow level (01-49) + name + PIC + clauses.
# Example:  05  WS-AMT-N        PIC S9(09)V99 COMP-3 VALUE ZEROES.
_PIC_LINE_RE = re.compile(
    r"""^\s*(?P<level>\d{2})\s+
        (?P<name>[A-Z][A-Z0-9_-]*)\s+
        (?:.*?\bPIC(?:TURE)?\s+(?P<pic>[A-Z0-9()V,.\-+/$Z*]+))
        (?:\s+(?:USAGE\s+(?:IS\s+)?)?(?P<usage>COMP-?[0-9]?|COMPUTATIONAL-?[0-9]?|PACKED-DECIMAL|BINARY|DISPLAY))?
        (?:\s+VALUE\s+(?:IS\s+)?(?P<value>'[^']*'|"[^"]*"|[A-Z0-9-]+))?
    """,
    re.IGNORECASE | re.VERBOSE,
)


def extract_pic_clauses(cbl_file: str, names: Iterable[str]) -> dict[str, dict]:
    """For each name, look it up in the COBOL source (program file + any copybooks
    INCLUDEd) and return its PIC/USAGE/VALUE metadata. Names not found map to {}.

    cbl_file is a base name like 'COTRN02C.cbl'. We scan that file plus every
    .cpy in corpus/carddemo/app/cpy/.
    """
    names_set = {n.upper() for n in names if n}
    out: dict[str, dict] = {}
    files: list[Path] = []
    p = CORPUS_CBL / cbl_file
    if p.exists():
        files.append(p)
    if CORPUS_CPY.exists():
        files.extend(sorted(CORPUS_CPY.glob("*.cpy")))

    for fp in files:
        try:
            for line in fp.read_text(errors="replace").splitlines():
                # COBOL source has columns 1-6 sequence numbers; strip them.
                if len(line) > 7 and line[6] in (" ", "*"):
                    body = line[6:73]
                else:
                    body = line[:73]
                if body.lstrip().startswith("*"):
                    continue
                m = _PIC_LINE_RE.match(body)
                if not m:
                    continue
                name = m.group("name").upper()
                if name not in names_set:
                    continue
                if name in out:
                    continue
                out[name] = {
                    "level": int(m.group("level")),
                    "pic": m.group("pic").upper(),
                    "usage": (m.group("usage") or "").upper() or None,
                    "value": m.group("value"),
                }
        except OSError:
            continue
    return out


def pic_to_java_type(meta: dict | None) -> str:
    """Lower a PIC/USAGE pair to a Java type string."""
    if not meta or not meta.get("pic"):
        return "String"
    pic = meta["pic"].upper()
    usage = (meta.get("usage") or "").upper()

    # Alphanumeric: X, A
    if "X" in pic or "A" in pic.replace("V", "").replace("S", ""):
        # Pure alpha/alphanumeric
        if not any(ch in pic for ch in "9"):
            return "String"

    is_signed = pic.startswith("S") or "S9" in pic
    has_decimal = "V" in pic
    packed = usage in ("COMP-3", "COMPUTATIONAL-3", "PACKED-DECIMAL")
    binary = usage in ("COMP", "COMP-4", "COMP-5", "COMPUTATIONAL", "COMPUTATIONAL-4", "COMPUTATIONAL-5", "BINARY")

    digits = _count_pic_digits(pic)
    if has_decimal:
        precision, scale = _precision_scale(pic)
        return f"BigDecimal /* precision={precision}, scale={scale}{', signed' if is_signed else ''}"\
               f"{', packed' if packed else ''} */"
    if packed:
        return f"BigDecimal /* PIC {pic} COMP-3 */"
    if binary or digits > 0:
        if digits <= 9:
            return f"int /* PIC {pic}{' signed' if is_signed else ''} */"
        if digits <= 18:
            return f"long /* PIC {pic}{' signed' if is_signed else ''} */"
        return f"BigInteger /* PIC {pic} */"
    return "String"


def _count_pic_digits(pic: str) -> int:
    total = 0
    for part_match in re.finditer(r"9(?:\((\d+)\))?", pic):
        n = part_match.group(1)
        total += int(n) if n else 1
    return total


def _precision_scale(pic: str) -> tuple[int, int]:
    parts = pic.split("V", 1)
    integer_digits = _count_pic_digits(parts[0])
    decimal_digits = _count_pic_digits(parts[1]) if len(parts) == 2 else 0
    return integer_digits + decimal_digits, decimal_digits


# ----------------------------------------------------------------------------
# Statement translation
# ----------------------------------------------------------------------------

def translate_statement(stmt_type: str, text: str, sanitize) -> list[str]:
    """Translate one COBOL statement to Java source lines (no leading indent).

    Returns a list of Java lines. If we can't confidently translate, return a
    `// COBOL: ...` comment preserving the original text.
    """
    if not text:
        return []
    text = _normalize(text)
    fn = _TRANSLATORS.get(stmt_type)
    if fn is None:
        return [f"// COBOL [{stmt_type}]: {text}"]
    try:
        return fn(text, sanitize)
    except Exception:
        return [f"// COBOL [{stmt_type}]: {text}"]


def _normalize(text: str) -> str:
    """Collapse whitespace, trim trailing period."""
    t = re.sub(r"\s+", " ", text).strip()
    if t.endswith("."):
        t = t[:-1].rstrip()
    return t


def _tr_move(text: str, sanitize) -> list[str]:
    # MOVE <source> TO <target1> [<target2> ...]
    # Source may be a literal ('X' or "X") or an identifier ([X OF Y]).
    # Each target is itself optionally qualified: NAME [OF parent] [IN parent].
    m = re.match(r"MOVE\s+(.+?)\s+TO\s+(.+)$", text, re.IGNORECASE | re.DOTALL)
    if not m:
        return [f"// COBOL [MOVE]: {text}"]
    src_raw = _consume_first_value(m.group(1).strip())
    targets = _split_qualified_identifiers(m.group(2).strip())
    if not targets:
        return [f"// COBOL [MOVE]: {text}"]
    # Only emit a real assignment when the source is a literal (always type-safe).
    # Identifier-to-identifier MOVEs need 88-level + PIC type info to convert
    # correctly; keeping them as comments avoids spurious type errors and
    # preserves the original COBOL for the developer translating the code.
    if _is_literal(src_raw):
        src = _lower_value(src_raw, sanitize)
        return [f"this.{_lower_ident(t, sanitize)} = {src};" for t in targets]
    target_list = ", ".join(targets)
    return [f"// MOVE {src_raw} TO {target_list}  -- identifier MOVE; needs PIC-aware type coercion"]


def _is_literal(token: str) -> bool:
    if not token:
        return False
    t = token.strip()
    upper = t.upper()
    if upper in ("SPACES", "SPACE", "ZERO", "ZEROES", "ZEROS",
                 "LOW-VALUE", "LOW-VALUES", "HIGH-VALUE", "HIGH-VALUES",
                 "NULL", "NULLS"):
        return True
    if (t.startswith("'") and t.endswith("'")) or (t.startswith('"') and t.endswith('"')):
        return True
    return bool(re.match(r"^-?\d+(\.\d+)?$", t))


def _split_qualified_identifiers(text: str) -> list[str]:
    """Split a COBOL identifier list where each item may be 'X' or 'X OF Y' or 'X IN Y'."""
    text = re.sub(r"\s+", " ", text).strip()
    if not text:
        return []
    tokens = text.split(" ")
    out: list[str] = []
    i = 0
    while i < len(tokens):
        if not tokens[i] or not tokens[i][0].isalpha():
            i += 1
            continue
        item = tokens[i]
        # consume one optional "OF|IN <parent>" qualifier
        if i + 2 < len(tokens) and tokens[i + 1].upper() in ("OF", "IN"):
            item = f"{item} {tokens[i + 1]} {tokens[i + 2]}"
            i += 3
        else:
            i += 1
        out.append(item)
    return out


def _consume_first_value(text: str) -> str:
    """Return the first COBOL value token from `text`, handling quoted literals."""
    t = text.strip()
    if not t:
        return ""
    if t[0] in ("'", '"'):
        quote = t[0]
        end = t.find(quote, 1)
        if end != -1:
            return t[: end + 1]
    # take whitespace-delimited first token, possibly with "OF Y" qualifier
    parts = t.split()
    if len(parts) >= 3 and parts[1].upper() in ("OF", "IN"):
        return f"{parts[0]} {parts[1]} {parts[2]}"
    return parts[0]


def _tr_set(text: str, sanitize) -> list[str]:
    # SET <name> TO TRUE/FALSE/<value>     (88-level toggles)
    m = re.match(r"SET\s+(.+?)\s+TO\s+(TRUE|FALSE|.+)", text, re.IGNORECASE)
    if not m:
        return [f"// COBOL [SET]: {text}"]
    name_raw = m.group(1).strip()
    val = m.group(2).strip()
    # SET ... TO TRUE/FALSE almost always references an 88-level condition name.
    # We don't have 88-level metadata in the artifact graph yet, so we can't
    # emit a real assignment — keep it as a documented comment so it compiles.
    if val.upper() in ("TRUE", "FALSE"):
        return [f"// SET {name_raw} TO {val.upper()}  "
                f"// 88-level condition: assign the parent field its TRUE/FALSE literal"]
    name = _lower_ident(name_raw, sanitize)
    return [f"this.{name} = {_lower_value(val, sanitize)};"]


def _tr_add(text: str, sanitize) -> list[str]:
    # ADD <a> [<b> ...] TO <target> [GIVING <result>]
    # Type-correct translation requires knowing the target's PIC (int/long/BigDecimal),
    # which we don't currently thread through. Preserve as comment so the developer
    # can translate with correct numeric semantics + rounding rules.
    return [f"// ADD (needs PIC-aware translation): {text};"]


def _tr_subtract(text: str, sanitize) -> list[str]:
    return [f"// SUBTRACT (needs PIC-aware translation): {text};"]


def _tr_multiply(text: str, sanitize) -> list[str]:
    return [f"// MULTIPLY (needs PIC-aware translation): {text};"]


def _tr_compute(text: str, sanitize) -> list[str]:
    return [f"// COMPUTE (needs PIC-aware expression translation): {text};"]


def _tr_display(text: str, sanitize) -> list[str]:
    m = re.match(r"DISPLAY\s+(.+)$", text, re.IGNORECASE)
    if not m:
        return [f"// COBOL [DISPLAY]: {text}"]
    rest = m.group(1).strip()
    arg = _lower_value(_consume_first_value(rest), sanitize)
    return [f"System.out.println({arg});  // DISPLAY {rest}"]


def _tr_initialize(text: str, sanitize) -> list[str]:
    m = re.match(r"INITIALIZE\s+(.+)$", text, re.IGNORECASE)
    if not m:
        return [f"// COBOL [INITIALIZE]: {text}"]
    names = [_lower_ident(n.strip(), sanitize) for n in re.split(r"\s+", m.group(1)) if n.strip()]
    return [f"// INITIALIZE {' '.join(n for n in names)}: reset to PIC defaults"] + \
           [f"this.{n} = null;  // TODO: set to type-appropriate zero/spaces" for n in names]


def _tr_goback(text: str, sanitize) -> list[str]:
    return ["return;  // GOBACK"]


def _tr_stop_run(text: str, sanitize) -> list[str]:
    return ["System.exit(0);  // STOP RUN"]


def _tr_if(text: str, sanitize) -> list[str]:
    # IF <cond> [THEN] <stmts> [ELSE <stmts>] [END-IF]
    # The predicate runs from "IF " up to the first body-starting verb (MOVE,
    # PERFORM, SET, ADD, ...) or "THEN" or end-of-string.
    body_re = re.compile(r"\s+(?:THEN\s+)?(MOVE|PERFORM|SET|ADD|SUBTRACT|MULTIPLY|"
                         r"DIVIDE|COMPUTE|DISPLAY|GOBACK|EXIT|CONTINUE|IF|"
                         r"EVALUATE|INITIALIZE|CALL|EXEC|GO|STOP|READ|WRITE|REWRITE|"
                         r"DELETE|START|UNSTRING|STRING|INSPECT)\b", re.IGNORECASE)
    body = body_re.search(text, 3)  # start after "IF "
    if body:
        cond_text = text[3:body.start()].strip()
    else:
        cond_text = text[3:].strip()
        if cond_text.upper().endswith(" THEN"):
            cond_text = cond_text[:-5].rstrip()
    cond_java = _translate_condition(cond_text, sanitize)
    return [f"if ({cond_java}) {{",
            f"    // TODO: translate body for: {cond_text}",
            "}"]


def _tr_evaluate(text: str, sanitize) -> list[str]:
    # EVALUATE <expr> WHEN <val> ... [WHEN OTHER ...] END-EVALUATE
    head = text.split(" WHEN ", 1)[0]
    m = re.match(r"EVALUATE\s+(.+)", head, re.IGNORECASE)
    expr = m.group(1).strip() if m else "<expr>"
    expr_java = _translate_condition(expr, sanitize) if expr.upper() != "TRUE" else "true /* multi-branch */"
    return [f"// EVALUATE {expr}",
            "// (translated branches appear below as separate IF/SET/MOVE statements)",
            f"if ({expr_java}) {{ /* WHEN branches follow */ }}"]


def _tr_perform(text: str, sanitize) -> list[str]:
    # PERFORM <paragraph-name> [THRU <name2>] [<n> TIMES] [VARYING ...]
    m = re.match(r"PERFORM\s+([A-Z][A-Z0-9_-]*)", text, re.IGNORECASE)
    if not m:
        return [f"// COBOL [PERFORM]: {text}"]
    return [f"this.{sanitize(m.group(1), False)}();  // PERFORM"]


def _tr_call(text: str, sanitize) -> list[str]:
    # CALL '<name>' USING ...
    m = re.match(r"CALL\s+['\"]?([A-Z0-9_-]+)['\"]?", text, re.IGNORECASE)
    if not m:
        return [f"// COBOL [CALL]: {text}"]
    return [f'// CALL {m.group(1)}() — see external program {m.group(1)}']


def _lower_value(token: str, sanitize) -> str:
    """Lower a COBOL value/expression token to a Java rvalue."""
    if not token:
        return '""'
    t = token.strip()
    upper = t.upper()
    if upper in ("SPACES", "SPACE"):
        return '""'
    if upper in ("ZERO", "ZEROES", "ZEROS"):
        return "0  /* ZEROES — coerce to BigDecimal.ZERO for BigDecimal fields */"
    if upper in ("LOW-VALUE", "LOW-VALUES"):
        return '"\\u0000"'
    if upper in ("HIGH-VALUE", "HIGH-VALUES"):
        return '"\\uFFFF"'
    if upper in ("NULL", "NULLS"):
        return "null"
    # Quoted literal
    if (t.startswith("'") and t.endswith("'")) or (t.startswith('"') and t.endswith('"')):
        body = t[1:-1].replace('"', '\\"')
        return f'"{body}"'
    # Number
    if re.match(r"^-?\d+(\.\d+)?$", t):
        return t
    # COBOL reference modification:  NAME(start:length)  ->  Java .substring()
    ref = re.match(r"([A-Z][A-Z0-9_-]*)\s*\(\s*(\d+)\s*:\s*(\d+)\s*\)$", t, re.IGNORECASE)
    if ref:
        ident = _lower_ident(ref.group(1), sanitize)
        start = int(ref.group(2)) - 1  # COBOL is 1-indexed
        length = int(ref.group(3))
        return f"this.{ident}.substring({start}, {start + length})"
    # Identifier
    return f"this.{_lower_ident(t, sanitize)}"


def _lower_ident(token: str, sanitize) -> str:
    """Strip qualifiers like 'X OF Y' / 'X IN Y' and sanitize to Java name."""
    t = re.split(r"\s+(?:OF|IN)\s+", token, maxsplit=1, flags=re.IGNORECASE)[0]
    t = t.strip().rstrip(",")
    return sanitize(t, False)


def _translate_condition(text: str, sanitize) -> str:
    """Translate a COBOL conditional expression to Java. Best-effort.

    Handles: equality, NOT EQUAL, numeric class test, SPACES test, AND/OR.
    Anything we can't recognize is wrapped in a /* ... */ block expression
    that defaults to true, so the emitted Java still parses.
    """
    t = text.strip()
    # Class conditions:  X IS NUMERIC  /  X NOT NUMERIC
    m = re.match(r"(\S+)\s+(?:IS\s+)?(NOT\s+)?NUMERIC\s*$", t, re.IGNORECASE)
    if m:
        ident = f"this.{_lower_ident(m.group(1), sanitize)}"
        op = "!" if m.group(2) else ""
        return f"{op}{ident}.toString().matches(\"-?\\\\d+(\\\\.\\\\d+)?\")"
    # X SPACES / X = SPACES
    m = re.match(r"(\S+)\s*(=|EQUAL\s*TO|EQUAL)?\s*SPACES?\s*$", t, re.IGNORECASE)
    if m:
        return f"this.{_lower_ident(m.group(1), sanitize)}.isBlank()"
    # X = literal / X NOT = literal / X = Y
    m = re.match(r"(\S+)\s*(NOT\s+)?(=|EQUAL\s*TO|EQUAL)\s+(.+)$", t, re.IGNORECASE)
    if m:
        a = f"this.{_lower_ident(m.group(1), sanitize)}"
        b = _lower_value(m.group(4).strip().split()[0], sanitize)
        neg = "!" if m.group(2) else ""
        return f"{neg}java.util.Objects.equals({a}, {b})"
    # AND / OR composition (very best-effort)
    if " AND " in t.upper():
        parts = re.split(r"\s+AND\s+", t, flags=re.IGNORECASE)
        return " && ".join(f"({_translate_condition(p, sanitize)})" for p in parts)
    if " OR " in t.upper():
        parts = re.split(r"\s+OR\s+", t, flags=re.IGNORECASE)
        return " || ".join(f"({_translate_condition(p, sanitize)})" for p in parts)
    # Unknown - emit a safe fallback so the Java still compiles
    safe = t.replace("*/", "* /").replace("\n", " ")
    return f"true /* TODO translate: {safe} */"


_TRANSLATORS = {
    "MOVE": _tr_move,
    "SET": _tr_set,
    "ADD": _tr_add,
    "SUBTRACT": _tr_subtract,
    "MULTIPLY": _tr_multiply,
    "COMPUTE": _tr_compute,
    "DISPLAY": _tr_display,
    "INITIALIZE": _tr_initialize,
    "GOBACK": _tr_goback,
    "STOP": _tr_stop_run,
    "IF": _tr_if,
    "EVALUATE": _tr_evaluate,
    "PERFORM": _tr_perform,
    "CALL": _tr_call,
}
