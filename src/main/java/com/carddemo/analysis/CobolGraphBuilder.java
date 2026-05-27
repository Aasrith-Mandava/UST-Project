package com.carddemo.analysis;

import com.carddemo.output.SqliteWriter;
import com.carddemo.transform.UuidFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads per-file COBOL artifact JSONs + the original .cbl source and emits:
 *  - call_graph         (CALL static/dynamic + CICS LINK/XCTL)
 *  - transaction_flow   (CICS XCTL/LINK/RETURN)
 *  - file_io            (CICS READ/WRITE/REWRITE/DELETE/STARTBR/READNEXT/READPREV/ENDBR)
 *  - def_use            (MOVE src->dst and COMPUTE writes)
 *  - control_flow       (PERFORM, PERFORM THRU)
 *
 * Approach: each statement node knows its source line range and statement_type.
 * We slice the original source for that range, then regex-match for details.
 */
public final class CobolGraphBuilder {

    private static final Pattern CALL_PATTERN = Pattern.compile(
            "(?is)\\bCALL\\s+(?:'([A-Z0-9_-]+)'|\"([A-Z0-9_-]+)\"|([A-Z][A-Z0-9_-]*))");

    private static final Pattern MOVE_PATTERN = Pattern.compile(
            "(?is)\\bMOVE\\s+(.+?)\\s+TO\\s+([A-Z][A-Z0-9_-]*(?:\\s*,\\s*[A-Z][A-Z0-9_-]*)*)");

    private static final Pattern COMPUTE_PATTERN = Pattern.compile(
            "(?is)\\bCOMPUTE\\s+([A-Z][A-Z0-9_-]*)\\s*=");

    private static final Pattern PERFORM_PATTERN = Pattern.compile(
            "(?is)\\bPERFORM\\s+([A-Z][A-Z0-9_-]*)(?:\\s+THRU\\s+([A-Z][A-Z0-9_-]*))?");

    private static final Pattern IDENTIFIER = Pattern.compile(
            "[A-Z][A-Z0-9_-]*", Pattern.CASE_INSENSITIVE);

    // EXEC CICS verbs that signify file I/O
    private static final java.util.Set<String> FILE_VERBS = java.util.Set.of(
            "READ", "WRITE", "REWRITE", "DELETE", "START", "STARTBR",
            "READNEXT", "READPREV", "ENDBR", "RESETBR", "UNLOCK");

    private static final java.util.Set<String> CALL_VERBS = java.util.Set.of("LINK", "XCTL", "RETURN");

    private final SqliteWriter db;
    private final ObjectMapper mapper = new ObjectMapper();
    private final Path corpusRoot;

    public CobolGraphBuilder(SqliteWriter db, Path corpusRoot) {
        this.db = db;
        this.corpusRoot = corpusRoot;
    }

    public Counts build(Path cobolArtifactsDir) throws Exception {
        Counts c = new Counts();

        String callSql = "INSERT OR REPLACE INTO call_graph(edge_uuid, caller_program, " +
                "caller_program_uuid, caller_site_uuid, callee_program, callee_program_uuid, " +
                "edge_kind, args_json, line) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String txSql = "INSERT OR REPLACE INTO transaction_flow(edge_uuid, transaction_id, " +
                "from_program, from_program_uuid, to_program, to_program_uuid, edge_kind, site_uuid, line) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String fioSql = "INSERT OR REPLACE INTO file_io(edge_uuid, program, program_uuid, " +
                "site_uuid, file_name, operation, record_copybook, line) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String duSql = "INSERT OR REPLACE INTO def_use(edge_uuid, data_item_uuid, data_item_name, " +
                "site_uuid, program_uuid, program, access_kind, statement_kind, line) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String cfSql = "INSERT OR REPLACE INTO control_flow(edge_uuid, program_uuid, program, " +
                "from_paragraph, from_paragraph_uuid, to_paragraph, to_paragraph_uuid, " +
                "edge_kind, site_uuid, line) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement psCall = db.prepare(callSql);
             PreparedStatement psTx = db.prepare(txSql);
             PreparedStatement psFio = db.prepare(fioSql);
             PreparedStatement psDu = db.prepare(duSql);
             PreparedStatement psCf = db.prepare(cfSql)) {

            try (var s = Files.list(cobolArtifactsDir)) {
                for (Path artifact : (Iterable<Path>) s.filter(p -> p.getFileName().toString().endsWith(".json"))::iterator) {
                    processFile(artifact, psCall, psTx, psFio, psDu, psCf, c);
                    c.files++;
                }
            }
            psCall.executeBatch();
            psTx.executeBatch();
            psFio.executeBatch();
            psDu.executeBatch();
            psCf.executeBatch();
        }
        db.commit();
        return c;
    }

    private void processFile(Path artifact, PreparedStatement psCall, PreparedStatement psTx,
                             PreparedStatement psFio, PreparedStatement psDu, PreparedStatement psCf,
                             Counts c) throws Exception {
        Map<String, Object> doc = mapper.readValue(artifact.toFile(),
                new TypeReference<Map<String, Object>>() {});
        String sourceFile = (String) doc.get("source_file");
        if (sourceFile == null) return;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> nodes = (List<Map<String, Object>>) doc.get("nodes");
        if (nodes == null) return;

        // We no longer slice the source file by line number, because ProLeap's line
        // numbers refer to the preprocessed source (with copybooks expanded inline) and
        // do not line up with the original .cbl. Instead, every Statement node carries
        // its original text in payload.text (set by CstToAstVisitor).
        Path source = findSource(sourceFile);
        if (source == null) {
            c.missingSources++;
        }

        String programName = null;
        String programUuid = null;
        Map<String, ParagraphInfo> paragraphs = new LinkedHashMap<>();
        List<ParagraphInfo> orderedParagraphs = new ArrayList<>();
        String currentParagraphUuid = null;
        String currentParagraphName = null;

        for (Map<String, Object> n : nodes) {
            String kind = (String) n.get("kind");
            if ("CompilationUnit".equals(kind) && programName == null) {
                Object name = payloadValue(n, "name");
                if (name != null) programName = name.toString();
            }
            if ("ProgramUnit".equals(kind) && programUuid == null) {
                programUuid = (String) n.get("uuid");
            }
            if ("Paragraph".equals(kind)) {
                ParagraphInfo pi = new ParagraphInfo();
                pi.uuid = (String) n.get("uuid");
                Object nm = payloadValue(n, "name");
                pi.name = nm == null ? null : nm.toString();
                pi.startLine = ((Number) n.get("startLine")).intValue();
                pi.endLine = ((Number) n.get("endLine")).intValue();
                if (pi.name != null) paragraphs.put(pi.name.toUpperCase(Locale.ROOT), pi);
                orderedParagraphs.add(pi);
            }
        }

        // Walk statements
        for (Map<String, Object> n : nodes) {
            String kind = (String) n.get("kind");

            if ("Paragraph".equals(kind)) {
                Object nm = payloadValue(n, "name");
                currentParagraphName = nm == null ? null : nm.toString();
                currentParagraphUuid = (String) n.get("uuid");
                continue;
            }

            if (!("Statement".equals(kind) || "ExecCicsBlock".equals(kind) || "ExecSqlBlock".equals(kind))) {
                continue;
            }

            int sl = ((Number) n.get("startLine")).intValue();
            String siteUuid = (String) n.get("uuid");
            Object txt = payloadValue(n, "text");
            String stmtText = txt == null ? "" : txt.toString();

            String stmtType = (String) payloadValue(n, "statement_type");

            if ("ExecCicsBlock".equals(kind)) {
                String verb = (String) payloadValue(n, "verb");
                @SuppressWarnings("unchecked")
                Map<String, String> args = (Map<String, String>) payloadValue(n, "args");
                if (verb != null) handleCicsBlock(verb, args, programName, programUuid, siteUuid, sl,
                        psCall, psTx, psFio, c);
                continue;
            }

            if ("CALL".equals(stmtType)) {
                handleCobolCall(stmtText, programName, programUuid, siteUuid, sl, psCall, c);
            } else if ("MOVE".equals(stmtType)) {
                handleMove(stmtText, programName, programUuid, siteUuid, sl, psDu, c);
            } else if ("COMPUTE".equals(stmtType)) {
                handleCompute(stmtText, programName, programUuid, siteUuid, sl, psDu, c);
            } else if ("PERFORM".equals(stmtType)) {
                handlePerform(stmtText, programName, programUuid, currentParagraphName,
                        currentParagraphUuid, paragraphs, siteUuid, sl, psCf, c);
            }
        }
    }

    private void handleCobolCall(String stmtText, String programName, String programUuid,
                                 String siteUuid, int line, PreparedStatement ps, Counts c) throws Exception {
        Matcher m = CALL_PATTERN.matcher(stmtText);
        if (!m.find()) return;
        String target;
        String edgeKind;
        if (m.group(1) != null || m.group(2) != null) {
            target = m.group(1) != null ? m.group(1) : m.group(2);
            edgeKind = "CALL_STATIC";
        } else {
            target = m.group(3);
            edgeKind = "CALL_DYNAMIC";
        }
        UUID edge = UuidFactory.fromString("call:" + programName + ":" + target + ":" + line);
        ps.setString(1, edge.toString());
        ps.setString(2, programName);
        ps.setString(3, programUuid);
        ps.setString(4, siteUuid);
        ps.setString(5, target);
        ps.setString(6, null);
        ps.setString(7, edgeKind);
        ps.setString(8, null);
        ps.setInt(9, line);
        ps.addBatch();
        c.callEdges++;
    }

    private void handleCicsBlock(String verb, Map<String, String> args, String programName,
                                 String programUuid, String siteUuid, int line,
                                 PreparedStatement psCall, PreparedStatement psTx,
                                 PreparedStatement psFio, Counts c) throws Exception {
        String v = verb.toUpperCase(Locale.ROOT);

        if (v.equals("LINK") || v.equals("XCTL")) {
            String tgt = stripQuotes(args == null ? null : args.get("PROGRAM"));
            if (tgt != null) {
                UUID edge = UuidFactory.fromString("cics:" + v + ":" + programName + ":" + tgt + ":" + line);
                psCall.setString(1, edge.toString());
                psCall.setString(2, programName);
                psCall.setString(3, programUuid);
                psCall.setString(4, siteUuid);
                psCall.setString(5, tgt);
                psCall.setString(6, null);
                psCall.setString(7, "CICS_" + v);
                psCall.setString(8, db.json(args));
                psCall.setInt(9, line);
                psCall.addBatch();
                c.callEdges++;

                UUID txEdge = UuidFactory.fromString("tx:" + v + ":" + programName + ":" + tgt + ":" + line);
                psTx.setString(1, txEdge.toString());
                psTx.setString(2, null);
                psTx.setString(3, programName);
                psTx.setString(4, programUuid);
                psTx.setString(5, tgt);
                psTx.setString(6, null);
                psTx.setString(7, "CICS_" + v);
                psTx.setString(8, siteUuid);
                psTx.setInt(9, line);
                psTx.addBatch();
                c.txEdges++;
            }
        } else if (v.equals("RETURN")) {
            String transid = stripQuotes(args == null ? null : args.get("TRANSID"));
            UUID edge = UuidFactory.fromString("tx:RETURN:" + programName + ":" + transid + ":" + line);
            psTx.setString(1, edge.toString());
            psTx.setString(2, transid);
            psTx.setString(3, programName);
            psTx.setString(4, programUuid);
            psTx.setString(5, null);
            psTx.setString(6, null);
            psTx.setString(7, "CICS_RETURN");
            psTx.setString(8, siteUuid);
            psTx.setInt(9, line);
            psTx.addBatch();
            c.txEdges++;
        }

        if (FILE_VERBS.contains(v)) {
            String fileName = stripQuotes(args == null ? null : args.get("FILE"));
            if (fileName == null && args != null) fileName = stripQuotes(args.get("DATASET"));
            if (fileName != null) {
                String into = args == null ? null : args.get("INTO");
                UUID edge = UuidFactory.fromString("fio:" + programName + ":" + fileName + ":" + v + ":" + line);
                psFio.setString(1, edge.toString());
                psFio.setString(2, programName);
                psFio.setString(3, programUuid);
                psFio.setString(4, siteUuid);
                psFio.setString(5, fileName);
                psFio.setString(6, v);
                psFio.setString(7, into);
                psFio.setInt(8, line);
                psFio.addBatch();
                c.fileEdges++;
            }
        }
    }

    private void handleMove(String stmtText, String programName, String programUuid,
                            String siteUuid, int line, PreparedStatement ps, Counts c) throws Exception {
        Matcher m = MOVE_PATTERN.matcher(stmtText);
        if (!m.find()) return;
        String srcExpr = m.group(1);
        String dstList = m.group(2);

        // read accesses (source side)
        for (Matcher id = IDENTIFIER.matcher(srcExpr); id.find(); ) {
            String name = id.group();
            if (isKeyword(name)) continue;
            UUID edge = UuidFactory.fromString("du:R:" + programName + ":" + name + ":" + line);
            ps.setString(1, edge.toString());
            ps.setString(2, null);
            ps.setString(3, name);
            ps.setString(4, siteUuid);
            ps.setString(5, programUuid);
            ps.setString(6, programName);
            ps.setString(7, "READ");
            ps.setString(8, "MOVE");
            ps.setInt(9, line);
            ps.addBatch();
            c.duEdges++;
        }

        // write accesses (destination side)
        for (String dst : dstList.split("\\s*,\\s*")) {
            dst = dst.trim();
            if (dst.isEmpty()) continue;
            UUID edge = UuidFactory.fromString("du:W:" + programName + ":" + dst + ":" + line);
            ps.setString(1, edge.toString());
            ps.setString(2, null);
            ps.setString(3, dst);
            ps.setString(4, siteUuid);
            ps.setString(5, programUuid);
            ps.setString(6, programName);
            ps.setString(7, "WRITE");
            ps.setString(8, "MOVE");
            ps.setInt(9, line);
            ps.addBatch();
            c.duEdges++;
        }
    }

    private void handleCompute(String stmtText, String programName, String programUuid,
                               String siteUuid, int line, PreparedStatement ps, Counts c) throws Exception {
        Matcher m = COMPUTE_PATTERN.matcher(stmtText);
        if (!m.find()) return;
        String dst = m.group(1);
        UUID edge = UuidFactory.fromString("du:W:" + programName + ":" + dst + ":" + line + ":COMPUTE");
        ps.setString(1, edge.toString());
        ps.setString(2, null);
        ps.setString(3, dst);
        ps.setString(4, siteUuid);
        ps.setString(5, programUuid);
        ps.setString(6, programName);
        ps.setString(7, "WRITE");
        ps.setString(8, "COMPUTE");
        ps.setInt(9, line);
        ps.addBatch();
        c.duEdges++;
    }

    private void handlePerform(String stmtText, String programName, String programUuid,
                               String fromName, String fromUuid,
                               Map<String, ParagraphInfo> paragraphs,
                               String siteUuid, int line, PreparedStatement ps, Counts c) throws Exception {
        Matcher m = PERFORM_PATTERN.matcher(stmtText);
        if (!m.find()) return;
        String to = m.group(1);
        String thru = m.group(2);
        if (isKeyword(to)) return;

        ParagraphInfo toInfo = paragraphs.get(to.toUpperCase(Locale.ROOT));
        UUID edge = UuidFactory.fromString("cf:PERFORM:" + programName + ":" + fromName + ":" + to + ":" + line);
        ps.setString(1, edge.toString());
        ps.setString(2, programUuid);
        ps.setString(3, programName);
        ps.setString(4, fromName);
        ps.setString(5, fromUuid);
        ps.setString(6, to);
        ps.setString(7, toInfo == null ? null : toInfo.uuid);
        ps.setString(8, thru != null ? "PERFORM_THRU" : "PERFORM");
        ps.setString(9, siteUuid);
        ps.setInt(10, line);
        ps.addBatch();
        c.cfEdges++;
    }

    private boolean isKeyword(String token) {
        // Reject common COBOL reserved words that we don't want to treat as identifiers
        String t = token.toUpperCase(Locale.ROOT);
        return switch (t) {
            case "TO", "BY", "WITH", "TEST", "BEFORE", "AFTER", "UNTIL", "VARYING",
                 "FROM", "GIVING", "THRU", "THROUGH", "TIMES", "DEPENDING", "ON",
                 "USING", "IF", "ELSE", "END-IF", "WHEN", "OTHER", "ALL", "ANY",
                 "ZERO", "ZEROS", "ZEROES", "SPACE", "SPACES", "HIGH-VALUE",
                 "HIGH-VALUES", "LOW-VALUE", "LOW-VALUES", "QUOTE", "QUOTES",
                 "NULL", "NULLS" -> true;
            default -> false;
        };
    }

    private String stripQuotes(String s) {
        if (s == null) return null;
        s = s.trim();
        if ((s.startsWith("'") && s.endsWith("'")) || (s.startsWith("\"") && s.endsWith("\""))) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    private Path findSource(String sourceFile) {
        Path[] tries = {
                corpusRoot.resolve("cbl").resolve(sourceFile),
                corpusRoot.resolve(sourceFile)
        };
        for (Path p : tries) if (Files.isRegularFile(p)) return p;
        return null;
    }

    private Object payloadValue(Map<String, Object> n, String key) {
        Object p = n.get("payload");
        if (!(p instanceof Map)) return null;
        return ((Map<?, ?>) p).get(key);
    }

    private static class ParagraphInfo {
        String uuid;
        String name;
        int startLine;
        int endLine;
    }

    public static class Counts {
        public int files;
        public int missingSources;
        public int callEdges;
        public int txEdges;
        public int fileEdges;
        public int duEdges;
        public int cfEdges;
    }
}
