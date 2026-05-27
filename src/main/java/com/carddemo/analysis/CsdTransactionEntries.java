package com.carddemo.analysis;

import com.carddemo.output.SqliteWriter;
import com.carddemo.transform.UuidFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Seeds transaction_flow with CSD-defined transaction entry edges.
 * For every CsdTransaction row with PROGRAM(name), emit a TX_ENTRY edge
 * (transaction_id, to_program=name).
 */
public final class CsdTransactionEntries {

    private final SqliteWriter db;
    private final ObjectMapper mapper = new ObjectMapper();

    public CsdTransactionEntries(SqliteWriter db) { this.db = db; }

    public int build(Path csdDir) throws Exception {
        if (!Files.isDirectory(csdDir)) return 0;
        int n = 0;
        String sql = "INSERT OR REPLACE INTO transaction_flow(edge_uuid, transaction_id, " +
                "from_program, from_program_uuid, to_program, to_program_uuid, edge_kind, site_uuid, line) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = db.prepare(sql);
             Stream<Path> s = Files.list(csdDir)) {
            for (Path p : (Iterable<Path>) s.filter(x -> x.getFileName().toString().endsWith(".json"))::iterator) {
                Map<String, Object> doc = mapper.readValue(p.toFile(),
                        new TypeReference<Map<String, Object>>() {});
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> nodes = (List<Map<String, Object>>) doc.get("nodes");
                if (nodes == null) continue;
                for (Map<String, Object> nd : nodes) {
                    if (!"CsdTransaction".equals(nd.get("kind"))) continue;
                    @SuppressWarnings("unchecked")
                    Map<String, Object> payload = (Map<String, Object>) nd.get("payload");
                    if (payload == null) continue;
                    String tid = (String) payload.get("name");
                    @SuppressWarnings("unchecked")
                    Map<String, Object> attrs = (Map<String, Object>) payload.get("attrs");
                    if (attrs == null) continue;
                    String program = (String) attrs.get("PROGRAM");
                    if (program == null) continue;
                    UUID edge = UuidFactory.fromString("txentry:" + tid + ":" + program);
                    ps.setString(1, edge.toString());
                    ps.setString(2, tid);
                    ps.setString(3, null);
                    ps.setString(4, null);
                    ps.setString(5, program);
                    ps.setString(6, null);
                    ps.setString(7, "TX_ENTRY");
                    ps.setString(8, (String) nd.get("uuid"));
                    ps.setObject(9, nd.get("startLine"));
                    ps.addBatch();
                    n++;
                }
            }
            ps.executeBatch();
        }
        db.commit();
        return n;
    }
}
