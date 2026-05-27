"""
End-to-end LLM demo for the CardDemo Pipeline.

Generates two specifications:
  1. COTRN02C VALIDATE-INPUT-DATA-FIELDS (online transaction paragraph)
  2. POSTTRAN -> INTCALC -> CREASTMT (batch chain)

For each, we:
  a) build a structured context packet from the SQLite graph store
  b) fill a prompt template (templates/*.txt)
  c) call Gemini if GEMINI_API_KEY (or GOOGLE_API_KEY) is set;
     otherwise load a recorded fixture so the demo always runs
  d) run grounding verification (every UUID in the output must resolve)
  e) save prompt + response + grounding report under demo/
"""
from __future__ import annotations

import json
import os
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))


def _load_dotenv(path: Path = ROOT / ".env") -> None:
    """Tiny .env loader so judges can drop GEMINI_API_KEY into a .env file."""
    if not path.is_file():
        return
    for line in path.read_text().splitlines():
        line = line.strip()
        if not line or line.startswith("#") or "=" not in line:
            continue
        k, _, v = line.partition("=")
        k = k.strip()
        v = v.strip()
        # strip surrounding quotes if present
        if len(v) >= 2 and v[0] == v[-1] and v[0] in "\"'":
            v = v[1:-1]
        os.environ.setdefault(k, v)


_load_dotenv()

from api.database import connect
from llm.grounding import find_uuids, verify
from llm.retrieval import batch_chain_packet, paragraph_packet, program_packet

DEMO_DIR = ROOT / "demo"
TEMPLATES_DIR = ROOT / "templates"

PROGRAM_TARGET = "COTRN02C"
PARAGRAPH_TARGET = ("COTRN02C", "VALIDATE-INPUT-DATA-FIELDS")
BATCH_CHAIN = ["POSTTRAN", "INTCALC", "CREASTMT"]


def find_paragraph_uuid(program_name: str, paragraph_name: str) -> str | None:
    with connect() as conn:
        row = conn.execute(
            "SELECT n.uuid FROM nodes n "
            "WHERE n.kind='Paragraph' AND n.name=? "
            "AND n.file IN (?, ?) LIMIT 1",
            (paragraph_name, program_name + ".cbl", program_name + ".CBL")
        ).fetchone()
        return row["uuid"] if row else None


def _is_rate_limit(msg: str) -> bool:
    m = msg.lower()
    return "429" in msg or "quota" in m or "resource_exhausted" in m or "rate" in m


def _gemini_attempt(prompt: str) -> tuple[str | None, str]:
    """Try Gemini. Returns (text, status) where status is 'ok', 'rate_limit',
    'no_key', or 'failed'. text is None unless status=='ok'."""
    api_key = os.environ.get("GEMINI_API_KEY") or os.environ.get("GOOGLE_API_KEY")
    if not api_key:
        return None, "no_key"
    import time
    import google.generativeai as genai
    genai.configure(api_key=api_key)
    candidates = ("gemini-2.5-flash", "gemini-2.0-flash", "gemini-2.5-flash-lite", "gemini-flash-latest")
    rate_limited = False
    for model_name in candidates:
        for attempt in range(2):
            try:
                model = genai.GenerativeModel(model_name)
                resp = model.generate_content(prompt)
                text = resp.text if resp and resp.text else "(empty response)"
                return text, f"live:gemini/{model_name}"
            except Exception as e:
                msg = str(e)
                if _is_rate_limit(msg):
                    rate_limited = True
                    import re
                    m = re.search(r"retry_delay\s*\{\s*seconds:\s*(\d+)", msg)
                    wait = int(m.group(1)) if m else 30
                    if attempt == 0 and wait <= 35:
                        print(f"  [gemini/{model_name}] rate-limited, waiting {wait}s and retrying...")
                        time.sleep(wait + 1)
                        continue
                    print(f"  [gemini/{model_name}] rate-limited (retry_delay={wait}s)")
                    break
                print(f"  [gemini/{model_name}] failed: {msg.splitlines()[0][:160]}")
                break
    return None, "rate_limit" if rate_limited else "failed"


def _groq_attempt(prompt: str) -> tuple[str | None, str]:
    """Fallback: try Groq. Returns (text, status)."""
    api_key = os.environ.get("GROQ_API_KEY")
    if not api_key:
        return None, "no_key"
    try:
        from groq import Groq
    except ImportError:
        return None, "no_sdk"
    client = Groq(api_key=api_key)
    # try the largest first, fall back to fast/smaller
    candidates = (
        "llama-3.3-70b-versatile",
        "llama-3.1-8b-instant",
        "mixtral-8x7b-32768",
        "gemma2-9b-it",
    )
    for model_name in candidates:
        try:
            resp = client.chat.completions.create(
                model=model_name,
                messages=[{"role": "user", "content": prompt}],
                temperature=0.3,
                max_tokens=4096,
            )
            text = resp.choices[0].message.content if resp.choices else ""
            if text:
                return text, f"live:groq/{model_name}"
        except Exception as e:
            msg = str(e)
            if _is_rate_limit(msg):
                print(f"  [groq/{model_name}] rate-limited")
            else:
                print(f"  [groq/{model_name}] failed: {msg.splitlines()[0][:160]}")
            continue
    return None, "failed"


def call_gemini(prompt: str) -> tuple[str, str]:
    """Try Gemini first (per the user's primary key), fall back to Groq, then fixture.
    Function name kept for backwards compatibility - it's now the unified LLM entry point.
    Returns (response_text, mode) where mode is 'live:provider/model' or 'fixture'."""
    text, status = _gemini_attempt(prompt)
    if text is not None:
        return text, status

    if status == "rate_limit":
        print("  Gemini rate-limited -> falling back to Groq")
    elif status == "no_key":
        print("  No Gemini key -> trying Groq")
    elif status == "failed":
        print("  Gemini failed -> trying Groq")

    text, status = _groq_attempt(prompt)
    if text is not None:
        return text, status
    if status == "no_key":
        print("  No Groq key either -> using fixture")
    elif status == "no_sdk":
        print("  Groq SDK not installed -> using fixture")
    elif status in ("rate_limit", "failed"):
        print("  Groq also unavailable -> using fixture")

    return _fixture_response(prompt), "fixture"


def _fixture_response(prompt: str) -> str:
    """Deterministic offline response for judges without an API key.
    We extract UUIDs that appear in the prompt and weave them into a brief
    grounded paragraph - so the demo always produces a valid, grounded output."""
    from llm.grounding import find_uuids
    uuids = find_uuids(prompt)
    uuids = list(dict.fromkeys(uuids))[:8]
    refs = "\n".join(f"- uuid:{u}" for u in uuids) or "- (no UUIDs in prompt)"
    return (
        "## Specification (offline fixture)\n\n"
        "_Generated without a live LLM provider. To get a real LLM-authored spec, "
        "set GEMINI_API_KEY or GROQ_API_KEY in `.env` and re-run._\n\n"
        "The artifact bundle above describes the paragraph or batch chain entirely in "
        "structured form. Below are the principal artifact UUIDs referenced in the bundle, "
        "which a grounded specification would describe in prose:\n\n"
        + refs +
        "\n\nEvery one of these UUIDs is verifiable against the `nodes` table in "
        "`output/carddemo.db`."
    )


def run_program_demo(program_name: str = PROGRAM_TARGET) -> dict:
    """Generate a program-level structured spec that feeds forward engineering.

    The output JSON is consumed by llm/java_emitter.py — the spec's per-paragraph
    purpose lines become Javadoc on the emitted methods, and the overview becomes
    the class-level Javadoc.
    """
    packet = program_packet(program_name)
    template = (TEMPLATES_DIR / "program_spec.txt").read_text()
    prompt = template.format(
        program_name=program_name,
        packet_json=json.dumps(packet, indent=2, default=str),
    )
    print(f"  prompt size: {len(prompt):,} chars  paragraphs: {len(packet['paragraphs'])}")
    text, mode = call_gemini(prompt)

    # Try to parse a JSON object out of the response (LLM may add stray prose).
    spec_json = _extract_json(text)
    uuids = find_uuids(text)
    grounding = verify(uuids)
    out = {
        "target": program_name,
        "program_uuid": packet["program"]["uuid"],
        "mode": mode,
        "response_text": text,
        "spec": spec_json,
        "uuids_referenced": uuids,
        "grounding": grounding,
    }
    return out


def _extract_json(text: str):
    """Best-effort JSON extraction from an LLM response.

    The prompt asks for raw JSON, but providers occasionally add ```json fences
    or a stray sentence. Be lenient — return None if nothing parses.
    """
    if not text:
        return None
    t = text.strip()
    if t.startswith("```"):
        # strip the first fence and any closing fence
        t = t.split("\n", 1)[1] if "\n" in t else t
        if t.endswith("```"):
            t = t.rsplit("```", 1)[0]
        if t.lstrip().startswith("json"):
            t = t.lstrip()[4:]
    # find the first { and the matching final }
    start = t.find("{")
    end = t.rfind("}")
    if start == -1 or end == -1 or end <= start:
        return None
    try:
        return json.loads(t[start : end + 1])
    except Exception:
        return None


def run_paragraph_demo() -> dict:
    program, paragraph = PARAGRAPH_TARGET
    uuid = find_paragraph_uuid(program, paragraph)
    if not uuid:
        # fall back to first paragraph of COTRN02C
        with connect() as conn:
            row = conn.execute(
                "SELECT uuid, name FROM nodes WHERE kind='Paragraph' AND file IN (?,?) ORDER BY start_line LIMIT 1",
                (program + ".cbl", program + ".CBL")
            ).fetchone()
        if not row:
            return {"error": f"No paragraphs found for {program}"}
        uuid, paragraph = row["uuid"], row["name"]
        print(f"  [fallback] using paragraph {paragraph} ({uuid})")
    packet = paragraph_packet(uuid)
    template = (TEMPLATES_DIR / "paragraph_spec_v2.txt").read_text()
    prompt = template.format(
        paragraph_name=paragraph,
        program_name=program,
        packet_json=json.dumps(packet, indent=2, default=str),
    )
    print(f"  prompt size: {len(prompt):,} chars")
    text, mode = call_gemini(prompt)
    spec_json = _extract_json(text)
    uuids = find_uuids(text)
    grounding = verify(uuids)
    out = {
        "target": f"{program}/{paragraph}",
        "paragraph_uuid": uuid,
        "mode": mode,
        "packet_summary": {k: len(v) if isinstance(v, list) else 1 for k, v in packet.items()},
        "response_text": text,
        "spec": spec_json,
        "uuids_referenced": uuids,
        "grounding": grounding,
    }
    return out


def run_batch_chain_demo() -> dict:
    packet = batch_chain_packet(BATCH_CHAIN)
    template = (TEMPLATES_DIR / "batch_chain_spec_v2.txt").read_text()
    prompt = template.format(
        chain_names=" -> ".join(BATCH_CHAIN),
        packet_json=json.dumps(packet, indent=2, default=str),
    )
    print(f"  prompt size: {len(prompt):,} chars")
    text, mode = call_gemini(prompt)
    spec_json = _extract_json(text)
    uuids = find_uuids(text)
    grounding = verify(uuids)
    out = {
        "target": " -> ".join(BATCH_CHAIN),
        "mode": mode,
        "response_text": text,
        "spec": spec_json,
        "uuids_referenced": uuids,
        "grounding": grounding,
    }
    return out


def save(label: str, result: dict):
    DEMO_DIR.mkdir(parents=True, exist_ok=True)
    json_path = DEMO_DIR / f"{label}.json"
    md_path = DEMO_DIR / f"{label}.md"
    with open(json_path, "w") as f:
        json.dump(result, f, indent=2, default=str)
    with open(md_path, "w") as f:
        f.write(f"# Demo: {result.get('target','?')}\n\n")
        f.write(f"Mode: `{result.get('mode')}`  \n")
        g = result.get("grounding", {})
        f.write(f"Grounding: {g.get('resolved',0)}/{g.get('references',0)} UUIDs resolved "
                f"({g.get('pct',0)}%)\n\n")
        if g.get("unresolved"):
            f.write("**Unresolved UUIDs:** " + ", ".join(g["unresolved"]) + "\n\n")
        f.write("## LLM output\n\n")
        f.write(result.get("response_text", ""))
    print(f"  saved {json_path.name} + {md_path.name}")


def main():
    import argparse
    import time

    parser = argparse.ArgumentParser(description="Generate LLM specs grounded in the artifact graph.")
    parser.add_argument("--programs", default=PROGRAM_TARGET,
                        help="Comma-separated program names to generate program-level specs for "
                             f"(default: {PROGRAM_TARGET}). Use 'none' to skip program-level specs.")
    parser.add_argument("--skip-paragraph", action="store_true",
                        help="Skip the curated paragraph-level demo (COTRN02C/VALIDATE-INPUT-DATA-FIELDS).")
    parser.add_argument("--skip-batch", action="store_true",
                        help="Skip the curated batch-chain demo (POSTTRAN→INTCALC→CREASTMT).")
    args = parser.parse_args()

    program_targets = [] if args.programs.lower() == "none" else [
        p.strip() for p in args.programs.split(",") if p.strip()
    ]
    needs_gemini_cooldown = False

    # Program-level specs run FIRST because they drive forward engineering —
    # llm/java_emitter.py reads demo/program_spec_<NAME>.json and embeds the LLM's
    # per-paragraph descriptions as Javadoc on the generated Java class.
    for idx, target in enumerate(program_targets):
        if needs_gemini_cooldown:
            print("  (sleeping 35s to respect Gemini free-tier per-minute quota)")
            time.sleep(35)
            print()
        print(f"=== Demo 0.{idx}: program-level spec for {target} (drives forward engineering) ===")
        try:
            r0 = run_program_demo(target)
        except ValueError as e:
            print(f"  skipped: {e}")
            continue
        g0 = r0.get("grounding", {})
        parsed_ok = "parsed" if r0.get("spec") else "unparsed"
        print(f"  mode={r0.get('mode')} json={parsed_ok} "
              f"grounding={g0.get('resolved',0)}/{g0.get('references',0)} ({g0.get('pct',0)}%)")
        save(f"program_spec_{target}", r0)
        needs_gemini_cooldown = r0.get("mode", "").startswith("live:gemini")

    if not args.skip_paragraph:
        if needs_gemini_cooldown:
            print("  (sleeping 35s to respect Gemini free-tier per-minute quota)")
            time.sleep(35)
        print()
        print("=== Demo 1: paragraph spec ===")
        r1 = run_paragraph_demo()
        g1 = r1.get("grounding", {})
        print(f"  mode={r1.get('mode')} grounding={g1.get('resolved',0)}/{g1.get('references',0)} ({g1.get('pct',0)}%)")
        save("paragraph_spec", r1)
        needs_gemini_cooldown = r1.get("mode", "").startswith("live:gemini")

    if not args.skip_batch:
        if needs_gemini_cooldown:
            print("  (sleeping 35s to respect Gemini free-tier per-minute quota)")
            time.sleep(35)
        print()
        print("=== Demo 2: batch chain spec ===")
        r2 = run_batch_chain_demo()
        g2 = r2.get("grounding", {})
        print(f"  mode={r2.get('mode')} grounding={g2.get('resolved',0)}/{g2.get('references',0)} ({g2.get('pct',0)}%)")
        save("batch_chain_spec", r2)


if __name__ == "__main__":
    main()
