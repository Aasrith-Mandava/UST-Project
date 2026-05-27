"""
Grounding verification.
Scans LLM output for any UUID-like substrings and checks that each one resolves
to a real row in the nodes table.

Output: a report with the count of references, the count of resolved references,
and the list of any unresolved ones.
"""
import re
from typing import Iterable

from api.database import connect

UUID_RE = re.compile(r"\b[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\b")


def find_uuids(text: str) -> list[str]:
    return UUID_RE.findall(text or "")


def verify(uuids: Iterable[str]) -> dict:
    uuids = list(set(uuids))
    if not uuids:
        return {"references": 0, "resolved": 0, "unresolved": [], "by_kind": {}}
    placeholders = ",".join("?" * len(uuids))
    with connect() as conn:
        rows = conn.execute(
            f"SELECT uuid, kind FROM nodes WHERE uuid IN ({placeholders})",
            uuids
        ).fetchall()
    resolved = {r["uuid"]: r["kind"] for r in rows}
    unresolved = [u for u in uuids if u not in resolved]
    by_kind: dict[str, int] = {}
    for k in resolved.values():
        by_kind[k] = by_kind.get(k, 0) + 1
    return {
        "references": len(uuids),
        "resolved": len(resolved),
        "unresolved": unresolved,
        "by_kind": by_kind,
        "pct": round(100.0 * len(resolved) / len(uuids), 1)
    }
