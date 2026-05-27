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
 * Layer 4: copybook usage graph.
 * Source = the per-program *.provenance.json files emitted by CopybookPreprocessor.
 */
public final class CopybookUseBuilder {

    private final SqliteWriter db;
    private final ObjectMapper mapper = new ObjectMapper();

    public CopybookUseBuilder(SqliteWriter db) {
        this.db = db;
    }

    public int build(Path provenanceDir) throws Exception {
        if (!Files.isDirectory(provenanceDir)) return 0;
        int n = 0;
        String sql = "INSERT OR REPLACE INTO copybook_use(edge_uuid, program, program_uuid, copybook, replacing_json) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = db.prepare(sql);
             Stream<Path> s = Files.list(provenanceDir)) {
            for (Path p : (Iterable<Path>) s.filter(x -> x.getFileName().toString().endsWith(".provenance.json"))::iterator) {
                Map<String, Object> doc = mapper.readValue(p.toFile(),
                        new TypeReference<Map<String, Object>>() {});
                String sourceFile = (String) doc.get("source_file");
                @SuppressWarnings("unchecked")
                List<String> copybooks = (List<String>) doc.get("copybooks_used");
                if (copybooks == null) continue;
                for (String cb : copybooks) {
                    UUID edge = UuidFactory.fromString("cbuse:" + sourceFile + ":" + cb);
                    ps.setString(1, edge.toString());
                    ps.setString(2, sourceFile);
                    ps.setString(3, null);
                    ps.setString(4, cb);
                    ps.setString(5, null);
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
