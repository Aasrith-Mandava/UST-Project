"""
Multi-agent file-spec generator.

Four agents collaborate to produce a complete specification for one file:

    BusinessAnalyst    (Gemini)   ─┐
    TechnicalWriter    (Gemini)   ─┼─► parallel
    FunctionalAnalyst  (Groq)     ─┘
                                    │
                                    ▼
                              Critic (Groq)  — cross-checks the three outputs,
                                               flags inconsistencies,
                                               returns approve/revise notes.

Each agent receives a structured context packet built from the SQLite artifact
graph and the parsed JSON artifacts. RULE 1 (no raw source to the LLM) is
preserved: agents see AST excerpts, paragraph lists, data items, call edges,
file I/O ops — never raw COBOL text except for *targeted* statement excerpts
that have already been parsed and tagged.

Per-file spec is cached at output/file_specs/<kind>/<filename>.json so the
second request returns instantly without re-burning API quota.
"""
from __future__ import annotations

import json
import os
import sys
import time
from concurrent.futures import ThreadPoolExecutor
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any, Callable

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

# Re-use the existing provider helpers (load .env, call Gemini, call Groq).
from llm.demo import _gemini_attempt, _groq_attempt, _load_dotenv

_load_dotenv()

CACHE_ROOT = ROOT / "output" / "file_specs"


# ============================================================================
#  Agent base class — single LLM call with provider preference + fallback
# ============================================================================

@dataclass
class AgentResult:
    text: str
    mode: str
    elapsed_s: float
    error: str | None = None


class Agent:
    """One LLM-backed agent. Tries its preferred provider first, falls back to
    the other if rate-limited or missing API key."""
    name: str = "agent"
    preferred_provider: str = "gemini"   # "gemini" or "groq"

    def call(self, prompt: str) -> AgentResult:
        t0 = time.time()
        primary = self.preferred_provider
        secondary = "groq" if primary == "gemini" else "gemini"

        text, mode = self._try(primary, prompt)
        if text is None:
            text, mode = self._try(secondary, prompt)
        if text is None:
            return AgentResult(
                text="(no LLM provider available — set GEMINI_API_KEY or GROQ_API_KEY in .env)",
                mode="fixture",
                elapsed_s=time.time() - t0,
                error="no provider",
            )
        return AgentResult(text=text, mode=mode, elapsed_s=time.time() - t0)

    @staticmethod
    def _try(provider: str, prompt: str) -> tuple[str | None, str]:
        if provider == "gemini":
            return _gemini_attempt(prompt)
        return _groq_attempt(prompt)


# ============================================================================
#  Four specialist agents
# ============================================================================

class BusinessAnalyst(Agent):
    name = "Business Analyst"
    preferred_provider = "gemini"

    def prompt(self, file_kind: str, context: dict) -> str:
        return f"""You are a Business Analyst writing the business summary for a single
mainframe artifact that will be modernized to Java.

Your audience: business stakeholders + product owners. They need to understand
WHAT this artifact does for the business, in plain English. Not how the code works.

Constraints:
- No raw source code in your output (you have structured artifacts only).
- 3-6 paragraphs, business-focused.
- Cover: business purpose, who uses it / when it runs, business value, what
  data it touches, what business processes it participates in.
- If there are obvious business risks (e.g. month-end critical job, regulatory
  compliance touchpoint), call them out.

File kind: {file_kind}
File name: {context.get('file_name', 'unknown')}

Artifact context (structured, no raw source):

{json.dumps(context, indent=2, default=str)[:12000]}

Produce the business summary now."""


class TechnicalWriter(Agent):
    name = "Technical Writer"
    preferred_provider = "gemini"

    def prompt(self, file_kind: str, context: dict) -> str:
        return f"""You are a Technical Writer producing the technical specification for a
single mainframe artifact that will be modernized to Java.

Your audience: engineers doing the migration. They need precision on data
shapes, interfaces, dependencies, control flow.

Constraints:
- Reference structural facts only. No vague claims.
- Cover (use markdown headings):
  ## Inputs & outputs
  ## Data structures (cite copybooks / data items / records)
  ## External dependencies (called programs, files, tables, queues, screens)
  ## Control flow (paragraphs, call graph, exit conditions)
  ## Persistence (VSAM files, dispositions, key fields)
  ## Performance characteristics (long-running paragraphs, batch boundaries)
- 4-8 paragraphs total under those headings.

File kind: {file_kind}
File name: {context.get('file_name', 'unknown')}

Artifact context:

{json.dumps(context, indent=2, default=str)[:12000]}

Produce the technical specification now."""


class FunctionalAnalyst(Agent):
    name = "Functional Analyst"
    preferred_provider = "groq"

    def prompt(self, file_kind: str, context: dict) -> str:
        return f"""You are a Functional Analyst producing the functional specification for a
single mainframe artifact.

Your audience: QA, support engineers, and the Java implementation team that
needs to preserve semantic behavior during modernization.

Constraints:
- Use structured artifact data; do not invent functionality.
- Cover (use markdown headings):
  ## Functional purpose
  ## Trigger / invocation (how does this artifact get executed?)
  ## Inputs validated / outputs produced
  ## Business rules enforced (cite IF / EVALUATE predicates by line)
  ## Edge cases & error handling
  ## Acceptance criteria for the Java replacement
- 4-7 paragraphs total under those headings.

File kind: {file_kind}
File name: {context.get('file_name', 'unknown')}

Artifact context:

{json.dumps(context, indent=2, default=str)[:12000]}

Produce the functional specification now."""


class Critic(Agent):
    name = "Critic"
    preferred_provider = "groq"

    def prompt(self, business: str, technical: str, functional: str, context: dict) -> str:
        return f"""You are a Critic agent. Three other agents (Business Analyst, Technical
Writer, Functional Analyst) just wrote specs for the same mainframe artifact.

Your job:
1. Identify contradictions BETWEEN the three outputs.
2. Identify claims that aren't supported by the artifact context (hallucinations).
3. Identify gaps — important facts in the context that none of the three covered.

Output format (markdown, 3-5 short paragraphs):
  ## Cross-spec consistency
  ## Grounding issues
  ## Coverage gaps
  ## Verdict (one of: APPROVED / NEEDS_REVISION / MAJOR_ISSUES)

Be specific and concise. Cite specific phrases from the specs when calling out issues.

Artifact context summary:

{json.dumps({k: v for k, v in context.items() if k not in ('source_excerpts',)}, indent=2, default=str)[:6000]}

Business summary:
{business[:3000]}

Technical spec:
{technical[:3000]}

Functional spec:
{functional[:3000]}

Produce the critic review now."""


# ============================================================================
#  Pipeline orchestrator
# ============================================================================

def generate_file_spec(
    file_kind: str,
    file_name: str,
    context: dict,
    on_event: Callable[[str, dict], None] | None = None,
) -> dict:
    """Run the 4-agent pipeline. on_event is called with (event_name, payload)
    so an SSE stream can show progress. Returns the full spec dict."""

    def emit(name, payload):
        if on_event:
            try:
                on_event(name, payload)
            except Exception:
                pass

    t_start = time.time()
    emit("start", {"file_kind": file_kind, "file_name": file_name,
                   "agents": ["BusinessAnalyst", "TechnicalWriter", "FunctionalAnalyst", "Critic"]})

    biz_agent = BusinessAnalyst()
    tech_agent = TechnicalWriter()
    func_agent = FunctionalAnalyst()

    biz_prompt = biz_agent.prompt(file_kind, context)
    tech_prompt = tech_agent.prompt(file_kind, context)
    func_prompt = func_agent.prompt(file_kind, context)

    # The three specialists run in parallel.
    emit("agent_start", {"agent": "BusinessAnalyst"})
    emit("agent_start", {"agent": "TechnicalWriter"})
    emit("agent_start", {"agent": "FunctionalAnalyst"})

    with ThreadPoolExecutor(max_workers=3) as ex:
        f_biz = ex.submit(biz_agent.call, biz_prompt)
        f_tech = ex.submit(tech_agent.call, tech_prompt)
        f_func = ex.submit(func_agent.call, func_prompt)
        biz = f_biz.result()
        tech = f_tech.result()
        func = f_func.result()

    emit("agent_done", {"agent": "BusinessAnalyst", "mode": biz.mode, "elapsed_s": round(biz.elapsed_s, 1)})
    emit("agent_done", {"agent": "TechnicalWriter", "mode": tech.mode, "elapsed_s": round(tech.elapsed_s, 1)})
    emit("agent_done", {"agent": "FunctionalAnalyst", "mode": func.mode, "elapsed_s": round(func.elapsed_s, 1)})

    # The Critic reviews afterwards.
    emit("agent_start", {"agent": "Critic"})
    critic_agent = Critic()
    critic_prompt = critic_agent.prompt(biz.text, tech.text, func.text, context)
    critic = critic_agent.call(critic_prompt)
    emit("agent_done", {"agent": "Critic", "mode": critic.mode, "elapsed_s": round(critic.elapsed_s, 1)})

    spec = {
        "file_kind": file_kind,
        "file_name": file_name,
        "generated_at": int(time.time()),
        "total_elapsed_s": round(time.time() - t_start, 1),
        "business_summary": {
            "text": biz.text,
            "mode": biz.mode,
            "elapsed_s": round(biz.elapsed_s, 1),
            "error": biz.error,
        },
        "technical_specification": {
            "text": tech.text,
            "mode": tech.mode,
            "elapsed_s": round(tech.elapsed_s, 1),
            "error": tech.error,
        },
        "functional_specification": {
            "text": func.text,
            "mode": func.mode,
            "elapsed_s": round(func.elapsed_s, 1),
            "error": func.error,
        },
        "critic_review": {
            "text": critic.text,
            "mode": critic.mode,
            "elapsed_s": round(critic.elapsed_s, 1),
            "error": critic.error,
        },
        "context_snapshot": {
            # store only summary keys to keep cache small
            k: v for k, v in context.items()
            if k not in ("source_excerpts",)
        },
    }

    # Cache to disk
    _write_cache(file_kind, file_name, spec)
    emit("complete", {"total_elapsed_s": spec["total_elapsed_s"]})
    return spec


# ============================================================================
#  Cache I/O
# ============================================================================

def _safe(name: str) -> str:
    return "".join(c if c.isalnum() or c in "._-" else "_" for c in name)


def cache_path(file_kind: str, file_name: str) -> Path:
    return CACHE_ROOT / _safe(file_kind) / f"{_safe(file_name)}.json"


def _write_cache(file_kind: str, file_name: str, spec: dict) -> None:
    p = cache_path(file_kind, file_name)
    p.parent.mkdir(parents=True, exist_ok=True)
    p.write_text(json.dumps(spec, indent=2, default=str))


def load_cached(file_kind: str, file_name: str) -> dict | None:
    p = cache_path(file_kind, file_name)
    if not p.is_file():
        return None
    try:
        return json.loads(p.read_text())
    except Exception:
        return None
