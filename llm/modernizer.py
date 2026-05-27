"""
Per-file code modernizer (multi-agent).

Each canonical CardDemo file type modernizes to a specific Java/Spring target:

  COBOL (.cbl)      ─► Java class (PIC-typed fields, paragraph methods)
  Copybook (.cpy)   ─► Java record / POJO with typed fields
  JCL (.jcl)        ─► Spring Batch @Configuration with @Bean Jobs + Steps
  PROC (.prc)       ─► Spring Batch reusable sub-flow
  BMS (.bms)        ─► Thymeleaf template + Spring MVC @Controller skeleton
  CSD (.csd)        ─► Spring @Configuration registering programs/transactions
  ASM (.asm)        ─► Java stub class (opaque callable)
  MAC (.mac)        ─► Java utility class (constants + helper methods)
  CTL (.ctl)        ─► Java sort/filter/comparator class
  Scheduler         ─► Spring @Scheduled annotated bean

Pipeline per file:

  ┌──────────────────────────────────────┐
  │ CodeEmitter agent (Gemini)           │  builds the modernized source
  │   ↓ structured context (Rule 1)      │
  │   ↓ target-stack hints               │
  │   → Java/Thymeleaf/XML output text   │
  └──────────────────────────────────────┘
                  │
                  ▼
  ┌──────────────────────────────────────┐
  │ Critic agent (Groq)                  │  reviews semantic preservation +
  │   ↓ sees the generated code +        │  flags risks (precision loss,
  │     the artifact context             │  CICS state, EBCDIC handling, etc.)
  │   → APPROVED / NEEDS_REVISION /      │
  │     MAJOR_ISSUES verdict             │
  └──────────────────────────────────────┘

Output cached to output/modernized/<kind>/<file>.json for instant re-display.

COBOL is a special case — the existing llm.java_emitter already produces a
high-quality, spec-driven Java class, so we delegate to it (not the LLM) for
COBOL files. Other kinds use the multi-agent flow above.
"""
from __future__ import annotations

import json
import sys
import time
from concurrent.futures import ThreadPoolExecutor
from pathlib import Path
from typing import Callable

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from llm.demo import _gemini_attempt, _groq_attempt, _load_dotenv

_load_dotenv()

CACHE_ROOT = ROOT / "output" / "modernized"


# ============================================================================
#  Target stack per file kind
# ============================================================================

TARGETS = {
    "cobol":     {"language": "java",       "framework": "Spring Boot 3 + plain Java 17",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/generated"},
    "copybook":  {"language": "java",       "framework": "Java 17 record / POJO",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/records"},
    "jcl":       {"language": "java",       "framework": "Spring Batch 5 @Configuration",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/batch"},
    "proc":      {"language": "java",       "framework": "Spring Batch 5 reusable sub-flow",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/batch/procs"},
    "bms":       {"language": "html+java",  "framework": "Thymeleaf template + Spring MVC @Controller",
                  "file_suffix": ".html",   "out_subdir": "src/main/resources/templates"},
    "csd":       {"language": "java",       "framework": "Spring @Configuration replacing CICS registry",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/cics"},
    "asm":       {"language": "java",       "framework": "Java stub class for opaque callable",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/asm"},
    "mac":       {"language": "java",       "framework": "Java utility class (constants + helpers)",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/util"},
    "ctl":       {"language": "java",       "framework": "Java sort/filter implementation",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/util/ctl"},
    "scheduler": {"language": "java",       "framework": "Spring @Scheduled bean",
                  "file_suffix": ".java",   "out_subdir": "src/main/java/com/carddemo/scheduler"},
}


# ============================================================================
#  Agents
# ============================================================================

class Agent:
    name: str = "agent"
    preferred_provider: str = "gemini"

    def call(self, prompt: str) -> dict:
        t0 = time.time()
        primary = self.preferred_provider
        secondary = "groq" if primary == "gemini" else "gemini"
        text, mode = self._try(primary, prompt)
        if text is None:
            text, mode = self._try(secondary, prompt)
        if text is None:
            return {"text": "(no LLM provider available — set GEMINI_API_KEY or GROQ_API_KEY)",
                    "mode": "fixture", "elapsed_s": round(time.time() - t0, 1), "error": "no provider"}
        return {"text": text, "mode": mode, "elapsed_s": round(time.time() - t0, 1)}

    @staticmethod
    def _try(provider: str, prompt: str):
        if provider == "gemini":
            return _gemini_attempt(prompt)
        return _groq_attempt(prompt)


class CodeEmitter(Agent):
    name = "Code Emitter"
    preferred_provider = "gemini"

    def prompt(self, kind: str, file_name: str, context: dict, target: dict) -> str:
        return f"""You are a senior modernization engineer. Generate the {target['framework']}
equivalent of the mainframe artifact described below.

File kind: {kind}
Source file: {file_name}
Target language: {target['language']}
Target framework: {target['framework']}
Target output path (suggested): {target['out_subdir']}/<derived>{target['file_suffix']}

CONSTRAINTS:
- Output ONLY the source code. No prose. No markdown fences. Just the code.
- Preserve semantics: decimal precision (COBOL COMP-3 → java.math.BigDecimal with explicit
  scale, NEVER double), sign handling, fixed-width strings, record layouts, control flow,
  CICS transaction boundaries, VSAM key fields, JCL step dependencies.
- Reference the source by name in a class-level comment: "Generated from <file>".
- Where the original construct has no clean Java equivalent (e.g. ALTER, GO TO DEPENDING),
  emit a TODO comment with a brief explanation of the migration risk.
- Where you'd need a CICS or VSAM runtime call, use stub classes named `Cics.*` and `Vsam.*`
  (assume they exist).
- For copybooks: emit a Java 17 record where possible; PIC clauses determine the field types.
- For JCL: emit a Spring Batch @Configuration with one @Bean Job per JOB card and one @Bean
  Step per EXEC step.
- For BMS: emit a Thymeleaf HTML template; field positions inform layout order; attributes
  (PROT/UNPROT/NUM/etc.) map to readonly/required/type=number.
- For CSD: emit a Spring @Configuration listing program/transaction registrations as @Bean
  definitions with metadata.
- Include all imports.

STRUCTURED ARTIFACT CONTEXT (Rule 1 — never raw COBOL):

{json.dumps({k: v for k, v in context.items() if k != 'source_excerpts'},
            indent=2, default=str)[:10000]}

Produce the source code now."""


class ModernizationCritic(Agent):
    name = "Critic"
    preferred_provider = "groq"

    def prompt(self, kind: str, file_name: str, code: str, context: dict, target: dict) -> str:
        return f"""You are a Modernization Critic. The Code Emitter agent just generated the
{target['framework']} equivalent of a mainframe artifact. Your job is to find anything wrong.

Check for:
1. SEMANTIC PRESERVATION — is decimal precision preserved? Are PIC clauses → Java types
   correctly typed (BigDecimal for COMP-3, long for COMP, String for X)? Is COBOL sign
   handling preserved?
2. CONTROL-FLOW EQUIVALENCE — do PERFORM chains map to method calls? Are IF/EVALUATE
   branches faithful? Is EXEC CICS LINK/XCTL preserved with proper semantics?
3. INTEGRATION SURFACE — are external dependencies (called programs, files, copybooks)
   correctly referenced?
4. MIGRATION RISKS NOT FLAGGED — does the original have ALTER, GO TO DEPENDING, dynamic
   CALL, OCCURS DEPENDING, REDEFINES, COMP-3 rounding, HANDLE CONDITION, or pseudo-
   conversational state that the generated code silently ignores?

Output format (markdown, brief — 3-5 short paragraphs):
  ## Semantic preservation
  ## Control flow & integration
  ## Risks NOT flagged in the code
  ## Verdict (one of: APPROVED / NEEDS_REVISION / MAJOR_ISSUES)

Source file: {file_name} ({kind})
Target: {target['framework']}

ARTIFACT CONTEXT SUMMARY:
{json.dumps(context.get('summary', {}), indent=2, default=str)[:2000]}

GENERATED CODE:
```
{code[:6000]}
```

Produce the review now."""


# ============================================================================
#  Pipeline
# ============================================================================

def modernize_file(kind: str, file_name: str, context: dict,
                   on_event: Callable[[str, dict], None] | None = None) -> dict:
    """Run the multi-agent modernization pipeline for one file."""

    def emit(name, payload):
        if on_event:
            try:
                on_event(name, payload)
            except Exception:
                pass

    target = TARGETS.get(kind)
    if not target:
        return {"error": f"unknown kind: {kind}"}

    t_start = time.time()
    emit("start", {"file_kind": kind, "file_name": file_name,
                   "target": target,
                   "agents": ["CodeEmitter", "Critic"]})

    # Special case: COBOL has a high-quality rule-based emitter already; use it.
    if kind == "cobol":
        return _modernize_cobol_via_emitter(file_name, context, emit, t_start)

    # All other kinds: use the multi-agent LLM flow.
    code_agent = CodeEmitter()
    critic_agent = ModernizationCritic()

    emit("agent_start", {"agent": "CodeEmitter"})
    code_result = code_agent.call(code_agent.prompt(kind, file_name, context, target))
    code = _strip_fences(code_result["text"])
    emit("agent_done", {"agent": "CodeEmitter",
                        "mode": code_result["mode"],
                        "elapsed_s": code_result["elapsed_s"]})

    emit("agent_start", {"agent": "Critic"})
    critic_result = critic_agent.call(critic_agent.prompt(kind, file_name, code, context, target))
    emit("agent_done", {"agent": "Critic",
                        "mode": critic_result["mode"],
                        "elapsed_s": critic_result["elapsed_s"]})

    spec = {
        "file_kind": kind,
        "file_name": file_name,
        "target": target,
        "generated_at": int(time.time()),
        "total_elapsed_s": round(time.time() - t_start, 1),
        "code": {
            "language": target["language"],
            "text": code,
            "line_count": len(code.splitlines()),
            "byte_count": len(code),
            "suggested_path": f"{target['out_subdir']}/{_java_name(file_name, target)}",
            "emitter": "llm_multi_agent",
            "agent_mode": code_result["mode"],
            "agent_elapsed_s": code_result["elapsed_s"],
        },
        "critic_review": {
            "text": critic_result["text"],
            "mode": critic_result["mode"],
            "elapsed_s": critic_result["elapsed_s"],
        },
        "verdict": _extract_verdict(critic_result["text"]),
    }
    _write_cache(kind, file_name, spec)
    emit("complete", {"total_elapsed_s": spec["total_elapsed_s"]})
    return spec


def _modernize_cobol_via_emitter(file_name: str, context: dict,
                                  emit, t_start: float) -> dict:
    """COBOL: delegate to the existing rule-based java_emitter (no LLM call;
    deterministic + spec-driven Javadoc embedded already)."""
    from llm import java_emitter
    program = (context.get("program_name") or
               file_name.replace(".cbl", "").replace(".CBL", ""))
    emit("agent_start", {"agent": "JavaEmitter (rule-based)"})

    target = TARGETS["cobol"]
    java_dir = ROOT / target["out_subdir"]
    try:
        out_path = java_emitter.emit(program, java_dir)
        code = out_path.read_text()
        elapsed = round(time.time() - t_start, 1)
        emit("agent_done", {"agent": "JavaEmitter (rule-based)",
                            "mode": "deterministic", "elapsed_s": elapsed})
    except SystemExit as e:
        return {"error": f"java_emitter failed: {e}",
                "file_kind": "cobol", "file_name": file_name,
                "total_elapsed_s": round(time.time() - t_start, 1)}

    spec = {
        "file_kind": "cobol",
        "file_name": file_name,
        "target": target,
        "generated_at": int(time.time()),
        "total_elapsed_s": elapsed,
        "code": {
            "language": "java",
            "text": code,
            "line_count": len(code.splitlines()),
            "byte_count": len(code),
            "suggested_path": str(out_path.relative_to(ROOT)),
            "emitter": "rule_based_java_emitter",
            "agent_mode": "deterministic",
            "agent_elapsed_s": elapsed,
        },
        "critic_review": {
            "text": ("Rule-based emission. No LLM critique applied. "
                     "Embedded LLM-authored Javadoc (from /file-specs) carries "
                     "the semantic guidance; the generated Java class structure "
                     "is mechanical and traceable to the source paragraphs."),
            "mode": "n/a",
            "elapsed_s": 0,
        },
        "verdict": "DETERMINISTIC",
    }
    _write_cache("cobol", file_name, spec)
    emit("complete", {"total_elapsed_s": elapsed})
    return spec


# ============================================================================
#  Cache + helpers
# ============================================================================

def _safe(name: str) -> str:
    return "".join(c if c.isalnum() or c in "._-" else "_" for c in name)


def cache_path(kind: str, file_name: str) -> Path:
    return CACHE_ROOT / _safe(kind) / f"{_safe(file_name)}.json"


def _write_cache(kind: str, file_name: str, spec: dict) -> None:
    p = cache_path(kind, file_name)
    p.parent.mkdir(parents=True, exist_ok=True)
    p.write_text(json.dumps(spec, indent=2, default=str))


def load_cached(kind: str, file_name: str) -> dict | None:
    p = cache_path(kind, file_name)
    if not p.is_file():
        return None
    try:
        return json.loads(p.read_text())
    except Exception:
        return None


def _strip_fences(text: str) -> str:
    """LLMs sometimes wrap code in ```java fences despite being told not to."""
    t = text.strip()
    if t.startswith("```"):
        first_nl = t.find("\n")
        if first_nl > 0:
            t = t[first_nl + 1:]
        if t.endswith("```"):
            t = t[:-3].rstrip()
    return t


def _java_name(file_name: str, target: dict) -> str:
    """Turn 'COBIL00C.cbl' → 'Cobil00c.java' (or whatever the target suffix is)."""
    base = file_name.split(".")[0]
    return base[:1].upper() + base[1:].lower() + target["file_suffix"]


def _extract_verdict(critic_text: str) -> str:
    """Pull the verdict (APPROVED / NEEDS_REVISION / MAJOR_ISSUES) from the critic text."""
    for v in ("APPROVED", "NEEDS_REVISION", "MAJOR_ISSUES"):
        if v in critic_text:
            return v
    return "UNKNOWN"
