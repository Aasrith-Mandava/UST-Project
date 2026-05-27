#!/usr/bin/env bash
#
# UST CodeCrafter - CardDemo Pipeline runner
#
# Idempotent: re-running this script reproduces the artifact bundle byte-for-byte
# (Rule 2: stable UUIDs). Use --clean to wipe output/ and the local SQLite DB first.
#
# Usage:
#   ./run.sh            # build + parse + graph + diagrams + java emit + demo
#   ./run.sh --clean    # wipe output/ first
#   ./run.sh --serve    # also start the FastAPI server on :8000 at the end
#   ./run.sh --rebuild  # force-rebuild the jar
#

set -euo pipefail

# ---- locate JDK 17 (Homebrew default, can be overridden) -------------------
if [ -z "${JAVA_HOME:-}" ]; then
  if [ -d "/opt/homebrew/Cellar/openjdk@17/17.0.18/libexec/openjdk.jdk/Contents/Home" ]; then
    export JAVA_HOME="/opt/homebrew/Cellar/openjdk@17/17.0.18/libexec/openjdk.jdk/Contents/Home"
  elif command -v /usr/libexec/java_home >/dev/null 2>&1; then
    export JAVA_HOME="$(/usr/libexec/java_home -v 17 2>/dev/null || true)"
  fi
fi
if [ -z "${JAVA_HOME:-}" ] || [ ! -x "$JAVA_HOME/bin/java" ]; then
  echo "ERROR: JDK 17 not found. Install with 'brew install openjdk@17' or set JAVA_HOME."
  exit 1
fi
JAVA="$JAVA_HOME/bin/java"
MVN="mvn"

ROOT="$(cd "$(dirname "$0")" && pwd)"
cd "$ROOT"

CLEAN=0; SERVE=0; REBUILD=0
for arg in "$@"; do
  case "$arg" in
    --clean) CLEAN=1 ;;
    --serve) SERVE=1 ;;
    --rebuild) REBUILD=1 ;;
    --help|-h)
      grep -E '^#' "$0" | head -n 18 | sed 's/^# *//'
      exit 0
      ;;
    *) echo "Unknown arg: $arg"; exit 2 ;;
  esac
done

banner() { echo; echo "==== $* ===="; }

# ---- 0. prerequisites ------------------------------------------------------
banner "0. Prerequisites"
echo "JAVA_HOME=$JAVA_HOME"
$JAVA -version 2>&1 | sed 's/^/  /'
$MVN -version 2>&1 | head -1 | sed 's/^/  /'
python3 --version | sed 's/^/  /'

# ---- 1. corpus + ProLeap ---------------------------------------------------
banner "1. Corpus + ProLeap (clone if missing)"
mkdir -p corpus vendor
if [ ! -d corpus/carddemo ]; then
  echo "  cloning AWS CardDemo corpus..."
  git clone --depth 1 https://github.com/aws-samples/aws-mainframe-modernization-carddemo.git corpus/carddemo
else
  echo "  corpus/carddemo present"
fi
if [ ! -d vendor/proleap-cobol-parser ]; then
  echo "  cloning ProLeap COBOL parser..."
  git clone --depth 1 https://github.com/uwol/proleap-cobol-parser.git vendor/proleap-cobol-parser
else
  echo "  vendor/proleap-cobol-parser present"
fi
if [ ! -d "$HOME/.m2/repository/io/github/uwol/proleap-cobol-parser/4.0.0" ]; then
  echo "  installing ProLeap to local Maven repo (this can take a few minutes)..."
  ( cd vendor/proleap-cobol-parser && $MVN -q -DskipTests -Pskip.nist.tests install )
else
  echo "  ProLeap 4.0.0 already in local Maven repo"
fi

# ---- 2. build our jar ------------------------------------------------------
banner "2. Build pipeline jar"
JAR="target/carddemo-pipeline.jar"
if [ "$REBUILD" -eq 1 ] || [ ! -f "$JAR" ]; then
  $MVN -q -DskipTests package
fi
echo "  $JAR ($(du -h "$JAR" | cut -f1))"

RUN_JAR=( "$JAVA" -jar "$JAR" )

# ---- 3. python venv --------------------------------------------------------
banner "3. Python venv + deps"
if [ ! -d .venv ]; then
  python3 -m venv .venv
fi
.venv/bin/pip install -q --disable-pip-version-check -r api/requirements.txt
.venv/bin/python -c "import fastapi, google.generativeai; print('  fastapi', fastapi.__version__, ' gemini', google.generativeai.__version__)"

# ---- 4. clean if requested -------------------------------------------------
if [ "$CLEAN" -eq 1 ]; then
  banner "4. Clean output/"
  rm -rf output
fi
mkdir -p output

# ---- 5. parse all corpus file types ---------------------------------------
banner "5. Parse corpus (COBOL + JCL + BMS + CSD + ASM + provenance)"
"${RUN_JAR[@]}" parse-all

# ---- 5b. extra scanners (Python — types without an ANTLR grammar) ---------
banner "5b. Extra scanners (copybooks, PROCs, CTL, MAC)"
.venv/bin/python -m llm.extra_scanners

# ---- 6. coverage report ----------------------------------------------------
banner "6. Coverage report"
"${RUN_JAR[@]}" coverage

# ---- 7. build the SQLite graph store --------------------------------------
banner "7. Build graph store (SQLite at output/carddemo.db)"
"${RUN_JAR[@]}" build-graph --clear

# ---- 8. Mermaid diagrams ---------------------------------------------------
banner "8. Mermaid diagrams"
.venv/bin/python -m llm.mermaid

# ---- 9. forward-engineering: Java skeleton --------------------------------
banner "9. Forward engineering: Java skeleton for COTRN02C"
.venv/bin/python -m llm.java_emitter COTRN02C
"$JAVA_HOME/bin/javac" -d /tmp/carddemo-java-test demo/java/Cotrn02c.java
echo "  compiled cleanly: $(ls /tmp/carddemo-java-test/com/carddemo/generated/*.class | wc -l) class files"

# ---- 10. LLM demo (Gemini if .env present) --------------------------------
banner "10. LLM spec-generation demo"
.venv/bin/python -m llm.demo

# ---- 11. summary -----------------------------------------------------------
banner "Pipeline complete"
echo "Artifacts:"
echo "  - per-file JSON:      output/artifacts/{cbl,jcl,bms,csd,asm,provenance}/*.json"
echo "  - graph store:        output/carddemo.db"
echo "  - coverage report:    output/coverage_report.json"
echo "  - Mermaid diagrams:   output/diagrams/{call_graph,transaction_flow,jcl_chain,file_io}.md"
echo "  - Java emission:      demo/java/Cotrn02c.java"
echo "  - LLM spec outputs:   demo/{paragraph_spec,batch_chain_spec}.{json,md}"

if [ "$SERVE" -eq 1 ]; then
  banner "11. Starting API on http://localhost:8000 (Ctrl-C to stop)"
  exec .venv/bin/uvicorn api.main:app --host 0.0.0.0 --port 8000
else
  echo
  echo "To start the API:  ./run.sh --serve  (or)  .venv/bin/uvicorn api.main:app"
  echo "API endpoints documented at  http://localhost:8000/docs  once running."
fi
