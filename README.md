# CardDemo Modernization Pipeline

**UST CodeCrafter Championship Submission**

A deterministic ANTLR-based parser pipeline for the AWS Mainframe Modernization CardDemo
corpus, with grounded LLM specification generation and Java forward engineering.

---

## What this is

A complete, runnable modernization platform that converts the **AWS CardDemo** mainframe
corpus (~60,000+ lines of COBOL, JCL, BMS, CSD, Assembler, copybooks) into:

- **174 structured JSON artifacts** keyed by stable UUIDs
- A **16,070-node SQLite knowledge graph** with 9 cross-linked tables
- **4 Mermaid diagrams** (call graph · transaction flow · JCL chain · file I/O)
- **3 grounded LLM specifications** (program · paragraph · batch chain) — all at 100% UUID grounding
- A **40-file forward-engineered Java repository** (~38,000 lines) laid out as a Maven project
- A **REST API** with 28+ endpoints (every artifact addressable by UUID)
- An **industry-grade web UI** for browsing, exploring, and demoing the bundle

Built per the brief's three non-negotiable rules:

1. **No raw source reaches the LLM.** Agents receive structured AST + symbol + CFG slices only.
2. **Every artifact has a stable UUID** = SHA-256(file + kind + line + col) → first 32 hex.
3. **Cross-references are UUIDs, not strings.** The bundle is a graph traversal, not a text search.

---

## Quick start (single command)

```bash
./run.sh           # full clean rebuild
./start.sh         # start the web app (assumes pipeline already ran)
```

Open **http://localhost:8000** — Dashboard lands first.

Requirements: JDK 17, Maven 3.9+, Python 3.9+. Both `GEMINI_API_KEY` and `GROQ_API_KEY`
in `.env` for LLM features (fixture fallback if neither present).

---

## What the pipeline does (8 phases)

| # | Phase | Tooling | Produces |
|---|---|---|---|
| 1 | Parse corpus | **ProLeap** (ANTLR COBOL) + **ANTLR JCL/BMS/CSD grammars** + ASM stub recognizer | 89 deep-parsed AST JSONs |
| 2 | Extra scanners | Python regex for non-grammar types | 54 inventory artifacts (copybook, PROC, CTL, MAC, scheduler) |
| 3 | Coverage report | Java | `output/coverage_report.json` — honest pass/fail per type |
| 4 | Build graph store | Java | `output/carddemo.db` SQLite, 16k nodes + 9 cross-linked tables |
| 5 | Mermaid diagrams | Python | 4 `.md` files in `output/diagrams/` |
| 6 | LLM spec generation | Gemini → Groq fallback | 3 grounded demo specs in `demo/` |
| 7 | Java skeleton emission | Python + javac verification | `demo/java-repo/.../Cotrn02c.java` (~1,600 lines, compile-clean) |
| 8 | Spring Batch emission | Python | Spring Batch `@Configuration` for the POSTTRAN→INTCALC→CREASTMT chain |

Total wall time: ~2 minutes (Gemini rate-limit dominates).

---

## Submission ↔ artifact contract (brief §7)

| Layer | Item | Status |
|---|---|:---:|
| L1 | AST per file (typed, UUID, source range) | ✅ |
| L1 | Provenance maps (COPY/REPLACE) | ✅ |
| L1 | Preprocessed source | ✅ |
| L2 | Data dictionary (PIC, USAGE, OCCURS, 88-levels) | ✅ |
| L2 | Paragraph/section inventory | ✅ |
| L3 | Def-use chains | ✅ (2,081 edges) |
| L3 | Control flow (paragraph-level) | ✅ (55 edges) |
| L4 | Call graph (static + CICS LINK/XCTL) | ✅ (40 edges) |
| L4 | File I/O graph | ✅ (48 ops) |
| L4 | Transaction flow | ✅ (32 edges) |
| L4 | JCL graph | ✅ (282 rows) |
| L4 | Copybook usage graph | ✅ (213 rows) |
| L5 | Business rule catalog (IF/EVALUATE) | ✅ |
| L6 | CICS CSD catalog | ✅ |
| L6 | BMS map catalog | ✅ |
| L6 | Copybook catalog with consumers | ✅ |
| L7 | Parse coverage report | ✅ |
| L7 | Migration risk register | ✅ (rendered live in `/specs/report` §13) |
| L8 | Forward engineering (Java) | ✅ |
| L8 | Forward engineering (Spring Batch) | ✅ |
| | **20 / 20 contract items satisfied** | **100%** |

---

## Where to look in the web UI

| Page | What it shows |
|---|---|
| **Dashboard** (`/`) | Pipeline review + canonical corpus breakdown with parse coverage per type |
| **Run Pipeline** (`/pipeline`) | One-click rebuild with live SSE stream + per-phase outcome cards + artifact contract checklist + demo readiness gates + embedded mini AST + mini call graph |
| **Programs** (`/programs`) | All 31 canonical COBOL programs. Click into any for paragraphs, calls, file I/O, copybooks |
| **Program detail** (`/programs/<NAME>`) | Paragraph list, call edges, control flow, file I/O · "View AST →" button |
| **AST Explorer** (`/programs/<NAME>/ast`) | Interactive Cytoscape AST tree, click any node for payload + source range |
| **Call Graph** (`/call-graph`) | System-wide force-directed call graph (CALL + CICS LINK/XCTL), click any program to focus its neighborhood |
| **Diagrams** (`/diagrams`) | 4 Mermaid diagrams: call graph, transaction flow, JCL chain, file I/O |
| **Per-File Specs** (`/file-specs`) | Multi-agent spec generator. Pick any file → 4 agents (Business Analyst, Technical Writer, Functional Analyst, Critic) produce a complete spec with embedded AST + local call graph + source excerpts |
| **Full Spec Report** (`/specs/report`) | ~270-page consolidated specification document, 13 sections, printable / save-as-PDF |
| **Transform Code** (`/repo`) | The 40-file Java repository — tree on the left, source viewer on the right, rebuild button |
| **Transactions** (`/transactions`) | CICS transactions from CSD |
| **Jobs** (`/jobs`) | All 38 JCL jobs with steps, DDs, datasets |
| **Copybooks** (`/copybooks`) | Per-copybook consumer list |
| **REST API docs** (`/docs`) | FastAPI auto-generated Swagger UI |

---

## Demonstration targets (brief §10)

Both canonical demo targets work end-to-end:

| Demo | Status | Where |
|---|:---:|---|
| Spec gen — **COTRN02C** (Transaction Add online program) | ✅ 100% grounded | `/specs/report` § 12 + `demo/program_spec_COTRN02C.json` |
| Spec gen — **POSTTRAN → INTCALC → CREASTMT** batch chain | ✅ 100% grounded | `demo/batch_chain_spec.json` |
| Forward eng — **emitted Java for COTRN02C** | ✅ compile-clean | `demo/java-repo/.../Cotrn02c.java` (1,600+ lines) |
| Forward eng — **emitted Spring Batch for the chain** | ✅ 10 @Bean defs | `demo/java-repo/.../batch/PosttranIntcalcCreastmtConfiguration.java` |

---

## Repository layout

```
.
├── corpus/carddemo/                  AWS CardDemo corpus (gitignored — re-cloned by run.sh)
├── corpus/cics-stubs/                Hand-written CICS/IMS copybook stubs for variant programs
├── src/main/java/com/carddemo/       Java pipeline (parsers, transforms, graph builder)
│   ├── parser/                       ANTLR-driven JCL/BMS/CSD parsers, ProLeap-driven COBOL
│   ├── transform/                    AST normalization, copybook preprocessor, UUID factory
│   ├── analysis/                     Call graph, def-use, file I/O, transaction flow builders
│   └── output/                       SQLite writer, JSON serializer
├── src/main/resources/grammars/      ANTLR .g4 grammars (JCLGrammar, BMSGrammar, CSDGrammar)
├── api/                              FastAPI REST + HTML routes
│   ├── main.py                       28+ endpoints
│   └── database.py                   SQLite connection helper
├── llm/                              Python LLM + post-processing modules
│   ├── demo.py                       3 demo specs (program / paragraph / batch chain)
│   ├── exhaustive_specs.py           Per-program spec generator (all 31)
│   ├── multi_agent.py                4-agent file-spec generator
│   ├── file_context.py               Per-file context builders for the multi-agent system
│   ├── retrieval.py                  Structured context packets (no raw source)
│   ├── grounding.py                  UUID grounding verifier
│   ├── report_builder.py             Full Spec Report aggregator (14 sections)
│   ├── java_emitter.py               Single-program Java emission
│   ├── repo_emitter.py               Multi-program Java repo emission
│   ├── batch_emitter.py              Spring Batch @Configuration emission
│   ├── mermaid.py                    4 Mermaid diagram generator
│   ├── extra_scanners.py             Python regex scanners for non-grammar file types
│   └── cobol_lower.py                PIC clause → canonical Java type
├── web/
│   ├── templates/                    16 Jinja2 templates (all UI pages)
│   └── static/                       CSS + JS (Cytoscape, marked, mermaid via CDN)
├── output/                           Pipeline output (gitignored)
│   ├── artifacts/                    174 per-file JSON artifacts
│   ├── diagrams/                     4 Mermaid .md files
│   ├── carddemo.db                   SQLite graph store
│   └── coverage_report.json
├── demo/                             LLM specs + forward-engineered Java
│   ├── program_spec_*.{json,md}      LLM-authored program specs
│   ├── paragraph_spec.{json,md}      LLM-authored paragraph spec
│   ├── batch_chain_spec.{json,md}    LLM-authored batch chain spec
│   ├── java-repo/                    Maven-laid-out Java project
│   └── file_specs/                   Multi-agent per-file specs (cached)
├── templates/                        LLM prompt templates (.txt)
├── run.sh                            One-command rebuild
├── start.sh                          Web app launcher
├── pom.xml                           Maven build (JDK 17, ProLeap 4.0.0, ANTLR 4.7.2)
└── api/requirements.txt              Python deps
```

---

## Three architectural rules upheld

**Rule 1 — No raw source reaches the LLM.**
- `llm/retrieval.py` builds structured packets (AST excerpt + symbols + CFG + def-use) for the LLM
- `llm/file_context.py` builds per-file context dicts for the multi-agent system
- The `source_excerpts` field (raw code shown to humans on the UI) is split out and never included in LLM prompts

**Rule 2 — Stable UUIDs.**
- `src/main/java/com/carddemo/transform/UuidFactory.java` produces `UUID.fromString(SHA-256(path + kind + line + col)[:32])`
- Same source byte-for-byte → identical UUID forever
- `rm -rf output && ./run.sh` rebuilds with byte-identical UUIDs (Rule 2 spot-checkable)

**Rule 3 — Cross-references via UUID.**
- Every FK in SQLite is a UUID
- LLM specs cite `uuid:xxxxxxxx-…` and `llm/grounding.py` mechanically verifies every claim resolves
- Demo grounding: 21/21, 21/21, 3/3 — **all 100%**

---

## License

Released under the MIT License per the championship's rules (§12). Open-source dependencies
credited in [CREDITS.md](CREDITS.md). Eligible for merge into UST CodeCrafter under UST's
standard contribution agreement.

---

## Author

Submitted to the UST CodeCrafter Championship 2026.
Primary AI agent declared: **Claude** (Sonnet 4 + Opus 4.7 via Claude Code).

---

## Operational notes

- The pipeline is **fully idempotent**: `rm -rf output && ./run.sh` produces byte-identical UUIDs.
- LLM generation respects the Gemini per-minute free-tier quota with 35s cooldowns and falls
  back to Groq automatically; a final fixture fallback ensures the demo runs even with both keys absent.
- The Java repo (`demo/java-repo/`) compiles standalone with `mvn compile`.
- All 15 web routes return 200; all 9 SQLite tables populated; all 4 Mermaid diagrams render;
  all 5 demo readiness gates green.
