package com.carddemo.parser;

import com.carddemo.ast.Node;
import com.carddemo.parser.generated.JCLGrammarBaseListener;
import com.carddemo.parser.generated.JCLGrammarLexer;
import com.carddemo.parser.generated.JCLGrammarParser;
import com.carddemo.transform.UuidFactory;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ANTLR-driven JCL parser.
 *
 * Two-stage:
 *   1. Preprocess raw file lines to join continuation cards (a card ending in
 *      ',' continues on the next '//   ...' line).  This is a JCL convention
 *      that's painful to express in the grammar itself.
 *   2. Feed the joined logical-card stream to the generated JCLGrammarParser.
 *      A listener walks the parse tree and emits AST Nodes for JclFile, JclJob,
 *      JclStep, JclDd, JclProc, JclSet, JclInclude, JclIf, JclElse, JclEndif.
 *
 * Output shape is identical to the previous regex-based implementation so that
 * downstream graph-building and dashboard code is unchanged.
 */
public final class JclParser {

    private static final Pattern COMMENT  = Pattern.compile("^//\\*.*$");
    private static final Pattern CONTINUE = Pattern.compile("^//\\s+(.*)$");

    public List<Node> parse(Path file) throws IOException {
        List<Node> out = new ArrayList<>();
        String fileName = file.getFileName().toString();
        Node fileNode = makeNode(fileName, "JclFile", 1, 1, 0, 0, null);
        fileNode.put("name", fileName);
        out.add(fileNode);

        // -------- Stage 1: join continuation cards --------
        List<LogicalCard> cards = joinContinuations(Files.readAllLines(file));

        // -------- Stage 2: ANTLR-parse each logical card --------
        UUID currentStepUuid = null;
        for (LogicalCard card : cards) {
            JCLGrammarLexer lexer = new JCLGrammarLexer(CharStreams.fromString(card.text + "\n"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JCLGrammarParser parser = new JCLGrammarParser(tokens);
            parser.removeErrorListeners();   // grammar is permissive; errors are routine
            parser.setErrorHandler(new org.antlr.v4.runtime.BailErrorStrategy());

            CardListener listener = new CardListener();
            try {
                ParseTreeWalker.DEFAULT.walk(listener, parser.card());
            } catch (RuntimeException ignored) {
                // grammar didn't fit this line; skip silently — coverage report will note it
                continue;
            }

            if (listener.op == null) continue;
            currentStepUuid = emit(out, fileNode, currentStepUuid, fileName,
                    listener.name, listener.op, listener.params,
                    card.startLine, card.endLine);
        }
        return out;
    }

    // ============================================================
    //  Stage 1 — continuation-line preprocessing
    // ============================================================

    private static final class LogicalCard {
        final String text;
        final int startLine, endLine;
        LogicalCard(String text, int sl, int el) { this.text = text; this.startLine = sl; this.endLine = el; }
    }

    private List<LogicalCard> joinContinuations(List<String> rawLines) {
        List<LogicalCard> out = new ArrayList<>();
        StringBuilder pending = null;
        int pendingStart = 0;
        int pendingEnd = 0;

        for (int i = 0; i < rawLines.size(); i++) {
            String line = rawLines.get(i);
            int lineNo = i + 1;
            if (COMMENT.matcher(line).matches()) continue;
            if (line.isBlank()) continue;

            Matcher cont = CONTINUE.matcher(line);
            if (pending != null && cont.matches()) {
                pending.append(' ').append(cont.group(1).trim());
                pendingEnd = lineNo;
                if (!endsWithComma(pending)) {
                    out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
                    pending = null;
                }
                continue;
            }
            if (pending != null) {
                out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
                pending = null;
            }
            pending = new StringBuilder(line);
            pendingStart = lineNo;
            pendingEnd = lineNo;
            if (!endsWithComma(pending)) {
                out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
                pending = null;
            }
        }
        if (pending != null) {
            out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
        }
        return out;
    }

    private static boolean endsWithComma(StringBuilder sb) {
        String s = sb.toString().trim();
        return s.endsWith(",");
    }

    // ============================================================
    //  Stage 2 — ANTLR listener
    // ============================================================

    private static final class CardListener extends JCLGrammarBaseListener {
        String name;
        String op;
        final Map<String, String> params = new LinkedHashMap<>();

        @Override
        public void enterCard(JCLGrammarParser.CardContext ctx) {
            this.name = (ctx.NAME() != null) ? ctx.NAME().getText() : null;
            this.op   = (ctx.OP() != null) ? ctx.OP().getText().toUpperCase() : null;
        }

        @Override
        public void enterKvParam(JCLGrammarParser.KvParamContext ctx) {
            String key = ctx.NAME().getText().toUpperCase();
            String val = ctx.paramValue() != null ? rawText(ctx.paramValue()) : "";
            params.put(key, val);
        }

        @Override
        public void enterPositionalParam(JCLGrammarParser.PositionalParamContext ctx) {
            String val = rawText(ctx.paramValue());
            if (val != null && !val.isEmpty()) {
                params.put(val.toUpperCase(), "");
            }
        }

        private static String rawText(org.antlr.v4.runtime.ParserRuleContext ctx) {
            if (ctx == null) return "";
            org.antlr.v4.runtime.misc.Interval iv = ctx.getSourceInterval();
            if (iv == null || ctx.start == null) return ctx.getText();
            org.antlr.v4.runtime.CharStream cs = ctx.start.getInputStream();
            if (cs == null) return ctx.getText();
            return cs.getText(org.antlr.v4.runtime.misc.Interval.of(
                    ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        }
    }

    // ============================================================
    //  Stage 3 — emit AST Node from listener state
    // ============================================================

    private UUID emit(List<Node> out, Node fileNode, UUID currentStepUuid, String fileName,
                     String name, String op, Map<String, String> params,
                     int startLine, int endLine) {
        String kind;
        UUID parent;
        switch (op) {
            case "JOB":     kind = "JclJob";     parent = fileNode.uuid; break;
            case "EXEC":    kind = "JclStep";    parent = fileNode.uuid; break;
            case "DD":      kind = "JclDd";      parent = (currentStepUuid != null) ? currentStepUuid : fileNode.uuid; break;
            case "PROC":    kind = "JclProc";    parent = fileNode.uuid; break;
            case "PEND":    kind = "JclProcEnd"; parent = fileNode.uuid; break;
            case "SET":     kind = "JclSet";     parent = fileNode.uuid; break;
            case "INCLUDE": kind = "JclInclude"; parent = fileNode.uuid; break;
            case "IF":      kind = "JclIf";      parent = fileNode.uuid; break;
            case "ELSE":    kind = "JclElse";    parent = fileNode.uuid; break;
            case "ENDIF":   kind = "JclEndif";   parent = fileNode.uuid; break;
            default:        kind = "JclOther";   parent = fileNode.uuid; break;
        }
        Node node = makeNode(fileName, kind, startLine, endLine, 0, 0, parent);
        node.put("name", (name == null || name.isEmpty()) ? null : name);
        if (!params.isEmpty()) node.put("params", params);
        if ("EXEC".equals(op)) {
            if (params.containsKey("PGM")) node.put("program", params.get("PGM"));
            if (params.containsKey("PROC")) node.put("proc", params.get("PROC"));
        }
        if ("DD".equals(op)) {
            if (params.containsKey("DSN")) node.put("dsn", params.get("DSN"));
            if (params.containsKey("DISP")) node.put("disp", params.get("DISP"));
        }
        out.add(node);
        fileNode.addChild(node.uuid);
        return "EXEC".equals(op) ? node.uuid : currentStepUuid;
    }

    private Node makeNode(String file, String kind, int sl, int el, int sc, int ec, UUID parent) {
        UUID id = UuidFactory.forNode(file, kind, sl, sc);
        Node n = new Node(id, kind, file, sl, el, sc, ec);
        n.parentUuid = parent;
        return n;
    }
}
