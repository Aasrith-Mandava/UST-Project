package com.carddemo.parser;

import com.carddemo.ast.Node;
import com.carddemo.transform.UuidFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Recognizes Assembler entry points without fully parsing.
 * Captures CSECT and ENTRY directives -> AsmEntryPoint nodes.
 * Output lets downstream treat assembler routines as opaque callable units.
 */
public final class AsmStubRecognizer {

    private static final Pattern ENTRY_LINE = Pattern.compile(
            "^(?<label>[A-Z@#$][A-Z0-9@#$_]*)\\s+(?<op>CSECT|ENTRY|START)\\b",
            Pattern.CASE_INSENSITIVE);

    public List<Node> parse(Path file) throws IOException {
        List<Node> out = new ArrayList<>();
        List<String> lines = Files.readAllLines(file);
        String fileName = file.getFileName().toString();

        Node fileNode = makeNode(fileName, "AsmFile", 1, 1, 0, 0, null);
        fileNode.put("name", fileName);
        out.add(fileNode);

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            int lineNo = i + 1;
            if (line.isBlank() || line.startsWith("*")) continue;
            Matcher m = ENTRY_LINE.matcher(line);
            if (m.find()) {
                Node n = makeNode(fileName, "AsmEntryPoint", lineNo, lineNo, 0, 0, fileNode.uuid);
                n.put("name", m.group("label"));
                n.put("directive", m.group("op").toUpperCase());
                out.add(n);
                fileNode.addChild(n.uuid);
            }
        }
        return out;
    }

    private Node makeNode(String file, String kind, int sl, int el, int sc, int ec, UUID parent) {
        UUID id = UuidFactory.forNode(file, kind, sl, sc);
        Node n = new Node(id, kind, file, sl, el, sc, ec);
        n.parentUuid = parent;
        return n;
    }
}
