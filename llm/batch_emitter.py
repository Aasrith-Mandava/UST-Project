"""
Forward engineering for batch chains.

Reads demo/batch_chain_spec.json (LLM-authored, JSON-structured), and emits a
Spring Batch Java skeleton that mirrors the chain: one @Configuration class with
one Job per JCL job and one Step per program. The LLM's per-job purpose and
per-program purpose are embedded as Javadoc.

This is intentionally a skeleton — readers/writers are stubbed, the actual COBOL
business logic still needs translation. The point is that the contract
(jobs, steps, datasets, hand-offs) is mechanically derived from grounded artifacts.
"""
from __future__ import annotations

import json
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))


def emit(spec_path: Path, out_path: Path) -> Path:
    wrapper = json.loads(spec_path.read_text())
    spec = wrapper.get("spec") if isinstance(wrapper, dict) else None
    if not spec:
        raise SystemExit(
            f"{spec_path} has no parsed 'spec' field — re-run the LLM demo first."
        )

    chain = spec.get("chain") or []
    chain_id = _pascal("_".join(chain)) if chain else "BatchChain"
    classname = chain_id + "Configuration"

    overview = spec.get("overview", "")
    hint = spec.get("spring_batch_hint", "")
    risks = spec.get("migration_risks") or []
    handoffs = spec.get("dataset_handoffs") or []

    out = [
        "// Generated from the LLM-authored batch chain spec.",
        "// Chain: parsed JCL artifacts -> LLM JSON spec -> Spring Batch skeleton.",
        "// The LLM output is grounded against the SQLite artifact graph; this file",
        "// reflects exactly what the grounded spec specified.",
        "package com.carddemo.generated.batch;",
        "",
        "import org.springframework.batch.core.Job;",
        "import org.springframework.batch.core.Step;",
        "import org.springframework.batch.core.job.builder.JobBuilder;",
        "import org.springframework.batch.core.repository.JobRepository;",
        "import org.springframework.batch.core.step.builder.StepBuilder;",
        "import org.springframework.batch.core.step.tasklet.Tasklet;",
        "import org.springframework.batch.repeat.RepeatStatus;",
        "import org.springframework.beans.factory.annotation.Qualifier;",
        "import org.springframework.context.annotation.Bean;",
        "import org.springframework.context.annotation.Configuration;",
        "import org.springframework.transaction.PlatformTransactionManager;",
        "",
        "/**",
        _wrap(overview, " "),
    ]
    if hint:
        out += [
            " *",
            " * <p><strong>Spring Batch implementation guidance (from LLM):</strong>",
            _wrap(hint, " "),
        ]
    if handoffs:
        out += [" *", " * <p><strong>Dataset hand-offs:</strong>", " * <ul>"]
        for h in handoffs:
            out.append(
                f" *   <li>{h.get('from_job','?')}/{h.get('from_dd','?')} "
                f"&rarr; {h.get('to_job','?')}/{h.get('to_dd','?')} "
                f"(<code>{h.get('dataset','?')}</code>)"
            )
        out.append(" * </ul>")
    if risks:
        out += [" *", " * <p><strong>Migration risks:</strong>", " * <ul>"]
        for r in risks:
            out.append(f" *   <li>{r}")
        out.append(" * </ul>")
    out += [
        " *",
        f" * <p>Chain: {' -> '.join(chain)}",
        " */",
        "@Configuration",
        f"public class {classname} {{",
        "",
    ]

    jobs = spec.get("jobs") or []
    job_method_names: list[tuple[str, str]] = []
    for j in jobs:
        job_name = j.get("job_name", "UNKNOWN")
        job_method = _camel(job_name.lower()) + "Job"
        job_method_names.append((job_name, job_method))
        out += _emit_job_method(j, job_method)
        out.append("")
        out += _emit_step_methods(j)

    # Aggregate flow method that names every job (for a single entry point)
    if job_method_names:
        flow_names = ", ".join(name for _, name in job_method_names)
        out += [
            "    /**",
            f"     * Execution order across the chain: {' -> '.join(jn for jn, _ in job_method_names)}.",
            "     * Wire these jobs with a JobLauncher in deployment order — Spring Batch does",
            "     * not chain Jobs natively; an orchestrator (e.g. Spring Cloud Data Flow,",
            "     * Airflow, or a shell driver) invokes them in sequence.",
            "     */",
            "    public java.util.List<String> chainOrder() {",
            f"        return java.util.List.of({flow_names});",
            "    }",
        ]

    out += ["}", ""]
    out_path.parent.mkdir(parents=True, exist_ok=True)
    out_path.write_text("\n".join(out))
    return out_path


def _emit_job_method(j: dict, job_method: str) -> list[str]:
    job_name = j.get("job_name", "UNKNOWN")
    purpose = j.get("purpose", "")
    step_calls = [
        f"{_camel((p.get('step') or p.get('name') or 'step').lower())}Step(jobRepository, txManager)"
        for p in (j.get("programs") or [])
    ]
    if not step_calls:
        step_calls = ["placeholderStep(jobRepository, txManager)"]
    body_builder = [
        f'        return new JobBuilder("{job_name}", jobRepository)',
        f"            .start({step_calls[0]})",
    ]
    for s in step_calls[1:]:
        body_builder.append(f"            .next({s})")
    body_builder.append("            .build();")
    out = [
        "    /**",
        f"     * Job {job_name}: {purpose}",
        "     */",
        '    @Bean',
        f"    public Job {job_method}(JobRepository jobRepository,",
        '            @Qualifier("transactionManager") PlatformTransactionManager txManager) {',
    ]
    out += body_builder
    out.append("    }")
    return out


def _emit_step_methods(j: dict) -> list[str]:
    out: list[str] = []
    seen: set[str] = set()
    for p in j.get("programs") or []:
        step_name = (p.get("step") or p.get("name") or "step").lower()
        method = _camel(step_name) + "Step"
        if method in seen:
            continue
        seen.add(method)
        prog_name = p.get("name", "?")
        prog_purpose = p.get("purpose", "")
        prog_uuid = p.get("uuid") or "—"
        out += [
            "    /**",
            f"     * Step {p.get('step','?')} — invokes program {prog_name} (uuid: {prog_uuid}).",
            f"     * <p>Purpose: {prog_purpose}",
            "     */",
            "    @Bean",
            f"    public Step {method}(JobRepository jobRepository,",
            '            @Qualifier("transactionManager") PlatformTransactionManager txManager) {',
            '        Tasklet tasklet = (contribution, chunkContext) -> {',
            f'            // TODO: replace with translated logic from COBOL program {prog_name}.',
            '            //       Inputs / outputs / dispositions are documented in the JCL DD list.',
            '            return RepeatStatus.FINISHED;',
            '        };',
            f'        return new StepBuilder("{step_name}", jobRepository)',
            '            .tasklet(tasklet, txManager)',
            '            .build();',
            "    }",
            "",
        ]
    if not out:
        out = [
            "    /** Placeholder step for a job with no recognized programs. */",
            "    @Bean",
            "    public Step placeholderStep(JobRepository jobRepository,",
            '            @Qualifier("transactionManager") PlatformTransactionManager txManager) {',
            '        Tasklet tasklet = (contribution, chunkContext) -> RepeatStatus.FINISHED;',
            '        return new StepBuilder("placeholder", jobRepository)',
            '            .tasklet(tasklet, txManager).build();',
            "    }",
            "",
        ]
    return out


def _wrap(text: str, prefix: str, width: int = 92) -> str:
    if not text:
        return f"{prefix}*"
    lines: list[str] = []
    for paragraph in str(text).split("\n"):
        words = paragraph.strip().split()
        line = ""
        for w in words:
            if len(line) + len(w) + 1 > width:
                lines.append(f"{prefix}* {line}")
                line = w
            else:
                line = (line + " " + w).strip()
        if line:
            lines.append(f"{prefix}* {line}")
    return "\n".join(lines) if lines else f"{prefix}*"


def _pascal(s: str) -> str:
    parts = [p for p in re.split(r"[^A-Za-z0-9]+", s) if p]
    if not parts:
        return "X"
    out = "".join(p[0].upper() + p[1:].lower() for p in parts)
    if out and out[0].isdigit():
        out = "J" + out
    return out


def _camel(s: str) -> str:
    parts = [p for p in re.split(r"[^A-Za-z0-9]+", s) if p]
    if not parts:
        return "x"
    head = parts[0].lower()
    tail = "".join(p[0].upper() + p[1:].lower() for p in parts[1:])
    out = head + tail
    if out and out[0].isdigit():
        out = "j" + out
    return out


def main():
    spec_path = ROOT / "demo" / "batch_chain_spec.json"
    out_path = ROOT / "demo" / "java" / "PosttranIntcalcCreastmtConfiguration.java"
    if not spec_path.is_file():
        raise SystemExit(
            f"{spec_path} not found. Run `python -m llm.demo` first to generate the spec."
        )
    written = emit(spec_path, out_path)
    print(f"wrote {written}")


if __name__ == "__main__":
    main()
