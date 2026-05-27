package com.carddemo.transform;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Resolves COBOL COPY statements with REPLACING semantics and records provenance.
 *
 * The output for each program is:
 *   - the expanded source as a list of lines
 *   - a provenance map: for every expanded line index, where it came from
 *     (origin file path, original line number, copybook name, list of REPLACING pairs)
 *
 * This is the "honesty" layer: every byte of code that reaches downstream analysis
 * is traceable back to a copybook origin. ProLeap does the expansion silently;
 * we do it transparently so forward engineering can keep the boundaries.
 */
public final class CopybookPreprocessor {

    private static final Pattern COPY_PATTERN = Pattern.compile(
            "(?i)^\\s*COPY\\s+([A-Z0-9_-]+|'[^']+'|\"[^\"]+\")(?:\\s+REPLACING\\s+(.*?))?\\s*\\.?\\s*$");

    private static final Pattern REPLACING_PAIR = Pattern.compile(
            "(?i)==(.*?)==\\s*BY\\s*==(.*?)==|(?i)(\\S+)\\s+BY\\s+(\\S+)");

    private final List<Path> copybookDirs;

    public CopybookPreprocessor(List<Path> copybookDirs) {
        this.copybookDirs = copybookDirs;
    }

    public Result expand(Path cobolFile) throws IOException {
        Result r = new Result();
        r.sourceFile = cobolFile.getFileName().toString();
        List<String> rawLines = Files.readAllLines(cobolFile);
        expandLines(r.sourceFile, rawLines, null, new java.util.ArrayList<>(), r);
        return r;
    }

    private void expandLines(String originFile, List<String> lines, String parentCopybook,
                             List<String[]> replacingStack, Result r) {
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String areaB = stripColumns1to6(line);
            Matcher m = COPY_PATTERN.matcher(areaB);
            if (m.find()) {
                String rawName = stripQuotes(m.group(1));
                List<String[]> pairs = parseReplacing(m.group(2));
                Path target = findCopybook(rawName);
                if (target == null) {
                    addLine(r, "*> [unresolved COPY " + rawName + "]", originFile, i + 1, parentCopybook, replacingStack);
                    continue;
                }
                List<String> nested;
                try {
                    nested = Files.readAllLines(target);
                } catch (IOException ioe) {
                    addLine(r, "*> [read failed: " + rawName + "]", originFile, i + 1, parentCopybook, replacingStack);
                    continue;
                }
                List<String[]> newStack = new ArrayList<>(replacingStack);
                newStack.addAll(pairs);
                r.copybooksUsed.add(rawName);
                expandLines(target.getFileName().toString(), nested, rawName, newStack, r);
            } else {
                String emitted = applyReplacing(line, replacingStack);
                addLine(r, emitted, originFile, i + 1, parentCopybook, replacingStack);
            }
        }
    }

    private void addLine(Result r, String text, String originFile, int originLine,
                         String parentCopybook, List<String[]> replacingStack) {
        r.expandedLines.add(text);
        Map<String, Object> p = new LinkedHashMap<>();
        p.put("origin_file", originFile);
        p.put("origin_line", originLine);
        if (parentCopybook != null) p.put("copybook", parentCopybook);
        if (!replacingStack.isEmpty()) {
            List<Map<String, String>> rl = new ArrayList<>();
            for (String[] pair : replacingStack) {
                Map<String, String> e = new LinkedHashMap<>();
                e.put("from", pair[0]);
                e.put("to", pair[1]);
                rl.add(e);
            }
            p.put("replacing", rl);
        }
        r.provenance.add(p);
    }

    private String stripColumns1to6(String line) {
        if (line.length() <= 6) return "";
        return line.substring(6);
    }

    private String stripQuotes(String s) {
        if (s == null) return null;
        if ((s.startsWith("'") && s.endsWith("'")) || (s.startsWith("\"") && s.endsWith("\""))) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    private List<String[]> parseReplacing(String clause) {
        List<String[]> pairs = new ArrayList<>();
        if (clause == null || clause.isBlank()) return pairs;
        Matcher m = REPLACING_PAIR.matcher(clause);
        while (m.find()) {
            String from, to;
            if (m.group(1) != null) {
                from = m.group(1).trim();
                to = m.group(2).trim();
            } else {
                from = m.group(3).trim();
                to = m.group(4).trim();
            }
            pairs.add(new String[]{from, to});
        }
        return pairs;
    }

    private String applyReplacing(String line, List<String[]> stack) {
        String out = line;
        for (String[] p : stack) {
            out = out.replace(p[0], p[1]);
        }
        return out;
    }

    private Path findCopybook(String name) {
        String[] tryNames = {name, name + ".cpy", name + ".CPY", name + ".cbl", name + ".CBL"};
        for (Path dir : copybookDirs) {
            for (String n : tryNames) {
                Path candidate = dir.resolve(n);
                if (Files.isRegularFile(candidate)) return candidate;
            }
        }
        return null;
    }

    public static final class Result {
        public String sourceFile;
        public List<String> expandedLines = new ArrayList<>();
        public List<Map<String, Object>> provenance = new ArrayList<>();
        public java.util.Set<String> copybooksUsed = new java.util.LinkedHashSet<>();
    }
}
