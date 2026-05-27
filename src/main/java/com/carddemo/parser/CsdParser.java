package com.carddemo.parser;

import com.carddemo.ast.Node;
import com.carddemo.parser.generated.CSDGrammarBaseListener;
import com.carddemo.parser.generated.CSDGrammarLexer;
import com.carddemo.parser.generated.CSDGrammarParser;
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
 * ANTLR-driven CSD parser.
 *
 * Each line is independently fed to the generated CSDGrammarParser, which
 * recognises DEFINE statements for PROGRAM/TRANSACTION/MAPSET/FILE/LIBRARY
 * (and similar resource types) plus their KEY(VALUE) attribute pairs.
 * Lines that don't parse (blank, comment, group headers) are skipped silently
 * — coverage report tracks the success rate.
 */
public final class CsdParser {

    public List<Node> parse(Path file) throws IOException {
        List<Node> out = new ArrayList<>();
        String fileName = file.getFileName().toString();
        Node fileNode = makeNode(fileName, "CsdFile", 1, 1, 0, 0, null);
        fileNode.put("name", fileName);
        out.add(fileNode);

        // CSD DEFINE statements span multiple physical lines; group raw lines
        // into logical DEFINE blocks before parsing.
        List<DefineBlock> blocks = collectDefineBlocks(Files.readAllLines(file));

        for (DefineBlock block : blocks) {
            CSDGrammarLexer lexer = new CSDGrammarLexer(CharStreams.fromString(block.text + "\n"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CSDGrammarParser parser = new CSDGrammarParser(tokens);
            parser.removeErrorListeners();
            parser.setErrorHandler(new org.antlr.v4.runtime.BailErrorStrategy());

            DefineListener listener = new DefineListener();
            try {
                ParseTreeWalker.DEFAULT.walk(listener, parser.defineStmt());
            } catch (RuntimeException ignored) {
                continue;
            }
            if (listener.resourceType == null || listener.resourceName == null) continue;

            String kind = "CsdDefine_" + listener.resourceType;
            Node n = makeNode(fileName, kind, block.startLine, block.endLine, 0, 0, fileNode.uuid);
            n.put("resource_type", listener.resourceType);
            n.put("name", listener.resourceName);
            if (!listener.attrs.isEmpty()) n.put("attrs", listener.attrs);
            out.add(n);
            fileNode.addChild(n.uuid);
        }
        return out;
    }

    private static final class DefineBlock {
        final String text;
        final int startLine;
        final int endLine;
        DefineBlock(String t, int sl, int el) { this.text = t; this.startLine = sl; this.endLine = el; }
    }

    private List<DefineBlock> collectDefineBlocks(List<String> rawLines) {
        List<DefineBlock> blocks = new ArrayList<>();
        StringBuilder pending = null;
        int pendingStart = 0;
        int pendingEnd = 0;

        for (int i = 0; i < rawLines.size(); i++) {
            String line = rawLines.get(i);
            int lineNo = i + 1;
            if (line.isBlank() || line.startsWith("*") || line.startsWith("//*")) continue;

            String trimmed = line.stripLeading();
            boolean isDefineStart = trimmed.toUpperCase().startsWith("DEFINE ")
                    || trimmed.toUpperCase().startsWith("DEFINE\t");

            if (isDefineStart && pending != null) {
                blocks.add(new DefineBlock(pending.toString(), pendingStart, pendingEnd));
                pending = null;
            }
            if (isDefineStart) {
                pending = new StringBuilder(line.stripTrailing());
                pendingStart = lineNo;
                pendingEnd = lineNo;
            } else if (pending != null) {
                pending.append(' ').append(line.stripTrailing().trim());
                pendingEnd = lineNo;
            }
        }
        if (pending != null) {
            blocks.add(new DefineBlock(pending.toString(), pendingStart, pendingEnd));
        }
        return blocks;
    }

    private static final class DefineListener extends CSDGrammarBaseListener {
        String resourceType;
        String resourceName;
        final Map<String, String> attrs = new LinkedHashMap<>();

        @Override
        public void enterDefineStmt(CSDGrammarParser.DefineStmtContext ctx) {
            if (ctx.resourceType() != null) this.resourceType = ctx.resourceType().getText().toUpperCase();
            if (ctx.NAME() != null) {
                this.resourceName = ctx.NAME().getText();
            }
        }

        @Override
        public void enterAttrPair(CSDGrammarParser.AttrPairContext ctx) {
            if (ctx.NAME() == null) return;
            String key = ctx.NAME().getText().toUpperCase();
            String val = (ctx.value() != null) ? rawText(ctx.value()).trim() : "";
            attrs.put(key, val);
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
