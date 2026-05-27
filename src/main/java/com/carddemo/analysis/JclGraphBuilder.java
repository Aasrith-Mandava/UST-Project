package com.carddemo.analysis;

import com.carddemo.output.SqliteWriter;
import com.carddemo.transform.UuidFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Layer 4: JCL job graph + job dependency graph.
 *
 * jcl_job rows: job -> step -> program -> dd -> dataset.
 * jcl_dependency rows: derived by scanning all DD statements. If job A writes dataset X
 * (DISP=NEW/OLD/MOD) in some step, and job B reads dataset X (DISP=SHR/OLD) in some step,
 * we emit an upstream(A) -> downstream(B) edge.
 */
public final class JclGraphBuilder {

    private final SqliteWriter db;
    private final ObjectMapper mapper = new ObjectMapper();

    public JclGraphBuilder(SqliteWriter db) {
        this.db = db;
    }

    public Counts build(Path jclArtifactsDir) throws Exception {
        Counts c = new Counts();
        if (!Files.isDirectory(jclArtifactsDir)) return c;

        Map<String, List<DsAccess>> writers = new HashMap<>();
        Map<String, List<DsAccess>> readers = new HashMap<>();

        String sql = "INSERT OR REPLACE INTO jcl_job(edge_uuid, job_uuid, job_name, " +
                "step_uuid, step_name, step_program, dd_uuid, dd_name, dsn, disp) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = db.prepare(sql);
             Stream<Path> s = Files.list(jclArtifactsDir)) {
            for (Path p : (Iterable<Path>) s.filter(x -> x.getFileName().toString().endsWith(".json"))::iterator) {
                Map<String, Object> doc = mapper.readValue(p.toFile(),
                        new TypeReference<Map<String, Object>>() {});
                @SuppressWarnings("unchecked")
                List<Map<String, Object>> nodes = (List<Map<String, Object>>) doc.get("nodes");
                if (nodes == null) continue;
                c.files++;
                walkJcl(nodes, ps, c, writers, readers);
            }
            ps.executeBatch();
        }
        db.commit();

        // Build dependency edges
        String depSql = "INSERT OR REPLACE INTO jcl_dependency(edge_uuid, upstream_job, " +
                "upstream_step, downstream_job, downstream_step, dataset) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = db.prepare(depSql)) {
            Set<String> commonDatasets = new java.util.HashSet<>(writers.keySet());
            commonDatasets.retainAll(readers.keySet());
            for (String ds : commonDatasets) {
                for (DsAccess w : writers.get(ds)) {
                    for (DsAccess r : readers.get(ds)) {
                        if (w.job.equals(r.job)) continue;
                        UUID edge = UuidFactory.fromString("jcldep:" + w.job + ":" + r.job + ":" + ds);
                        ps.setString(1, edge.toString());
                        ps.setString(2, w.job);
                        ps.setString(3, w.step);
                        ps.setString(4, r.job);
                        ps.setString(5, r.step);
                        ps.setString(6, ds);
                        ps.addBatch();
                        c.depEdges++;
                    }
                }
            }
            ps.executeBatch();
        }
        db.commit();
        return c;
    }

    private void walkJcl(List<Map<String, Object>> nodes, PreparedStatement ps, Counts c,
                         Map<String, List<DsAccess>> writers, Map<String, List<DsAccess>> readers)
            throws Exception {
        Map<String, Map<String, Object>> byUuid = new LinkedHashMap<>();
        for (Map<String, Object> n : nodes) byUuid.put((String) n.get("uuid"), n);

        // Resolve job + current step
        String jobName = null;
        String jobUuid = null;
        for (Map<String, Object> n : nodes) {
            if ("JclJob".equals(n.get("kind"))) {
                jobUuid = (String) n.get("uuid");
                jobName = payloadName(n);
                break;
            }
        }
        if (jobName == null) {
            // Some JCL files are includes/procs without a JOB card - use the filename as job name
            for (Map<String, Object> n : nodes) {
                if ("JclFile".equals(n.get("kind"))) {
                    jobName = (String) n.get("file");
                    jobUuid = (String) n.get("uuid");
                    break;
                }
            }
        }

        String currentStepUuid = null;
        String currentStepName = null;
        String currentStepProgram = null;

        for (Map<String, Object> n : nodes) {
            String kind = (String) n.get("kind");
            if ("JclStep".equals(kind)) {
                currentStepUuid = (String) n.get("uuid");
                currentStepName = payloadName(n);
                Map<String, Object> payload = payload(n);
                currentStepProgram = payload == null ? null : (String) payload.get("program");
                emit(ps, jobUuid, jobName, currentStepUuid, currentStepName, currentStepProgram,
                        null, null, null, null);
                c.edges++;
            } else if ("JclDd".equals(kind)) {
                Map<String, Object> payload = payload(n);
                String ddName = payloadName(n);
                String dsn = payload == null ? null : (String) payload.get("dsn");
                String disp = payload == null ? null : (String) payload.get("disp");
                emit(ps, jobUuid, jobName, currentStepUuid, currentStepName, currentStepProgram,
                        (String) n.get("uuid"), ddName, dsn, disp);
                c.edges++;
                if (dsn != null && jobName != null) {
                    String key = normalizeDsn(dsn);
                    boolean isWrite = disp != null
                            && (disp.toUpperCase().contains("NEW") || disp.toUpperCase().contains("MOD"));
                    DsAccess a = new DsAccess();
                    a.job = jobName;
                    a.step = currentStepName;
                    if (isWrite) writers.computeIfAbsent(key, k -> new ArrayList<>()).add(a);
                    else readers.computeIfAbsent(key, k -> new ArrayList<>()).add(a);
                }
            }
        }
    }

    private void emit(PreparedStatement ps, String jobUuid, String jobName,
                      String stepUuid, String stepName, String stepProgram,
                      String ddUuid, String ddName, String dsn, String disp) throws Exception {
        UUID edge = UuidFactory.fromString("jclrow:" + jobName + ":" + stepName + ":" + ddName + ":" + dsn);
        ps.setString(1, edge.toString());
        ps.setString(2, jobUuid);
        ps.setString(3, jobName);
        ps.setString(4, stepUuid);
        ps.setString(5, stepName);
        ps.setString(6, stepProgram);
        ps.setString(7, ddUuid);
        ps.setString(8, ddName);
        ps.setString(9, dsn);
        ps.setString(10, disp);
        ps.addBatch();
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> payload(Map<String, Object> n) {
        Object p = n.get("payload");
        return p instanceof Map ? (Map<String, Object>) p : null;
    }

    private String payloadName(Map<String, Object> n) {
        Map<String, Object> p = payload(n);
        if (p == null) return null;
        Object name = p.get("name");
        return name == null ? null : name.toString();
    }

    private String normalizeDsn(String dsn) {
        // Strip member references and trim quotes; uppercase
        String s = dsn.trim().toUpperCase();
        if (s.startsWith("'") && s.endsWith("'")) s = s.substring(1, s.length() - 1);
        int paren = s.indexOf('(');
        if (paren > 0) s = s.substring(0, paren);
        return s;
    }

    private static class DsAccess {
        String job;
        String step;
    }

    public static class Counts {
        public int files;
        public int edges;
        public int depEdges;
    }
}
