package com.carddemo.parser;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extracts the verb + keyword arguments from a raw EXEC CICS ... END-EXEC block.
 * Handles the verbs CardDemo uses: LINK, XCTL, RETURN, SEND MAP, RECEIVE MAP,
 * READ, WRITE, REWRITE, DELETE, STARTBR, READNEXT, READPREV, ENDBR,
 * GETMAIN, FREEMAIN, HANDLE CONDITION, ASKTIME, FORMATTIME, ABEND.
 *
 * Arguments come in two shapes:
 *   KEYWORD(value)      e.g. PROGRAM('COTRN02C'), FILE('TRANSACT')
 *   FLAG                e.g. RESP, NOHANDLE, RIDFLD
 */
public final class ExecCicsExtractor {

    private static final Pattern VERB = Pattern.compile(
            "(?is)^\\s*(?:EXEC\\s+CICS\\s+)?(\\w+(?:\\s+MAP)?)\\s*(.*)$");

    private static final Pattern KW_VALUE = Pattern.compile(
            "\\b([A-Z][A-Z0-9]*)\\s*\\(([^()]*(?:\\([^()]*\\)[^()]*)*)\\)",
            Pattern.CASE_INSENSITIVE);

    private static final Pattern FLAG = Pattern.compile(
            "\\b(RESP|NOHANDLE|EQUAL|GTEQ|GENERIC|UPDATE|ERASE|ERASEAUP|CURSOR|FREEKB|ALARM|FRSET|HANDLE|CONDITION)\\b",
            Pattern.CASE_INSENSITIVE);

    private ExecCicsExtractor() {}

    public static Extracted extract(String rawText) {
        Extracted e = new Extracted();
        if (rawText == null) return e;
        String clean = rawText.replaceAll("END-EXEC\\s*\\.?\\s*$", "")
                              .replaceAll("\\r?\\n", " ")
                              .replaceAll("\\s+", " ")
                              .trim();
        Matcher v = VERB.matcher(clean);
        if (v.find()) {
            String verbRaw = v.group(1).toUpperCase().replaceAll("\\s+", " ");
            e.verb = verbRaw;
            String body = v.group(2);

            Matcher kv = KW_VALUE.matcher(body);
            while (kv.find()) {
                String key = kv.group(1).toUpperCase();
                String val = kv.group(2).trim();
                e.args.put(key, val);
            }

            Matcher fl = FLAG.matcher(body);
            while (fl.find()) {
                String flag = fl.group(1).toUpperCase();
                if (!e.args.containsKey(flag)) e.args.put(flag, "");
            }
        } else {
            e.verb = "UNKNOWN";
        }
        return e;
    }

    public static final class Extracted {
        public String verb;
        public Map<String, String> args = new LinkedHashMap<>();
    }
}
