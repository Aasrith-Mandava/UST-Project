# UST CodeCrafter Championship — The CardDemo Challenge

**A deterministic parsing pipeline for legacy modernization at scale**

| | |
|---|---|
| **Champion** | Adnan Masood, Chief AI Architect, UST |
| **Issued** | Friday, May 15, 2026 |
| **Submission deadline** | End of day, Sunday, May 24, 2026 |
| **Finalist demos** | Monday, May 25, 2026 (afternoon) |
| **Winner announced** | Tuesday, May 26, 2026 |
| **Corpus** | [AWS Mainframe Modernization CardDemo](https://github.com/aws-samples/aws-mainframe-modernization-carddemo) |
| **Status** | OPEN |

---

## 1. Executive Summary

This championship asks one question and settles it: **which AI coding agent, in the hands of which engineer, can convert a real legacy mainframe corpus into the deterministic, queryable, cross-linked artifact bundle that any credible AI-assisted modernization platform must have?**

You have nine days. The corpus is the AWS Mainframe Modernization CardDemo — roughly 60,000+ lines of COBOL, JCL, BMS, CSD, Assembler, and copybooks, deliberately constructed by AWS to exercise every major mainframe paradigm. Your task is to build an **ANTLR-based parser pipeline** that produces the artifact contract specified in §7 of this document, and to demonstrate that the resulting bundle can drive both **(a) specification generation** and **(b) forward engineering** through downstream LLM-based emitters.

The winning submission becomes part of **CodeCrafter**, UST's AI-powered legacy modernization platform.

---

## 2. Why This Problem Matters

The dominant failure mode in AI-assisted legacy modernization is the assumption that an LLM can read COBOL and produce reliable specifications or reliable migrations directly from the source. **It cannot, at scale.** A million-line COBOL system has no structural grip an LLM can hold: every paragraph references variables defined elsewhere, every program is connected to others through `CALL`, `COPY`, `COMMAREA`, `XCTL`, and JCL job chains, and every business rule is buried in `IF`/`EVALUATE` predicates that mean nothing without their data dictionary.

The only architecture we have seen produce reliable results is to do the structural work **deterministically — with parsers and compilers — before any LLM enters the pipeline**. The LLM's job is then narrowed: not *"read this COBOL and tell me what it does,"* but *"given this paragraph's AST, its symbol-table slice, its CFG context, its called paragraphs, and its def-use chains, write a specification."* Every claim the LLM produces can be back-referenced to a node ID in the artifact store.

ANTLR is how you build that deterministic layer.

---

## 5. The Architectural Thesis (Non-Negotiable Rules)

**Rule 1: No raw source reaches the LLM.** Not for spec generation. Not for forward engineering. The LLM receives structured artifacts — AST nodes, symbol slices, CFG fragments, business-rule predicates — and emits text grounded in them. Source code is referenced by node ID, not pasted into the prompt.

**Rule 2: Every artifact is traceable.** Every node carries a stable UUID. Every UUID resolves to a source file, line range, and column range. Every claim downstream of the pipeline can be verified against the source mechanically.

**Rule 3: Artifacts cross-link.** A paragraph node references its statements, which reference data items, which reference type definitions, which reference copybook origins. Querying the bundle is a graph traversal, not a text search.

---

## 7. The Artifact Contract (8 Layers)

Every layer below depends on the layers above it. Every artifact must be addressable by a **stable UUID** and traceable back to a source location. Every cross-reference between layers is by UUID, not by string name.

### Layer 1 — Per-file structural artifacts (direct ANTLR output)
- CST + token stream per source file (with hidden-channel tokens)
- AST per file (typed tree, UUID, source range)
- Preprocessed source with COPY/REPLACE expansions + provenance map

### Layer 2 — Program-local symbol artifacts
- Symbol table, scoped (every identifier, def/refs/scope/visibility)
- Data dictionary (PIC, USAGE, SIGN, OCCURS/ODO, REDEFINES, 88-levels, copybook origin)
- Canonical type system
- Paragraph/section inventory

### Layer 3 — Intra-program graphs
- CFG at paragraph + statement granularity
- Def-use chains per variable
- Slicing index

### Layer 4 — Inter-program / system-level graphs
- Call graph (static + dynamic via const-prop, CICS LINK/XCTL)
- Copybook usage graph
- File I/O graph (READ/WRITE/STARTBR/...)
- DB2 access graph (via EXEC SQL)
- IMS access graph (via EXEC DLI)
- MQ graph (PUT/GET with correlation IDs)
- Transaction-flow graph
- Screen/Map graph (BMS → COMMAREA → program)
- JCL graph (job → step → program → DD → dataset)
- Job dependency graph (cross-job dataset reuse)

### Layer 5 — Extracted business logic
- Business rule catalog (every IF/EVALUATE with predicates + branch summaries)
- Arithmetic specification (canonical COMPUTE trees with precision/scale)
- Data lineage / MOVE chains
- Validation rules (BMS + input-checking paragraphs)

### Layer 6 — Resource definitions, normalized
- CICS CSD catalog
- VSAM file schemas
- BMS map catalog
- DB2 DDL catalog
- Copybook catalog with consumers

### Layer 7 — Quality, coverage, risk
- Parse coverage report (the honesty artifact)
- Complexity metrics
- Dead code report
- Clone report
- Migration risk register

### Layer 8 — Forward-engineering-specific
- Canonical IR
- Architectural seam analysis (bounded contexts)
- Test seed corpus

---

## 8. Output Format & Storage

- Per-file artifacts in JSON or JSON-LD, one per source file
- Graph store (SQLite or DuckDB) with cross-linked tables, all FKs as UUIDs
- Source traceability table `nodes(uuid, kind, source_file, start_line, end_line, start_col, end_col, parent_uuid, payload_json)`
- REST or GraphQL API with 11 required endpoints
- Mermaid diagrams generated from the call graph, transaction flow, JCL job chain, and file I/O graph

---

## 9. LLM Integration Layer

- A prompt template per task (paragraph spec, program spec, business-rule spec, file lineage, job-chain narrative)
- A retrieval function that, given a target UUID, assembles the relevant artifact slice
- A grounding check that, for each claim in the LLM output, identifies the artifact UUID supporting it

---

## 10. Submission Requirements

1. A runnable pipeline (one command, reproducible)
2. The artifact bundle itself
3. A REST or GraphQL API
4. Mermaid diagrams
5. Parse coverage report and migration risk register
6. Spec-generation demo (recommended: `COTRN02C` + `POSTTRAN → INTCALC → CREASTMT`)
7. Forward-engineering demo (Java, Kotlin, Python, or .NET)

---

## 11. Judging Rubric

| Weight | Criterion |
|---|---|
| **20%** | Parse coverage on the full corpus |
| **25%** | Artifact contract completeness |
| **15%** | Spec-generation demonstration quality |
| **15%** | Forward-engineering demonstration quality |
| **10%** | Engineering judgment |
| **5%** | Performance |
| **5%** | Migration risk register quality + coverage honesty |
| **5%** | Bonus: LangGraph orchestration |

A submission that scores below 60% on the artifact contract (criterion 2) cannot win, regardless of other scores. **The contract is the spec; meeting the contract is how you win.**

---

*— Adnan Masood, Chief AI Architect, UST · Issued May 15, 2026*

*Full brief on file; this is the documentation copy for in-app reference.*
