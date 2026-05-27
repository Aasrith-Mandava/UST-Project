#!/usr/bin/env bash
#
# Start the CardDemo Pipeline web app on http://localhost:8000
#
# Usage:
#   ./start.sh           # default port 8000
#   ./start.sh 8080      # custom port
#   PORT=9000 ./start.sh # via env var
#

set -euo pipefail

cd "$(dirname "$0")"
PORT="${1:-${PORT:-8000}}"

# --- check prerequisites ---
if [ ! -d .venv ]; then
  echo "ERROR: .venv not found. Run ./run.sh first to set up dependencies."
  exit 1
fi
if [ ! -f output/carddemo.db ]; then
  echo "ERROR: output/carddemo.db not found. The artifact store hasn't been built yet."
  echo "       Run ./run.sh to parse the corpus and build the graph."
  exit 1
fi

# --- kill any stale server on the same port ---
EXISTING="$(lsof -ti:"$PORT" 2>/dev/null || true)"
if [ -n "$EXISTING" ]; then
  echo "Port $PORT is busy (PID $EXISTING). Stopping..."
  kill -9 $EXISTING 2>/dev/null || true
  sleep 1
fi

# --- start ---
echo "Starting CardDemo Pipeline web app on http://localhost:$PORT"
echo "Press Ctrl-C to stop."
echo
exec .venv/bin/uvicorn api.main:app --host 0.0.0.0 --port "$PORT"
