# Credits

This pipeline stands on the shoulders of several open-source projects. The
championship brief explicitly encourages and requires acknowledging them.

## COBOL parser

**[ProLeap COBOL Parser](https://github.com/uwol/proleap-cobol-parser)** by
Ulrich Wolffgang. ANTLR4-based COBOL grammar with preprocessor, dialect support,
and a full ASG (abstract semantic graph) — the de facto open-source COBOL parser.
We use version `4.0.0` from `io.github.uwol:proleap-cobol-parser:4.0.0`.
**MIT License.**

## Parser runtime

**[ANTLR 4.7.2](https://www.antlr.org/)** runtime (transitive via ProLeap). The
parser generator that makes deterministic parsing of programming languages
tractable. **BSD License.**

## Java libraries

- **[Jackson Databind 2.16.1](https://github.com/FasterXML/jackson)** — JSON
  serialization for per-file artifact bundles. Apache 2.0.
- **[picocli 4.7.5](https://picocli.info/)** — annotation-driven CLI framework.
  We use it for the `App.java` subcommand layout. Apache 2.0.
- **[sqlite-jdbc 3.45.1.0](https://github.com/xerial/sqlite-jdbc)** — JDBC
  driver bundling a native SQLite build. Apache 2.0.
- **[SLF4J 2.0.9](https://www.slf4j.org/)** — logging facade (ProLeap dependency
  surface). MIT License.

## Python libraries

- **[FastAPI](https://fastapi.tiangolo.com/)** — the REST API service that
  exposes the artifact graph + serves the web UI via Jinja2 templates. MIT.
- **[Uvicorn](https://www.uvicorn.org/)** — ASGI server for FastAPI. BSD.
- **[Jinja2](https://palletsprojects.com/p/jinja/)** — templating engine for the
  web UI. BSD.
- **[google-generativeai](https://github.com/google-gemini/deprecated-generative-ai-python)** —
  Gemini SDK for the LLM spec-generation demo. Apache 2.0.
- **[groq](https://github.com/groq/groq-python)** — Groq SDK, used as the
  secondary LLM provider (per-agent fallback when Gemini is rate-limited; also
  the preferred provider for the Functional Analyst and Critic agents in the
  multi-agent file-spec system). Apache 2.0.

## Browser libraries (loaded via CDN)

- **[Cytoscape.js 3.28](https://js.cytoscape.org/)** — interactive graph
  rendering for the AST explorer and the system call graph pages. MIT.
- **[cytoscape-dagre 2.5](https://github.com/cytoscape/cytoscape.js-dagre)** —
  hierarchical (tree) layout adapter, used for AST rendering. MIT.
- **[dagre 0.8.5](https://github.com/dagrejs/dagre)** — DAG layout engine
  consumed by cytoscape-dagre. MIT.
- **[Mermaid 11](https://mermaid.js.org/)** — renders the 4 system diagrams
  (call graph, transaction flow, JCL chain, file I/O). MIT.
- **[Marked 13](https://marked.js.org/)** — Markdown rendering for LLM-authored
  spec sections in the UI. MIT.

## Corpus

**[AWS Mainframe Modernization CardDemo](https://github.com/aws-samples/aws-mainframe-modernization-carddemo)**
— the test corpus the championship is built around. AWS-provided sample code
deliberately exercising COBOL, JCL, BMS, CSD, copybooks, and assembler.
**MIT-0 License.**

## Tools

- **OpenJDK 17** (Homebrew distribution) — the JVM the pipeline targets.
- **Apache Maven 3.9** — Java build orchestration.

## What's *not* here

This pipeline is **not** a fork or derivation of any commercial mainframe
modernization product (BluAge, Heirloom, AWS Blu Insights, Micro Focus,
OpenLegacy, etc.). The parsing layer is ProLeap (open source); everything
above Layer 1 — the AST shape, the UUID scheme, the SQLite graph schema,
the REST API, the LLM retrieval/grounding layer, and the Java emitter — was
written for this championship submission.
