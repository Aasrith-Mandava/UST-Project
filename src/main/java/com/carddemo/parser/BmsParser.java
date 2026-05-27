package com.carddemo.parser;

import com.carddemo.ast.Node;
import com.carddemo.parser.generated.BMSGrammarBaseListener;
import com.carddemo.parser.generated.BMSGrammarLexer;
import com.carddemo.parser.generated.BMSGrammarParser;
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

/**
 * ANTLR-driven BMS parser.
 *
 * Two-stage:
 *   1. Preprocess raw lines to join BMS continuation cards (a character — typically
 *      'X' or '*' — in column 72 means the next line continues this one).
 *   2. Feed each joined logical card to the generated BMSGrammarParser and walk
 *      the parse tree with a listener to emit BmsMapset, BmsMap, BmsField nodes.
 */
public final class BmsParser {

    public List<Node> parse(Path file) throws IOException {
        List<Node> out = new ArrayList<>();
        String fileName = file.getFileName().toString();
        Node fileNode = makeNode(fileName, "BmsFile", 1, 1, 0, 0, null);
        fileNode.put("name", fileName);
        out.add(fileNode);

        List<LogicalCard> cards = joinContinuations(Files.readAllLines(file));

        UUID currentMapset = null;
        UUID currentMap = null;
        for (LogicalCard card : cards) {
            BMSGrammarLexer lexer = new BMSGrammarLexer(CharStreams.fromString(card.text + "\n"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BMSGrammarParser parser = new BMSGrammarParser(tokens);
            parser.removeErrorListeners();
            parser.setErrorHandler(new org.antlr.v4.runtime.BailErrorStrategy());

            CardListener listener = new CardListener();
            try {
                ParseTreeWalker.DEFAULT.walk(listener, parser.card());
            } catch (RuntimeException ignored) {
                continue;
            }
            if (listener.macro == null) continue;

            String kind;
            UUID parent;
            switch (listener.macro) {
                case "DFHMSD": kind = "BmsMapset"; parent = fileNode.uuid; break;
                case "DFHMDI": kind = "BmsMap";    parent = currentMapset == null ? fileNode.uuid : currentMapset; break;
                case "DFHMDF": kind = "BmsField";  parent = currentMap == null ? fileNode.uuid : currentMap; break;
                default:       kind = "BmsOther";  parent = fileNode.uuid; break;
            }
            Node n = makeNode(fileName, kind, card.startLine, card.endLine, 0, 0, parent);
            if (listener.label != null && !listener.label.isEmpty()) n.put("name", listener.label);
            if (!listener.params.isEmpty()) n.put("params", listener.params);
            out.add(n);
            fileNode.addChild(n.uuid);

            if ("DFHMSD".equals(listener.macro)) { currentMapset = n.uuid; currentMap = null; }
            else if ("DFHMDI".equals(listener.macro)) { currentMap = n.uuid; }
        }
        return out;
    }

    // ===== continuation join =====
    private static final class LogicalCard {
        final String text;
        final int startLine;
        final int endLine;
        LogicalCard(String t, int sl, int el) { this.text = t; this.startLine = sl; this.endLine = el; }
    }

    private List<LogicalCard> joinContinuations(List<String> rawLines) {
        List<LogicalCard> out = new ArrayList<>();
        StringBuilder pending = null;
        int pendingStart = 0;
        int pendingEnd = 0;

        for (int i = 0; i < rawLines.size(); i++) {
            String line = rawLines.get(i);
            int lineNo = i + 1;
            if (line.isBlank() || line.startsWith("*")) continue;

            boolean continued = line.length() >= 72 && !Character.isWhitespace(line.charAt(71));
            String body = line.length() >= 72 ? line.substring(0, 71).stripTrailing() : line.stripTrailing();

            if (pending == null) {
                pending = new StringBuilder(body);
                pendingStart = lineNo;
            } else {
                pending.append(' ').append(body.trim());
            }
            pendingEnd = lineNo;

            if (!continued) {
                out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
                pending = null;
            }
        }
        if (pending != null) {
            out.add(new LogicalCard(pending.toString(), pendingStart, pendingEnd));
        }
        return out;
    }

    // ===== ANTLR listener =====
    private static final class CardListener extends BMSGrammarBaseListener {
        String label;
        String macro;
        final Map<String, String> params = new LinkedHashMap<>();

        @Override
        public void enterCard(BMSGrammarParser.CardContext ctx) {
            this.label = (ctx.NAME() != null) ? ctx.NAME().getText() : null;
            this.macro = (ctx.DFH_MACRO() != null) ? ctx.DFH_MACRO().getText().toUpperCase() : null;
        }

        @Override
        public void enterParam(BMSGrammarParser.ParamContext ctx) {
            if (ctx.NAME() == null) return;
            String key = ctx.NAME().getText().toUpperCase();
            String val = ctx.paramValue() != null ? rawText(ctx.paramValue()) : "";
            params.put(key, val);
        }

        private static String rawText(org.antlr.v4.runtime.ParserRuleContext ctx) {
            if (ctx == null) return "";
            if (ctx.start == null || ctx.stop == null) return ctx.getText();
            org.antlr.v4.runtime.CharStream cs = ctx.start.getInputStream();
            if (cs == null) return ctx.getText();
            return cs.getText(org.antlr.v4.runtime.misc.Interval.of(
                    ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        }
    }

    private Node makeNode(String file, String kind, int sl, int el, int sc, int ec, UUID parent) {
        UUID id = UuidFactory.forNode(file, kind, sl, sc);
        Node n = new Node(id, kind, file, sl, el, sc, ec);
        n.parentUuid = parent;
        return n;
    }
}
