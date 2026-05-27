# Implementation Log — Everything Built

Complete inventory of every module, page, endpoint, artifact type, and feature
shipped in this submission. Cross-referenced to the championship brief's
artifact contract (§7), submission requirements (§10), and judging rubric (§11).

---

## Top-level numbers

| Metric | Value |
|---|---|
| Files in the canonical CardDemo corpus | 143 |
| Files deep-parsed via real grammar (ANTLR/ProLeap) | 89 |
| Files scanned via Python regex (inventory) | 54 |
| Parsed JSON artifacts produced | 174 |
| SQLite graph nodes | 16,070 |
| SQLite tables (graph layer) | 9 cross-linked |
| Mermaid diagrams generated | 4 |
| Demo LLM specs (grounding %) | 3 specs · 100% grounded |
| Forward-engineered Java files | 40 |
| Forward-engineered Java lines | 38,106 |
| Web routes (HTML pages) | 16 |
| REST API endpoints | 28+ |
| Web templates (Jinja2) | 17 |
| Java source modules | ~30 |
| Python source modules | 17 |
| Documentation files (markdown) | 4 |

---

## Architectural rules upheld

### Rule 1 — No raw source reaches the LLM

| Where enforced | How |
|---|---|
| `llm/retrieval.py` | Builds structured AST+symbol+CFG+def-use packets for the LLM |
| `llm/file_context.py` | Per-file context (different shape per kind) for the multi-agent systems |
| `llm/modernizer.py` | Pulls only structured artifact JSON; passes to Code Emitter agent |
| `llm/report_builder.py` | Aggregates from SQLite — no source ever touches Gemini/Groq |
| Source excerpts | Split into a separate `source_excerpts` key, served only to the UI's syntax-highlight panels — never included in any LLM prompt |

### Rule 2 — Stable UUIDs

- `src/main/java/com/carddemo/transform/UuidFactory.java`
- Formula: `UUID.fromString(SHA-256(file + ":" + kind + ":" + line + ":" + col)[:32].formatAsUuid())`
- Same source byte-for-byte → identical UUID across every rebuild
- Verifiable: `rm -rf output && ./run.sh` reproduces every UUID

### Rule 3 — Cross-references by UUID

- Every foreign key in SQLite is a UUID column (caller_uuid, callee_uuid, site_uuid, …)
- LLM specs cite `uuid:xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`
- `llm/grounding.py` mechanically walks every cited UUID and verifies it resolves in `nodes`
- Demo grounding: 21/21, 21/21, 3/3 — **100% across all three**

---

## Java pipeline (deterministic layer)

### Build infrastructure

| File | Role |
|---|---|
| `pom.xml` | Maven build: JDK 17, ProLeap 4.0.0, ANTLR 4.7.2, shade plugin (fat jar), build-helper for ANTLR-generated sources |
| `src/main/resources/grammars/JCLGrammar.g4` | ANTLR JCL grammar — JOB / EXEC / DD / PROC / PEND / SET / INCLUDE / IF / ELSE / ENDIF |
| `src/main/resources/grammars/BMSGrammar.g4` | ANTLR BMS grammar — DFHMSD / DFHMDI / DFHMDF with paramList |
| `src/main/resources/grammars/CSDGrammar.g4` | ANTLR CSD grammar — DEFINE PROGRAM/TRANSACTION/MAPSET/FILE/LIBRARY/TYPETERM/TDQUEUE/TSMODEL/+ with permissive attribute values |

### Parsers (`src/main/java/com/carddemo/parser/`)

| File | What it parses | Tooling |
|---|---|---|
| `CobolParser.java` | Every `.cbl` file | ProLeap (ANTLR4 COBOL grammar) |
| `JclParser.java` | Every `.jcl` file | ANTLR-generated parser + Java continuation-line preprocessing |
| `BmsParser.java` | Every `.bms` file | ANTLR + DFH `X`-continuation handling |
| `CsdParser.java` | Every `.csd` file | ANTLR + multi-line DEFINE block joining |
| `ExecCicsExtractor.java` | EXEC CICS blocks inside COBOL | Mini ANTLR sub-grammar |
| `ExecSqlExtractor.java` | EXEC SQL blocks inside COBOL | Recognizer-only |
| `AsmStubRecognizer.java` | `.asm` files | Identifies `CSECT` / `ENTRY` directives |

### Transform layer (`src/main/java/com/carddemo/transform/`)

| File | Role |
|---|---|
| `UuidFactory.java` | Stable UUID generation (Rule 2) |
| `CopybookPreprocessor.java` | COPY ... REPLACING expansion with provenance tracking |
| `CstToAstVisitor.java` | ProLeap CST → typed AST nodes (UUID + source range) |
| `SymbolTableBuilder.java` | Per-program scoped symbol table |
| `DataDictionary.java` | Normalized PIC clauses + canonical type system |
| `TypeNormalizer.java` | PIC → `{kind, precision, scale, signed, packed}` |

### Analysis layer (`src/main/java/com/carddemo/analysis/`)

| File | Output graph |
|---|---|
| `CobolGraphBuilder.java` | Drives the entire graph population from parsed JSON artifacts |
| `ControlFlowGraph.java` | `control_flow` table (PERFORM, GO TO, IF, EVALUATE, fall-through) |
| `DefUseChains.java` | `def_use` table (MOVE, COMPUTE, ADD/SUB/MUL/DIV, INITIALIZE, READ INTO) |
| `CallGraph.java` | `call_graph` table (static CALL, CICS LINK/XCTL) |
| `FileIoGraph.java` | `file_io` table (READ/WRITE/STARTBR/READNEXT/etc.) |
| `TransactionFlow.java` | `transaction_flow` table (CICS XCTL/LINK/RETURN + CSD entries) |
| `JclGraph.java` | `jcl_job` table (job → step → DD → DSN) |
| `CopybookUsageGraph.java` | `copybook_use` table |

### Output layer (`src/main/java/com/carddemo/output/`)

| File | Role |
|---|---|
| `SqliteWriter.java` | Persists nodes + edges to `output/carddemo.db` (WAL mode, 9 cross-linked tables) |
| `JsonWriter.java` | Per-file JSON artifact serialization |

### CLI (`src/main/java/com/carddemo/App.java`)

picocli-driven subcommands:

| Subcommand | Action |
|---|---|
| `parse-cobol --in <dir> --out <dir>` | Parse all .cbl files in a directory |
| `parse-jcl --in <dir> --out <dir>` | Parse all .jcl files |
| `parse-bms --in <dir> --out <dir>` | Parse all .bms files |
| `parse-csd --in <dir> --out <dir>` | Parse all .csd files |
| `parse-asm --in <dir> --out <dir>` | Recognize Assembler entry points |
| `provenance --in <dir> --out <dir> --cpy-dirs ...` | Run copybook preprocessor |
| `parse-all` | Drives all 6 above in sequence |
| `coverage` | Emit `output/coverage_report.json` |
| `build-graph --clear` | Build SQLite from JSON artifacts |

---

## Python pipeline (analysis + LLM + emission)

### LLM modules (`llm/`)

| File | Role | LLM provider |
|---|---|---|
| `demo.py` | 3 demo specs: program (COTRN02C), paragraph (VALIDATE-INPUT-DATA-FIELDS), batch chain (POSTTRAN→INTCALC→CREASTMT) | Gemini → Groq fallback |
| `exhaustive_specs.py` | Per-program spec generator across all 31 canonical programs | Gemini → Groq |
| `multi_agent.py` | **4-agent file-spec system**: BusinessAnalyst + TechnicalWriter + FunctionalAnalyst + Critic | Gemini (writers) + Groq (analyst/critic) |
| `modernizer.py` | **2-agent per-file code modernizer**: CodeEmitter + Critic with per-kind targets | Gemini + Groq |
| `file_context.py` | Per-file context builders for the 10 file kinds | n/a |
| `retrieval.py` | Structured context packets for the LLM | n/a |
| `grounding.py` | UUID grounding verifier — every claim must resolve | n/a |
| `report_builder.py` | **14-section Full Spec Report** aggregator (~270 pages) | n/a |
| `java_emitter.py` | Single-program rule-based Java emission with spec-driven Javadoc | n/a (deterministic) |
| `repo_emitter.py` | Multi-program Java repo emission (Maven layout, 39 programs) | n/a |
| `batch_emitter.py` | Spring Batch `@Configuration` for recognized batch chains | n/a |
| `mermaid.py` | Generates 4 Mermaid diagrams from the graph | n/a |
| `extra_scanners.py` | Python regex scanners for non-grammar file types (copybook, PROC, CTL, MAC, scheduler) | n/a |
| `cobol_lower.py` | PIC clause → canonical Java type (BigDecimal / long / String / record) | n/a |
| `parse_variants.py` | (Preserved but unused now) Variant-subproject COBOL parser | n/a |

### Prompt templates (`templates/`)

| File | Used by |
|---|---|
| `program_spec.txt`, `program_spec_v2.txt` | `demo.py / exhaustive_specs.py` for program-level specs |
| `paragraph_spec.txt`, `paragraph_spec_v2.txt` | `demo.py` for paragraph specs |
| `batch_chain_spec.txt`, `batch_chain_spec_v2.txt` | `demo.py` for batch chain specs |

(Plus inline prompts in `multi_agent.py` and `modernizer.py` for the agent flows.)

---

## API surface (`api/main.py`)

### HTML page routes (16)

| Path | Template | Purpose |
|---|---|---|
| `/` | `home.html` | Dashboard — pipeline review + corpus breakdown |
| `/pipeline` | `pipeline.html` | Run pipeline with live SSE outcomes + contract checklist + demo gates + mini AST/call-graph |
| `/programs` | `programs.html` | All 31 COBOL programs |
| `/programs/{name}` | `program_detail.html` | Per-program detail with paragraphs/calls/file I/O |
| `/programs/{name}/ast` | `ast_explorer.html` | Interactive Cytoscape AST tree |
| `/paragraphs/{uuid}` | `paragraph_detail.html` | Per-paragraph drill-down |
| `/diagrams` | `diagrams.html` | 4 Mermaid diagrams (call graph, transaction flow, JCL chain, file I/O) |
| `/file-specs` | `file_specs.html` | Multi-agent per-file spec generator (10 file kinds, 4 agents) |
| `/specs/report` | `spec_report.html` | Comprehensive 14-section spec report (~270 pages) |
| `/repo` | `modernize.html` | **Per-file code modernizer** (10 file kinds, 2-agent flow + COBOL rule-based) |
| `/repo/all` | `repo.html` | Original flat Java-repo browser (batch view) |
| `/call-graph` | `call_graph.html` | System-wide interactive Cytoscape call graph |
| `/transactions` | `transactions.html` | CICS transactions from CSD |
| `/jobs` | `jobs.html` | All 38 JCL jobs |
| `/jobs/{name}` | `job_detail.html` | Per-job detail |
| `/copybooks` | `copybooks.html` | Per-copybook consumer list |
| `/documentation` | `documentation.html` | Browse all .md docs in the project |

### REST API endpoints (per the brief §8)

| Endpoint | Returns |
|---|---|
| `GET /health` | `{status, node_count}` |
| `GET /stats` | Row counts per SQLite table |
| `GET /node/{uuid}` | One node by UUID |
| `GET /program/{name}` | Program metadata + paragraph UUIDs |
| `GET /paragraph/{uuid}` | Paragraph AST + statements |
| `GET /data-item/{uuid}` | Data item with type, scope |
| `GET /callers/{target}` | Programs that call this target |
| `GET /callees/{caller}` | Programs this caller invokes |
| `GET /control-flow/{program}` | CFG for one program |
| `GET /def-use/{name}` | Def-use chain for a data item |
| `GET /business-rules/{program}` | IF/EVALUATE catalog |
| `GET /file-accesses/{program}` | File I/O operations |
| `GET /transaction-flow/{transaction_id}` | Reachable transaction graph |
| `GET /job-chain/{job}` | Upstream/downstream jobs |
| `GET /copybook-consumers/{copybook}` | Programs that include this copybook |

### SSE streaming endpoints

| Endpoint | Purpose |
|---|---|
| `GET /api/pipeline/stream?clean=0|1` | Live 8-phase pipeline run with structured outcome events per phase |
| `GET /api/repo/build` | Live multi-program Java repo build (39 programs) |
| `GET /api/file-specs/{kind}/{filename}/generate?force=0|1` | Multi-agent file spec generation |
| `GET /api/modernize/{kind}/{filename}/generate?force=0|1` | Multi-agent code modernization |

### JSON helper endpoints

| Endpoint | Purpose |
|---|---|
| `GET /api/pipeline/summary` | Post-run artifact counts |
| `GET /api/programs/{name}/ast?max_nodes=N` | Cytoscape-shaped AST elements |
| `GET /api/graph/calls` | Cytoscape-shaped system call graph |
| `GET /api/repo/inventory` | Java repo file tree |
| `GET /api/repo/file?path=...` | One Java file's contents |
| `GET /api/file-specs/{kind}/{filename}/context` | Structured context + cached spec |
| `GET /api/modernize/{kind}/{filename}/context` | Structured context + cached modernization + target |
| `GET /api/documentation/{path:path}` | One markdown doc's content |
| `GET /docs` | FastAPI auto-generated Swagger UI |

---

## Web UI features (16 pages)

### Sidebar structure

```
┌──────────────────────────────────┐
│ COBOL Parser                     │
├──────────────────────────────────┤
│ WORKSPACE                        │
│  ◐ Dashboard                     │
│  ▶ Run Pipeline                  │
│ ARTIFACTS                        │
│  ≡ Programs                      │
│  ◇ Diagrams                      │
│ INTELLIGENCE                     │
│  ✎ Per-File Specs                │
│  ✎ Full Spec Report              │
│  ⌘ Transform Code                │
│ VISUALIZATIONS                   │
│  ⇄ Call Graph                    │
│  ⇄ Transactions                  │
│  ⊞ Jobs                          │
│  ◫ Copybooks                     │
│ REFERENCE                        │
│  📖 Documentation                │
│  ↗ REST API                      │
└──────────────────────────────────┘
```

### Page-by-page feature inventory

**Dashboard (`/`)** — 217-line template
- Pipeline review section with KPI tiles split into "own" vs "via copybook" (honest copybook-expansion accounting)
- Corpus breakdown for 10 canonical file types with parse coverage (deep + inventory split)
- Three architectural rules cards
- Footer summary card

**Run Pipeline (`/pipeline`)** — 8-phase orchestrator
- Live SSE stream with phase stepper + console
- Per-phase structured outcome cards (counts, tables, SQLite rows, grounding %)
- Artifact contract checklist (20 items, Layer 1–8)
- Demo readiness gates (5 cards mapped to brief §10)
- Embedded mini AST (Cytoscape) + mini call graph
- "Where to look next" deep-link cards

**Programs (`/programs`)** — Sortable table of 31 programs
- Paragraph count, statement count, data items, file I/O, calls, copybooks per program

**Program Detail (`/programs/{name}`)**
- Tabbed: Paragraphs · Calls · File I/O · Control Flow · Copybooks
- "View AST →" button → AST Explorer

**AST Explorer (`/programs/{name}/ast`)** — Cytoscape dagre tree
- Color-coded by node kind (CompilationUnit/Paragraph/Statement/DataItem/ExecCicsBlock)
- Click any node → side panel with full JSON payload
- Layout switcher (dagre / breadthfirst / cose)

**Paragraph Detail (`/paragraphs/{uuid}`)**
- Statement-by-statement breakdown
- File I/O in this paragraph
- Calls from this paragraph
- Def-use accesses

**Diagrams (`/diagrams`)** — 4 Mermaid diagrams
- Call Graph · Transaction Flow · JCL Chain · File I/O
- Per-tab on-demand rendering (fixes Mermaid 11 + tab-content interaction)
- Print-friendly

**Per-File Specs (`/file-specs`)** — 4-agent system
- Accordion sidebar with 10 file kinds
- 6 sections per file: Context Summary · Business Summary · Technical Spec · Functional Spec · Critic Review · Parser Artifacts (AST · local call graph · source excerpts · raw JSON)
- Live agent status: BusinessAnalyst · TechnicalWriter · FunctionalAnalyst · Critic
- Disk-cached per file

**Full Spec Report (`/specs/report`)** — 14-section consolidated doc
- ~270 pages of dense content
- Sticky TOC sidebar with per-program nav
- Print / Save as PDF button with @media print stylesheet
- 13 H1 sections · 46 H2 · 272 H3 · 217 tables

**Transform Code (`/repo`)** — Per-file code modernizer
- Accordion sidebar of 10 file kinds with target framework label per kind
- Multi-agent pipeline status (CodeEmitter + Critic + rule-based Java emitter for COBOL)
- 3 sections per file: Source Context · Generated Code · Critic Review
- Verdict pill (APPROVED / NEEDS_REVISION / MAJOR_ISSUES / DETERMINISTIC)
- Copy code + Download `.java` buttons
- Per-kind targets: Java/Spring Boot, Spring Batch, Thymeleaf, Spring Config, Java records, etc.
- "Batch view" link to `/repo/all` (original flat tree)

**Call Graph (`/call-graph`)** — Cytoscape force-directed
- All 39 programs + 40 call edges
- Click any program → highlight neighborhood (in + out edges)
- Color-coded by edge kind (CALL_STATIC / CICS_LINK / CICS_XCTL)
- Layout switcher (cose / concentric / circle / grid)

**Transactions (`/transactions`)** — CICS transaction table
**Jobs (`/jobs`)** — 38 JCL jobs
**Job Detail (`/jobs/{name}`)** — Per-job step + DD detail
**Copybooks (`/copybooks`)** — Per-copybook consumer list

**Documentation (`/documentation`)** — Project docs browser
- Accordion sidebar of all `.md` files (root + `docs/`)
- Marked.js rendering with full markdown support
- Print-friendly

**REST API (`/docs`)** — FastAPI auto-generated Swagger UI

---

## Artifact bundle (output/)

```
output/
├── artifacts/
│   ├── cbl/                       (31 JSON files — full ASTs from ProLeap)
│   ├── jcl/                       (38 JSON files — from ANTLR JCL parser)
│   ├── bms/                       (17 JSON files — from ANTLR BMS parser)
│   ├── csd/                       (1 JSON file — from ANTLR CSD parser)
│   ├── asm/                       (2 JSON files — entry points)
│   ├── copybook/                  (47 JSON files — Python regex scanner)
│   ├── proc/                      (2 JSON files)
│   ├── ctl/                       (1 JSON file)
│   ├── mac/                       (2 JSON files)
│   ├── scheduler/                 (2 JSON files)
│   └── provenance/                (31 JSON files — copybook expansion map)
│
├── carddemo.db                    SQLite graph store, 9 tables, 16,070 nodes
├── coverage_report.json           Layer 7 — parse coverage honesty artifact
├── diagrams/
│   ├── call_graph.md              Mermaid diagram
│   ├── transaction_flow.md
│   ├── jcl_chain.md
│   └── file_io.md
├── modernized/                    Per-file code modernization cache
│   └── <kind>/<file>.json         (filled on demand from /repo)
└── file_specs/                    Per-file multi-agent spec cache
    └── <kind>/<file>.json         (filled on demand from /file-specs)
```

```
demo/
├── program_spec_*.{json,md}       LLM-authored program specs
├── paragraph_spec.{json,md}       LLM-authored paragraph spec
├── batch_chain_spec.{json,md}     LLM-authored batch chain spec
├── all_program_specs.json         Exhaustive spec index
├── java/                          Single-program Java emission
│   └── Cotrn02c.java
└── java-repo/                     Maven-laid-out Java project
    ├── pom.xml
    ├── README.md
    └── src/main/java/com/carddemo/generated/
        ├── Cbact01c.java          (one per program)
        ├── …
        └── batch/
            └── PosttranIntcalcCreastmtConfiguration.java
```

---

## Documentation files

| File | Lines | Content |
|---|---:|---|
| `README.md` | 217 | Submission cover sheet — what it is, how to run, 20/20 contract checklist, sidebar map, demo gates, repo layout, three-rules section |
| `CREDITS.md` | 77 | Every open-source dependency (ProLeap, ANTLR, FastAPI, Gemini, Groq, Cytoscape, Mermaid, Marked) with license |
| `docs/ARCHITECTURE.md` | ~280 | System diagram, 3 rules with code citations, module map, SQLite schema, pipeline orchestration, LLM provider strategy, 15-route web map |
| `docs/CardDemo-Championship-Brief.md` | ~150 | The championship brief — 8-layer artifact contract, 3 non-negotiable rules, judging rubric |
| `docs/IMPLEMENTATION.md` | (this file) | Exhaustive implementation inventory |
| `docs/IMPROVEMENTS.md` | (companion file) | Prioritized roadmap of what to focus on next |

All accessible at `/documentation` in the web UI.

---

## Operational tooling

| File | Purpose |
|---|---|
| `run.sh` | One-command pipeline rebuild (8 phases) |
| `start.sh` | Start web app on `:8000` (assumes pipeline ran) |
| `api/requirements.txt` | Python deps (fastapi, uvicorn, jinja2, google-generativeai, groq) |
| `pom.xml` | Maven build (JDK 17, ProLeap 4.0.0, ANTLR 4.7.2 + plugin) |
| `.env` | API keys (`GEMINI_API_KEY`, `GROQ_API_KEY`) — gitignored |

---

## Submission contract — 20/20 items satisfied

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
| | **TOTAL** | **20 / 20** |

## Demo gates — 5/5 ready

| Demo (per brief §10) | Status |
|---|:---:|
| Spec gen — COTRN02C program | ✅ 100% grounded |
| Spec gen — VALIDATE-INPUT-DATA-FIELDS paragraph | ✅ 100% grounded |
| Spec gen — POSTTRAN → INTCALC → CREASTMT chain | ✅ 100% grounded |
| Forward eng — Java emission | ✅ 39 files / 38,106 lines, compile-clean |
| Forward eng — Spring Batch emission | ✅ 10 @Bean defs |
