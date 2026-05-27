package com.carddemo.parser;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Recognizer-only EXEC SQL extractor.
 *
 * CardDemo has zero EXEC SQL blocks in the core corpus (no DB2 module).
 * We still register this so:
 *   (a) if the corpus is extended later, the pipeline picks them up;
 *   (b) the coverage report can honestly state "0 EXEC SQL found".
 *
 * If we ever see SQL, we capture the verb + raw text; we do not parse the SQL itself
 * because the brief makes that a future task.
 */
public final class ExecSqlExtractor {

    private static final Pattern VERB = Pattern.compile(
            "(?is)^\\s*(?:EXEC\\s+SQL\\s+)?(\\w+)\\s*(.*)$");

    private ExecSqlExtractor() {}

    public static Extracted extract(String rawText) {
        Extracted e = new Extracted();
        if (rawText == null) return e;
        String clean = rawText.replaceAll("END-EXEC\\s*\\.?\\s*$", "")
                              .replaceAll("\\r?\\n", " ")
                              .replaceAll("\\s+", " ")
                              .trim();
        Matcher m = VERB.matcher(clean);
        if (m.find()) {
            e.verb = m.group(1).toUpperCase();
            e.body = m.group(2).trim();
        } else {
            e.verb = "UNKNOWN";
            e.body = clean;
        }
        return e;
    }

    public static final class Extracted {
        public String verb;
        public String body;
        public Map<String, String> args = new LinkedHashMap<>();
    }
}
