package com.carddemo.transform;

import com.carddemo.ast.Node;
import com.carddemo.parser.ExecCicsExtractor;
import com.carddemo.parser.ExecSqlExtractor;
import io.proleap.cobol.asg.metamodel.CompilationUnit;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.data.DataDivision;
import io.proleap.cobol.asg.metamodel.data.datadescription.DataDescriptionEntry;
import io.proleap.cobol.asg.metamodel.data.workingstorage.WorkingStorageSection;
import io.proleap.cobol.asg.metamodel.procedure.Paragraph;
import io.proleap.cobol.asg.metamodel.procedure.ProcedureDivision;
import io.proleap.cobol.asg.metamodel.procedure.Statement;
import io.proleap.cobol.asg.metamodel.procedure.StatementType;
import io.proleap.cobol.asg.metamodel.procedure.StatementTypeEnum;
import io.proleap.cobol.asg.metamodel.procedure.execcics.ExecCicsStatement;
import io.proleap.cobol.asg.metamodel.procedure.execsql.ExecSqlStatement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Walks a ProLeap ASG and emits our typed AST nodes (with UUIDs + source ranges).
 *
 * Day 1 scope: Program, CompilationUnit, ProgramUnit, Paragraph, Statement, DataItem.
 * Day 2 adds: detailed statement subtypes (IF/EVALUATE/PERFORM/MOVE/COMPUTE/CALL/EXEC*).
 */
public final class CstToAstVisitor {

    private final String filePath;
    private final List<Node> out = new ArrayList<>();

    public CstToAstVisitor(String filePath) {
        this.filePath = filePath;
    }

    public List<Node> visit(Program program) {
        for (CompilationUnit cu : program.getCompilationUnits()) {
            Node cuNode = makeNode("CompilationUnit", cu.getCtx(), null);
            cuNode.put("name", cu.getName());
            out.add(cuNode);

            ProgramUnit pu = cu.getProgramUnit();
            if (pu == null) continue;

            Node puNode = makeNode("ProgramUnit", pu.getCtx(), cuNode.uuid);
            puNode.put("name", cu.getName());
            cuNode.addChild(puNode.uuid);
            out.add(puNode);

            visitDataDivision(pu.getDataDivision(), puNode);
            visitProcedureDivision(pu.getProcedureDivision(), puNode);
        }
        return out;
    }

    private void visitDataDivision(DataDivision dd, Node parent) {
        if (dd == null) return;
        Node ddNode = makeNode("DataDivision", dd.getCtx(), parent.uuid);
        parent.addChild(ddNode.uuid);
        out.add(ddNode);

        WorkingStorageSection ws = dd.getWorkingStorageSection();
        if (ws != null) {
            Node wsNode = makeNode("WorkingStorageSection", ws.getCtx(), ddNode.uuid);
            ddNode.addChild(wsNode.uuid);
            out.add(wsNode);
            for (DataDescriptionEntry entry : ws.getDataDescriptionEntries()) {
                Node de = makeNode("DataItem", entry.getCtx(), wsNode.uuid);
                de.put("name", entry.getName());
                de.put("level", entry.getLevelNumber());
                de.put("entry_type", entry.getDataDescriptionEntryType() == null ? null : entry.getDataDescriptionEntryType().toString());
                wsNode.addChild(de.uuid);
                out.add(de);
            }
        }
    }

    private void visitProcedureDivision(ProcedureDivision pd, Node parent) {
        if (pd == null) return;
        Node pdNode = makeNode("ProcedureDivision", pd.getCtx(), parent.uuid);
        parent.addChild(pdNode.uuid);
        out.add(pdNode);

        for (Paragraph p : pd.getParagraphs()) {
            ParserRuleContext ctx = p.getCtx();
            Node pNode = makeNode("Paragraph", ctx, pdNode.uuid);
            String name = p.getParagraphName() != null ? p.getParagraphName().getName() : "<anonymous>";
            pNode.put("name", name);
            pdNode.addChild(pNode.uuid);
            out.add(pNode);

            for (Statement s : p.getStatements()) {
                String stmtKind = s.getStatementType() != null ? s.getStatementType().toString() : "UNKNOWN";
                String nodeKind = "Statement";
                if (s.getStatementType() == StatementTypeEnum.EXEC_CICS) nodeKind = "ExecCicsBlock";
                else if (s.getStatementType() == StatementTypeEnum.EXEC_SQL
                        || s.getStatementType() == StatementTypeEnum.EXEC_SQLIMS) nodeKind = "ExecSqlBlock";

                Node sNode = makeNode(nodeKind, s.getCtx(), pNode.uuid);
                sNode.put("statement_type", stmtKind);
                if (s.getCtx() != null) {
                    String txt = originalText(s.getCtx());
                    if (txt != null) sNode.put("text", txt);
                }

                if ("ExecCicsBlock".equals(nodeKind) && s instanceof ExecCicsStatement) {
                    String raw = ((ExecCicsStatement) s).getExecCicsText();
                    if (raw == null || raw.isBlank()) raw = originalText(s.getCtx());
                    ExecCicsExtractor.Extracted ex = ExecCicsExtractor.extract(raw);
                    sNode.put("verb", ex.verb);
                    if (!ex.args.isEmpty()) sNode.put("args", ex.args);
                } else if ("ExecSqlBlock".equals(nodeKind) && s instanceof ExecSqlStatement) {
                    String raw = ((ExecSqlStatement) s).getExecSqlText();
                    if (raw == null || raw.isBlank()) raw = originalText(s.getCtx());
                    ExecSqlExtractor.Extracted ex = ExecSqlExtractor.extract(raw);
                    sNode.put("verb", ex.verb);
                }

                pNode.addChild(sNode.uuid);
                out.add(sNode);
            }
        }
    }

    private static String originalText(ParserRuleContext ctx) {
        try {
            if (ctx.getStart() == null || ctx.getStop() == null) return ctx.getText();
            var input = ctx.getStart().getInputStream();
            if (input == null) return ctx.getText();
            return input.getText(org.antlr.v4.runtime.misc.Interval.of(
                    ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex()));
        } catch (RuntimeException e) {
            return ctx.getText();
        }
    }

    private Node makeNode(String kind, ParserRuleContext ctx, UUID parent) {
        int sl = 0, el = 0, sc = 0, ec = 0;
        if (ctx != null) {
            if (ctx.getStart() != null) {
                sl = ctx.getStart().getLine();
                sc = ctx.getStart().getCharPositionInLine();
            }
            if (ctx.getStop() != null) {
                el = ctx.getStop().getLine();
                ec = ctx.getStop().getCharPositionInLine();
            }
        }
        UUID id = UuidFactory.forNode(filePath, kind, sl, sc);
        Node n = new Node(id, kind, filePath, sl, el, sc, ec);
        n.parentUuid = parent;
        return n;
    }
}
