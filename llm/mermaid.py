"""
Generate Mermaid diagrams from the SQLite graph store.
Writes .md files under output/diagrams/.

Per the championship brief, we ship:
  1. Call graph (program -> program via CALL / CICS XCTL / CICS LINK)
  2. Transaction flow (CICS transactions reachable from each entry)
  3. JCL job chain (job -> step -> program -> dataset)
  4. File I/O graph (program -> file with operation)
"""
import argparse
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from api.database import connect


def _safe(name: str) -> str:
    """Mermaid node ID: keep alphanumerics + underscores; everything else -> _"""
    if not name:
        return "_unknown"
    return "".join(ch if ch.isalnum() or ch == "_" else "_" for ch in name)


def call_graph(out_dir: Path) -> Path:
    with connect() as conn:
        edges = conn.execute(
            "SELECT caller_program, callee_program, edge_kind FROM call_graph "
            "WHERE caller_program IS NOT NULL ORDER BY caller_program"
        ).fetchall()
    lines = ["# Call graph", "",
             "Static CALL + EXEC CICS LINK/XCTL edges across the CardDemo corpus.", "",
             "```mermaid", "graph LR"]
    seen_nodes = set()
    for e in edges:
        a, b = e["caller_program"], e["callee_program"]
        if not a or not b:
            continue
        sa, sb = _safe(a), _safe(b)
        if sa not in seen_nodes:
            lines.append(f"  {sa}[\"{a}\"]")
            seen_nodes.add(sa)
        if sb not in seen_nodes:
            lines.append(f"  {sb}[\"{b}\"]")
            seen_nodes.add(sb)
        style = {"CALL_STATIC": "-->", "CALL_DYNAMIC": "-.->", "CICS_LINK": "==>", "CICS_XCTL": "==>"}.get(e["edge_kind"], "-->")
        lines.append(f"  {sa} {style} |{e['edge_kind']}| {sb}")
    lines.append("```")
    out = out_dir / "call_graph.md"
    out.write_text("\n".join(lines))
    return out


def transaction_flow(out_dir: Path) -> Path:
    with connect() as conn:
        entries = conn.execute(
            "SELECT transaction_id, to_program FROM transaction_flow "
            "WHERE edge_kind='TX_ENTRY' ORDER BY transaction_id"
        ).fetchall()
        xctl = conn.execute(
            "SELECT from_program, to_program, edge_kind FROM transaction_flow "
            "WHERE edge_kind IN ('CICS_XCTL','CICS_LINK') ORDER BY from_program"
        ).fetchall()
    lines = ["# Transaction flow", "",
             "CICS transactions (entry points from CSD) plus CICS XCTL/LINK between programs.", "",
             "```mermaid", "graph LR"]
    seen = set()
    for e in entries:
        tid, prog = e["transaction_id"], e["to_program"]
        if not tid or not prog:
            continue
        st, sp = "tx_" + _safe(tid), _safe(prog)
        if st not in seen:
            lines.append(f"  {st}(({tid}))")
            seen.add(st)
        if sp not in seen:
            lines.append(f"  {sp}[\"{prog}\"]")
            seen.add(sp)
        lines.append(f"  {st} --> {sp}")
    for e in xctl:
        a, b = e["from_program"], e["to_program"]
        if not a or not b:
            continue
        sa, sb = _safe(a), _safe(b)
        if sa not in seen:
            lines.append(f"  {sa}[\"{a}\"]")
            seen.add(sa)
        if sb not in seen:
            lines.append(f"  {sb}[\"{b}\"]")
            seen.add(sb)
        lines.append(f"  {sa} ==> |{e['edge_kind']}| {sb}")
    lines.append("```")
    out = out_dir / "transaction_flow.md"
    out.write_text("\n".join(lines))
    return out


def jcl_chain(out_dir: Path) -> Path:
    with connect() as conn:
        steps = conn.execute(
            "SELECT DISTINCT job_name, step_name, step_program FROM jcl_job "
            "WHERE step_program IS NOT NULL ORDER BY job_name, step_name"
        ).fetchall()
        deps = conn.execute(
            "SELECT upstream_job, downstream_job, dataset FROM jcl_dependency ORDER BY upstream_job"
        ).fetchall()
    lines = ["# JCL job chain", "",
             "All JCL jobs with their steps (job -> step -> program), plus cross-job dependencies",
             "derived from dataset reuse (writer's output is reader's input).", "",
             "## Jobs and steps", "", "```mermaid", "graph LR"]
    seen = set()
    for r in steps:
        job, step, prog = r["job_name"], r["step_name"] or "?", r["step_program"]
        sj, ss = _safe(job), _safe(job + "_" + step)
        sp = _safe("p_" + prog)
        if sj not in seen:
            lines.append(f"  {sj}[\"JOB {job}\"]")
            seen.add(sj)
        if ss not in seen:
            lines.append(f"  {ss}[\"{step}\"]")
            seen.add(ss)
        if sp not in seen:
            lines.append(f"  {sp}([{prog}])")
            seen.add(sp)
        lines.append(f"  {sj} --> {ss} --> {sp}")
    lines.append("```")
    lines.extend(["", "## Cross-job dataset dependencies", "", "```mermaid", "graph LR"])
    seen_d = set()
    for d in deps:
        u, dn = d["upstream_job"], d["downstream_job"]
        if not u or not dn:
            continue
        su, sd = _safe(u), _safe(dn)
        if su not in seen_d:
            lines.append(f"  {su}[\"{u}\"]")
            seen_d.add(su)
        if sd not in seen_d:
            lines.append(f"  {sd}[\"{dn}\"]")
            seen_d.add(sd)
        lines.append(f"  {su} -- {d['dataset']} --> {sd}")
    lines.append("```")
    out = out_dir / "jcl_chain.md"
    out.write_text("\n".join(lines))
    return out


def file_io(out_dir: Path) -> Path:
    with connect() as conn:
        rows = conn.execute(
            "SELECT program, file_name, operation FROM file_io ORDER BY program, file_name"
        ).fetchall()
    lines = ["# File I/O graph", "",
             "Program <-> file edges with the EXEC CICS operation (READ/WRITE/STARTBR/...).",
             "Solid arrow = WRITE/REWRITE/DELETE, dashed = READ family.", "",
             "```mermaid", "graph LR"]
    seen = set()
    for r in rows:
        prog, fname, op = r["program"], r["file_name"], r["operation"]
        if not prog or not fname:
            continue
        sp, sf = _safe(prog), _safe("f_" + fname)
        if sp not in seen:
            lines.append(f"  {sp}[\"{prog}\"]")
            seen.add(sp)
        if sf not in seen:
            lines.append(f"  {sf}[(\"{fname}\")]")
            seen.add(sf)
        arrow = "-.->" if op.startswith("READ") or op == "STARTBR" or op == "ENDBR" else "-->"
        lines.append(f"  {sp} {arrow} |{op}| {sf}")
    lines.append("```")
    out = out_dir / "file_io.md"
    out.write_text("\n".join(lines))
    return out


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--out", default="output/diagrams")
    args = parser.parse_args()
    out_dir = Path(args.out)
    out_dir.mkdir(parents=True, exist_ok=True)
    for fn in (call_graph, transaction_flow, jcl_chain, file_io):
        p = fn(out_dir)
        print(f"  wrote {p}")


if __name__ == "__main__":
    main()
