# Architecture

How the CardDemo modernization pipeline is built end-to-end.

---

## System overview

```
                     ┌────────────────────────────────────────────┐
                     │      AWS CardDemo corpus (210 files)       │
                     │  COBOL · JCL · BMS · CSD · Copybooks ·     │
                     │  Assembler · PROC · CTL · MAC · Scheduler  │
                     └─────────────────────┬──────────────────────┘
                                           │
                                           ▼
                ┌──────────────────────────────────────────────────┐
                │  PHASE 1-2 — Parsers (deterministic)             │
                │                                                  │
                │  ProLeap (ANTLR COBOL grammar) ──┐               │
                │  ANTLR JCL grammar ──────────────┤               │
                │  ANTLR BMS grammar ──────────────┼─► 174 JSONs  │
                │  ANTLR CSD grammar ──────────────┤               │
                │  ASM stub recognizer ────────────┤               │
                │  Python regex scanners ──────────┘               │
                │  (copybook/PROC/CTL/MAC/scheduler)               │
                └────────────────────────┬─────────────────────────┘
                                         │
                                         ▼
                ┌──────────────────────────────────────────────────┐
                │  PHASE 3-4 — Graph store (SQLite)                │
                │                                                  │
                │  16,070 nodes · 9 cross-linked tables            │
                │  Every node has a stable UUID                    │
                │  All FKs are UUIDs (Rule 3)                      │
                └────────────────────────┬─────────────────────────┘
                                         │
                ┌────────────────────────┼─────────────────────────┐
                ▼                        ▼                         ▼
        ┌────────────────┐      ┌────────────────┐       ┌─────────────────┐
        │ PHASE 5        │      │ PHASE 6        │       │ PHASE 7-8       │
        │ Mermaid (×4)   │      │ LLM specs (×3) │       │ Forward eng     │
        │                │      │ Gemini → Groq  │       │ Java + Spring   │
        │ call graph     │      │ structured     │       │ Batch emission  │
        │ tx flow        │      │ context only   │       │                 │
        │ JCL chain      │      │ (Rule 1)       │       │ 40 .java files  │
        │ file I/O       │      │ UUID grounded  │       │ 38,106 lines    │
        └────────────────┘      └────────────────┘       └─────────────────┘
                                         │
                                         ▼
                ┌──────────────────────────────────────────────────┐
                │  Web UI + REST API (FastAPI + Jinja2)            │
                │  15 routes · 28+ API endpoints · /docs Swagger   │
                └──────────────────────────────────────────────────┘
```

---

## Three architectural rules

### Rule 1 — No raw source reaches the LLM

Every LLM prompt receives a **structured context packet** built from the SQLite
graph, never raw COBOL text. Two places this is enforced:

- `llm/retrieval.py::paragraph_packet(uuid)` — assembles AST excerpt + symbol
  context + def-use cluster + called paragraphs for a paragraph UUID
- `llm/file_context.py::build_context(kind, file)` — assembles per-file context
  for the multi-agent system (different shape per file kind)

The raw source code shown in the UI's source-snippet panels is split into a
separate `source_excerpts` field that's stripped before any LLM call.

### Rule 2 — Stable UUIDs

`src/main/java/com/carddemo/transform/UuidFactory.java`:

```java
public static UUID forNode(String file, String kind, int line, int col) {
    String key = String.format("%s:%s:%d:%d", file, kind, line, col);
    String hash = sha256(key).substring(0, 32);
    return UUID.fromString(formatAsUuid(hash));
}
```

Same source byte-for-byte ⇒ identical UUID forever. `rm -rf output && ./run.sh`
rebuilds the entire graph with byte-identical UUIDs.

### Rule 3 — Cross-references by UUID

Every foreign key in the SQLite graph is a UUID column. `call_graph` rows have
`caller_uuid` / `callee_uuid` / `caller_site_uuid`; `def_use` has `data_item_uuid`
and `site_uuid`; etc. No string-based linking anywhere.

LLM-generated specs cite `uuid:xxxxxxxx-xxxx-…` and the **grounding engine**
(`llm/grounding.py`) walks every cited UUID and verifies it resolves in the
`nodes` table. Demo grounding is 21/21, 21/21, 3/3 — **all 100%**.

---

## Module map

### Java side — `src/main/java/com/carddemo/`

| Package | Role |
|---|---|
| `App.java` | picocli CLI: `parse-all`, `parse-cobol`, `parse-jcl`, `parse-bms`, `parse-csd`, `parse-asm`, `coverage`, `build-graph` |
| `parser/CobolParser.java` | Drives ProLeap (the COBOL ANTLR grammar) per file; emits typed AST nodes |
| `parser/JclParser.java` | Drives the JCL ANTLR grammar (`JCLGrammar.g4`) with continuation-line preprocessing |
| `parser/BmsParser.java` | Drives the BMS ANTLR grammar (`BMSGrammar.g4`) with DFH X-continuation handling |
| `parser/CsdParser.java` | Drives the CSD ANTLR grammar (`CSDGrammar.g4`) with multi-line DEFINE block joining |
| `parser/ExecCicsExtractor.java` | Mini ANTLR sub-grammar over EXEC CICS blocks |
| `parser/ExecSqlExtractor.java` | Recognizer for EXEC SQL blocks |
| `parser/AsmStubRecognizer.java` | Identifies CSECT / ENTRY in Assembler stubs |
| `transform/UuidFactory.java` | The stable-UUID engine (SHA-256 → first 32 hex → UUID format) |
| `transform/CopybookPreprocessor.java` | COPY ... REPLACING expansion with provenance tracking |
| `transform/CstToAstVisitor.java` | ProLeap CST → typed AST nodes |
| `analysis/*` | Graph builders: call graph, def-use, file I/O, transaction flow, JCL chain, copybook usage |
| `output/SqliteWriter.java` | Persists every node + edge to the 9-table SQLite store |
| `output/JsonWriter.java` | Per-file JSON artifact serialization |

### Python side — `llm/`

| Module | Role |
|---|---|
| `retrieval.py` | Structured context packets for the LLM (paragraph + batch chain + program) |
| `grounding.py` | UUID grounding verifier — every claim must resolve to a node |
| `demo.py` | Three demo specs: program (COTRN02C), paragraph (VALIDATE-INPUT-DATA-FIELDS), batch chain |
| `exhaustive_specs.py` | Per-program spec generator across all 31 canonical programs |
| `multi_agent.py` | 4-agent system: BusinessAnalyst + TechnicalWriter + FunctionalAnalyst + Critic |
| `file_context.py` | Per-file context builders (one per file kind: COBOL, copybook, JCL, BMS, CSD, …) |
| `report_builder.py` | Aggregates the Full Spec Report (14 sections, ~270 pages) |
| `java_emitter.py` | Single-program Java emission with PIC-aware typing + spec-driven Javadoc |
| `repo_emitter.py` | Multi-program Java repo emission (Maven layout for all 39 programs) |
| `batch_emitter.py` | Spring Batch `@Configuration` for recognized batch chains |
| `mermaid.py` | Generates 4 Mermaid diagrams from the graph |
| `extra_scanners.py` | Python regex scanners for non-ANTLR file types |
| `cobol_lower.py` | PIC clause → canonical Java type (BigDecimal / long / String / record) |

### API + UI — `api/main.py` + `web/`

| Layer | Implementation |
|---|---|
| HTTP | FastAPI + Uvicorn ASGI |
| Templates | Jinja2 (16 templates in `web/templates/`) |
| Static | CSS + JS in `web/static/`, third-party libs (Cytoscape, Mermaid, Marked) via CDN |
| SSE | Pipeline stream + multi-agent stream both use Server-Sent Events |
| DB connection | `api/database.py` — thin sqlite3 wrapper with row factory |

---

## Data model (SQLite schema)

```
nodes (uuid, kind, source_file, start_line, end_line, start_col, end_col,
       parent_uuid, name, payload_json)   ← Layer 1 source-traceability table

call_graph (caller_uuid, caller_program, callee_program, edge_kind,
            caller_site_uuid, line)        ← Layer 4

control_flow (program, from_paragraph, from_paragraph_uuid,
              to_paragraph, to_paragraph_uuid, edge_kind,
              site_uuid, line)             ← Layer 3

def_use (program, data_item_name, access_kind, statement_kind,
         site_uuid, line)                  ← Layer 3

file_io (program, file_name, operation, record_copybook,
         site_uuid, line)                  ← Layer 4

transaction_flow (transaction_id, edge_kind, from_program, to_program,
                  site_uuid, line)         ← Layer 4

jcl_job (job_name, step_name, step_program,
         dd_name, dsn, disp, source_file)  ← Layer 4

jcl_dependency (upstream_job, upstream_step, downstream_job, downstream_step,
                dataset, edge_uuid)        ← Layer 4

copybook_use (program, copybook, replacing_context, line, site_uuid)
                                            ← Layer 4

business_rules (uuid, program, kind, predicate_raw,
                predicate_resolved_json, then_summary, else_summary, line)
                                            ← Layer 5
```

Every FK is a UUID. Every UUID resolves to a `nodes` row. Every `nodes` row
resolves to a (source_file, start_line, end_line, start_col, end_col) tuple.

---

## Pipeline orchestration

`run.sh` is the single command. Internally:

1. **Prerequisites** — JDK 17, Maven 3.9+, Python 3.9+
2. **Clone CardDemo + ProLeap if absent**
3. **`mvn -DskipTests package`** — builds `target/carddemo-pipeline.jar` (shaded fat-jar)
4. **`.venv/bin/pip install -r api/requirements.txt`** — Python deps
5. **Phase 1** — `java -jar carddemo-pipeline.jar parse-all`
6. **Phase 2** — `python -m llm.extra_scanners`
7. **Phase 3** — `java -jar carddemo-pipeline.jar coverage`
8. **Phase 4** — `java -jar carddemo-pipeline.jar build-graph --clear`
9. **Phase 5** — `python -m llm.mermaid`
10. **Phase 6** — `python -m llm.demo` (3 grounded specs)
11. **Phase 7** — `python -m llm.java_emitter COTRN02C` + javac
12. **Phase 8** — `python -m llm.batch_emitter`

`./pipeline` runs the same 8 phases over SSE for browser feedback (with structured
outcome events per phase).

---

## LLM provider strategy

Each LLM call has a **preferred provider** and **fallback chain**:

| Caller | Preferred | Fallback | Notes |
|---|---|---|---|
| `demo.py` (3 demo specs) | Gemini 2.5-flash | Groq llama-3.3-70b → fixture | 35s sleep between Gemini calls (free-tier quota) |
| `exhaustive_specs.py` | Gemini | Groq | configurable cooldown |
| `multi_agent.py / BusinessAnalyst` | Gemini | Groq | verbose writer |
| `multi_agent.py / TechnicalWriter` | Gemini | Groq | verbose writer |
| `multi_agent.py / FunctionalAnalyst` | Groq | Gemini | faster, cheaper |
| `multi_agent.py / Critic` | Groq | Gemini | sees the other three outputs |

If both providers fail, a deterministic fixture fallback ensures the demo still
runs (with `mode = "fixture"` label so it's visibly distinct).

---

## Web routes (15 total)

| Path | Purpose |
|---|---|
| `/` | Dashboard — pipeline review + corpus breakdown |
| `/pipeline` | Run pipeline with live SSE outcomes |
| `/programs` | All 31 COBOL programs |
| `/programs/{name}` | Per-program detail |
| `/programs/{name}/ast` | Interactive AST explorer (Cytoscape) |
| `/diagrams` | 4 Mermaid diagrams |
| `/file-specs` | Multi-agent per-file spec generator |
| `/specs/report` | Comprehensive 14-section spec report |
| `/repo` | Forward-engineered Java repository browser |
| `/call-graph` | System-wide interactive call graph (Cytoscape) |
| `/transactions` | CICS transactions |
| `/jobs` | JCL jobs |
| `/jobs/{name}` | Per-job detail |
| `/copybooks` | Per-copybook consumer list |
| `/documentation` | Project documentation browser |
| `/health` | Liveness probe |
| `/docs` | FastAPI auto-generated Swagger UI |

Plus 13 REST endpoints under `/api/...` for the bundle data (program, paragraph,
data item, callers, callees, control flow, def-use, business rules, file
accesses, transaction flow, job chain, copybook consumers).
