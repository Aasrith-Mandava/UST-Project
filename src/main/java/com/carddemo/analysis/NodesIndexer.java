package com.carddemo.analysis;

import com.carddemo.output.SqliteWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Reads every per-file JSON artifact and inserts every node into the nodes table.
 * Idempotent: INSERT OR REPLACE on uuid.
 */
public final class NodesIndexer {

    private final SqliteWriter db;
    private final ObjectMapper mapper = new ObjectMapper();

    public NodesIndexer(SqliteWriter db) {
        this.db = db;
    }

    public int indexAll(Path artifactsRoot) throws Exception {
        int total = 0;
        try (Stream<Path> s = Files.walk(artifactsRoot)) {
            for (Path p : (Iterable<Path>) s.filter(Files::isRegularFile)
                                            .filter(NodesIndexer::isArtifactJson)::iterator) {
                total += indexOne(p);
            }
        }
        return total;
    }

    private static boolean isArtifactJson(Path p) {
        String n = p.getFileName().toString();
        return n.endsWith(".json") && !n.endsWith(".provenance.json");
    }

    private int indexOne(Path file) throws IOException {
        Map<String, Object> doc = mapper.readValue(file.toFile(),
                new TypeReference<Map<String, Object>>() {});
        Object nodesObj = doc.get("nodes");
        if (!(nodesObj instanceof List)) return 0;
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> nodes = (List<Map<String, Object>>) nodesObj;
        try {
            return db.insertNodes(nodes);
        } catch (Exception e) {
            throw new IOException("Failed inserting nodes from " + file + ": " + e.getMessage(), e);
        }
    }
}
