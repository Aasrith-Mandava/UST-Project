package com.carddemo;

import com.carddemo.analysis.CobolGraphBuilder;
import com.carddemo.analysis.CopybookUseBuilder;
import com.carddemo.analysis.CsdTransactionEntries;
import com.carddemo.analysis.JclGraphBuilder;
import com.carddemo.analysis.NodesIndexer;
import com.carddemo.ast.Node;
import com.carddemo.output.JsonWriter;
import com.carddemo.output.SqliteWriter;
import com.carddemo.parser.AsmStubRecognizer;
import com.carddemo.parser.BmsParser;
import com.carddemo.parser.CobolParser;
import com.carddemo.parser.CobolParser.ParseResult;
import com.carddemo.parser.CsdParser;
import com.carddemo.parser.JclParser;
import com.carddemo.transform.CopybookPreprocessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

@Command(name = "carddemo",
        description = "UST CodeCrafter - CardDemo parsing pipeline",
        mixinStandardHelpOptions = true,
        subcommands = {
                App.SmokeCmd.class,
                App.ParseCobolCmd.class,
                App.ParseJclCmd.class,
                App.ParseBmsCmd.class,
                App.ParseCsdCmd.class,
                App.ParseAsmCmd.class,
                App.ProvenanceCmd.class,
                App.ParseAllCmd.class,
                App.CoverageCmd.class,
                App.BuildGraphCmd.class
        })
public class App implements Callable<Integer> {

    public static void main(String[] args) {
        int rc = new CommandLine(new App()).execute(args);
        System.exit(rc);
    }

    @Override
    public Integer call() {
        CommandLine.usage(this, System.out);
        return 0;
    }

    @Command(name = "smoke", description = "Parse one COBOL file and print paragraph names + line ranges")
    static class SmokeCmd implements Callable<Integer> {
        @Parameters(index = "0", description = "Path to .cbl file") File cobolFile;
        @Option(names = "--cpy-dirs", description = "Comma-separated copybook directories",
                defaultValue = "corpus/carddemo/app/cpy,corpus/carddemo/app/cpy-bms,corpus/cics-stubs")
        String cpyDirs;

        @Override
        public Integer call() {
            List<File> dirs = new ArrayList<>();
            for (String d : cpyDirs.split(",")) {
                File f = new File(d.trim());
                if (f.isDirectory()) dirs.add(f);
            }
            CobolParser parser = new CobolParser(dirs);
            ParseResult r = parser.parse(cobolFile);
            if (!r.success) {
                System.err.println("PARSE FAILED: " + r.error);
                return 1;
            }
            System.out.println("File: " + cobolFile.getName());
            System.out.println("Total nodes: " + r.nodes.size());
            int paraCount = 0;
            for (Node n : r.nodes) {
                if ("Paragraph".equals(n.kind)) {
                    paraCount++;
                    Object name = n.payload.get("name");
                    System.out.printf("  Paragraph %-40s lines %d-%d  uuid=%s%n",
                            name, n.startLine, n.endLine, n.uuid);
                }
            }
            System.out.println("Paragraphs: " + paraCount);
            return 0;
        }
    }

    @Command(name = "parse-cobol", description = "Parse all .cbl files in a directory, emit per-file JSON artifacts")
    static class ParseCobolCmd implements Callable<Integer> {
        @Option(names = "--in", required = true, description = "Source directory (e.g. corpus/carddemo/app/cbl)") String inDir;
        @Option(names = "--out", required = true, description = "Output directory (e.g. output/artifacts/cbl)") String outDir;
        @Option(names = "--cpy-dirs", description = "Comma-separated copybook directories",
                defaultValue = "corpus/carddemo/app/cpy,corpus/carddemo/app/cpy-bms,corpus/cics-stubs")
        String cpyDirs;

        @Override
        public Integer call() throws Exception {
            List<File> dirs = new ArrayList<>();
            for (String d : cpyDirs.split(",")) {
                File f = new File(d.trim());
                if (f.isDirectory()) dirs.add(f);
            }
            CobolParser parser = new CobolParser(dirs);
            Path outRoot = Paths.get(outDir);
            Files.createDirectories(outRoot);

            List<File> cobolFiles = new ArrayList<>();
            try (Stream<Path> s = Files.list(Paths.get(inDir))) {
                s.filter(p -> {
                    String n = p.getFileName().toString().toLowerCase();
                    return n.endsWith(".cbl");
                }).sorted().forEach(p -> cobolFiles.add(p.toFile()));
            }

            int ok = 0, fail = 0;
            List<String[]> failures = new ArrayList<>();
            long t0 = System.currentTimeMillis();
            for (File cf : cobolFiles) {
                ParseResult r = parser.parse(cf);
                if (r.success) {
                    ok++;
                    Path outFile = outRoot.resolve(cf.getName() + ".json");
                    JsonWriter.writeNodes(outFile, cf.getName(), r.nodes);
                    System.out.printf("  OK  %-25s %4d nodes%n", cf.getName(), r.nodes.size());
                } else {
                    fail++;
                    failures.add(new String[]{cf.getName(), r.error});
                    System.out.printf("  FAIL %-25s %s%n", cf.getName(), r.error);
                }
            }
            long elapsed = System.currentTimeMillis() - t0;
            System.out.println("---");
            System.out.printf("COBOL parse coverage: %d/%d (%.1f%%) in %.1fs%n",
                    ok, cobolFiles.size(),
                    100.0 * ok / Math.max(1, cobolFiles.size()),
                    elapsed / 1000.0);
            if (!failures.isEmpty()) {
                System.out.println("Failures:");
                for (String[] f : failures) System.out.printf("  %-25s %s%n", f[0], f[1]);
            }
            return 0;
        }
    }

    // -------- helpers shared by the simpler parsers --------

    interface FileParser { List<Node> parse(Path p) throws Exception; }

    private static int runDirectoryParser(String label, String inDir, String outDir,
                                          String extensionLower, FileParser parser) throws Exception {
        Path outRoot = Paths.get(outDir);
        Files.createDirectories(outRoot);
        List<Path> files = new ArrayList<>();
        if (!Files.isDirectory(Paths.get(inDir))) {
            System.out.printf("%s parse coverage: no input directory %s%n", label, inDir);
            return 0;
        }
        try (Stream<Path> s = Files.list(Paths.get(inDir))) {
            s.filter(p -> p.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(extensionLower))
             .sorted().forEach(files::add);
        }
        int ok = 0;
        List<String[]> failures = new ArrayList<>();
        long t0 = System.currentTimeMillis();
        for (Path f : files) {
            try {
                List<Node> nodes = parser.parse(f);
                Path outFile = outRoot.resolve(f.getFileName().toString() + ".json");
                JsonWriter.writeNodes(outFile, f.getFileName().toString(), nodes);
                System.out.printf("  OK   %-25s %4d nodes%n", f.getFileName(), nodes.size());
                ok++;
            } catch (Exception ex) {
                String reason = ex.getClass().getSimpleName() + ": "
                        + (ex.getMessage() == null ? "" : ex.getMessage().split("\n")[0]);
                System.out.printf("  FAIL %-25s %s%n", f.getFileName(), reason);
                failures.add(new String[]{f.getFileName().toString(), reason});
            }
        }
        long elapsed = System.currentTimeMillis() - t0;
        System.out.printf("%s parse coverage: %d/%d (%.1f%%) in %.1fs%n",
                label, ok, files.size(),
                100.0 * ok / Math.max(1, files.size()),
                elapsed / 1000.0);
        return failures.isEmpty() ? 0 : 0;
    }

    @Command(name = "parse-jcl", description = "Parse all .jcl files in a directory")
    static class ParseJclCmd implements Callable<Integer> {
        @Option(names = "--in", required = true) String inDir;
        @Option(names = "--out", required = true) String outDir;
        @Override public Integer call() throws Exception {
            JclParser p = new JclParser();
            int rc = runDirectoryParser("JCL", inDir, outDir, ".jcl", p::parse);
            return rc;
        }
    }

    @Command(name = "parse-bms", description = "Parse all .bms files in a directory")
    static class ParseBmsCmd implements Callable<Integer> {
        @Option(names = "--in", required = true) String inDir;
        @Option(names = "--out", required = true) String outDir;
        @Override public Integer call() throws Exception {
            BmsParser p = new BmsParser();
            return runDirectoryParser("BMS", inDir, outDir, ".bms", p::parse);
        }
    }

    @Command(name = "parse-csd", description = "Parse all .csd files in a directory")
    static class ParseCsdCmd implements Callable<Integer> {
        @Option(names = "--in", required = true) String inDir;
        @Option(names = "--out", required = true) String outDir;
        @Override public Integer call() throws Exception {
            CsdParser p = new CsdParser();
            return runDirectoryParser("CSD", inDir, outDir, ".csd", p::parse);
        }
    }

    @Command(name = "parse-asm", description = "Recognize Assembler entry points in .asm files")
    static class ParseAsmCmd implements Callable<Integer> {
        @Option(names = "--in", required = true) String inDir;
        @Option(names = "--out", required = true) String outDir;
        @Override public Integer call() throws Exception {
            AsmStubRecognizer p = new AsmStubRecognizer();
            return runDirectoryParser("ASM", inDir, outDir, ".asm", p::parse);
        }
    }

    @Command(name = "provenance", description = "Run copybook preprocessor on all COBOL files, emit provenance JSON")
    static class ProvenanceCmd implements Callable<Integer> {
        @Option(names = "--in", required = true) String inDir;
        @Option(names = "--out", required = true) String outDir;
        @Option(names = "--cpy-dirs",
                defaultValue = "corpus/carddemo/app/cpy,corpus/carddemo/app/cpy-bms,corpus/cics-stubs")
        String cpyDirs;
        @Override public Integer call() throws Exception {
            List<Path> dirs = new ArrayList<>();
            for (String d : cpyDirs.split(",")) {
                Path p = Paths.get(d.trim());
                if (Files.isDirectory(p)) dirs.add(p);
            }
            CopybookPreprocessor cp = new CopybookPreprocessor(dirs);
            Path outRoot = Paths.get(outDir);
            Files.createDirectories(outRoot);
            List<Path> files = new ArrayList<>();
            try (Stream<Path> s = Files.list(Paths.get(inDir))) {
                s.filter(p -> p.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".cbl"))
                 .sorted().forEach(files::add);
            }
            ObjectMapper M = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            int ok = 0;
            for (Path f : files) {
                try {
                    CopybookPreprocessor.Result r = cp.expand(f);
                    Path outFile = outRoot.resolve(f.getFileName().toString() + ".provenance.json");
                    Map<String, Object> doc = new LinkedHashMap<>();
                    doc.put("source_file", r.sourceFile);
                    doc.put("expanded_line_count", r.expandedLines.size());
                    doc.put("copybooks_used", new ArrayList<>(r.copybooksUsed));
                    doc.put("provenance", r.provenance);
                    M.writeValue(outFile.toFile(), doc);
                    ok++;
                    System.out.printf("  OK   %-25s %d copybooks, %d lines%n",
                            f.getFileName(), r.copybooksUsed.size(), r.expandedLines.size());
                } catch (Exception ex) {
                    System.out.printf("  FAIL %-25s %s%n", f.getFileName(), ex.getMessage());
                }
            }
            System.out.printf("Provenance: %d/%d files%n", ok, files.size());
            return 0;
        }
    }

    @Command(name = "parse-all", description = "Parse all corpus file types end-to-end")
    static class ParseAllCmd implements Callable<Integer> {
        @Option(names = "--corpus", defaultValue = "corpus/carddemo/app") String corpus;
        @Option(names = "--out", defaultValue = "output/artifacts") String out;
        @Override public Integer call() throws Exception {
            String[][] steps = {
                    {"COBOL",      "parse-cobol",  corpus + "/cbl", out + "/cbl"},
                    {"JCL",        "parse-jcl",    corpus + "/jcl", out + "/jcl"},
                    {"BMS",        "parse-bms",    corpus + "/bms", out + "/bms"},
                    {"CSD",        "parse-csd",    corpus + "/csd", out + "/csd"},
                    {"ASM",        "parse-asm",    corpus + "/asm", out + "/asm"},
                    {"Provenance", "provenance",   corpus + "/cbl", out + "/provenance"}
            };
            for (String[] step : steps) {
                System.out.println("=== " + step[0] + " ===");
                int rc = new CommandLine(new App())
                        .execute(step[1], "--in=" + step[2], "--out=" + step[3]);
                if (rc != 0) System.out.println("(step returned " + rc + ")");
                System.out.println();
            }
            return 0;
        }
    }

    @Command(name = "coverage", description = "Generate a parse-coverage report from artifacts")
    static class CoverageCmd implements Callable<Integer> {
        @Option(names = "--corpus", defaultValue = "corpus/carddemo/app") String corpus;
        @Option(names = "--artifacts", defaultValue = "output/artifacts") String artifacts;
        @Option(names = "--out", defaultValue = "output/coverage_report.json") String out;
        @Override public Integer call() throws Exception {
            String[][] kinds = {
                    {"cobol", "cbl", ".cbl"},
                    {"jcl",   "jcl", ".jcl"},
                    {"bms",   "bms", ".bms"},
                    {"csd",   "csd", ".csd"},
                    {"asm",   "asm", ".asm"}
            };
            Map<String, Object> report = new LinkedHashMap<>();
            Map<String, Map<String, Object>> byKind = new LinkedHashMap<>();
            int totalIn = 0, totalOut = 0;
            for (String[] k : kinds) {
                Path corpusDir = Paths.get(corpus, k[1]);
                Path artifactDir = Paths.get(artifacts, k[1]);
                int inputCount = 0;
                if (Files.isDirectory(corpusDir)) {
                    try (Stream<Path> s = Files.list(corpusDir)) {
                        inputCount = (int) s.filter(p -> p.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(k[2]))
                                .count();
                    }
                }
                int parsedCount = 0;
                if (Files.isDirectory(artifactDir)) {
                    try (Stream<Path> s = Files.list(artifactDir)) {
                        parsedCount = (int) s.filter(p -> p.getFileName().toString().endsWith(".json")).count();
                    }
                }
                double pct = inputCount == 0 ? 100.0 : 100.0 * parsedCount / inputCount;
                Map<String, Object> row = new LinkedHashMap<>();
                row.put("input_files", inputCount);
                row.put("parsed_files", parsedCount);
                row.put("coverage_pct", pct);
                byKind.put(k[0], row);
                totalIn += inputCount;
                totalOut += parsedCount;
                System.out.printf("%-8s %4d / %-4d  %6.1f%%%n", k[0], parsedCount, inputCount, pct);
            }
            report.put("by_kind", byKind);
            report.put("total_input_files", totalIn);
            report.put("total_parsed_files", totalOut);
            report.put("overall_coverage_pct", totalIn == 0 ? 100.0 : 100.0 * totalOut / totalIn);
            new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
                    .writeValue(Paths.get(out).toFile(), report);
            System.out.printf("OVERALL  %4d / %-4d  %6.1f%%   (written to %s)%n",
                    totalOut, totalIn, totalIn == 0 ? 100.0 : 100.0 * totalOut / totalIn, out);
            return 0;
        }
    }

    @Command(name = "build-graph", description = "Build the SQLite graph store from per-file artifacts")
    static class BuildGraphCmd implements Callable<Integer> {
        @Option(names = "--artifacts", defaultValue = "output/artifacts") String artifacts;
        @Option(names = "--db",        defaultValue = "output/carddemo.db") String dbPath;
        @Option(names = "--corpus",    defaultValue = "corpus/carddemo/app") String corpus;
        @Option(names = "--clear",     description = "Truncate all tables before inserting") boolean clear;

        @Override public Integer call() throws Exception {
            Path artifactsRoot = Paths.get(artifacts);
            Path db = Paths.get(dbPath);
            Files.createDirectories(db.getParent());
            try (SqliteWriter w = new SqliteWriter(db)) {
                w.initSchema();
                if (clear) {
                    w.clearAll();
                    System.out.println("(cleared all tables)");
                }

                long t0 = System.currentTimeMillis();
                System.out.println("=== Indexing all nodes from per-file JSONs ===");
                int indexed = new NodesIndexer(w).indexAll(artifactsRoot);
                System.out.printf("  indexed %d nodes%n", indexed);

                System.out.println("=== JCL graph ===");
                JclGraphBuilder.Counts jc = new JclGraphBuilder(w).build(artifactsRoot.resolve("jcl"));
                System.out.printf("  %d JCL files -> %d job/step/dd rows, %d cross-job dependency edges%n",
                        jc.files, jc.edges, jc.depEdges);

                System.out.println("=== Copybook usage ===");
                int cbu = new CopybookUseBuilder(w).build(artifactsRoot.resolve("provenance"));
                System.out.printf("  %d copybook-use edges%n", cbu);

                System.out.println("=== CSD transaction entries ===");
                int tx = new CsdTransactionEntries(w).build(artifactsRoot.resolve("csd"));
                System.out.printf("  %d transaction entries seeded%n", tx);

                System.out.println("=== COBOL graphs (CALL / CICS / file I/O / def-use / control flow) ===");
                CobolGraphBuilder.Counts cc = new CobolGraphBuilder(w, Paths.get(corpus))
                        .build(artifactsRoot.resolve("cbl"));
                System.out.printf("  %d COBOL files, %d call, %d tx, %d file-io, %d def-use, %d control-flow edges%n",
                        cc.files, cc.callEdges, cc.txEdges, cc.fileEdges, cc.duEdges, cc.cfEdges);
                if (cc.missingSources > 0) System.out.printf("  (skipped %d files with missing source)%n", cc.missingSources);

                System.out.println("---");
                System.out.printf("nodes:            %d%n", w.countTable("nodes"));
                System.out.printf("call_graph:       %d%n", w.countTable("call_graph"));
                System.out.printf("file_io:          %d%n", w.countTable("file_io"));
                System.out.printf("transaction_flow: %d%n", w.countTable("transaction_flow"));
                System.out.printf("jcl_job:          %d%n", w.countTable("jcl_job"));
                System.out.printf("jcl_dependency:   %d%n", w.countTable("jcl_dependency"));
                System.out.printf("copybook_use:     %d%n", w.countTable("copybook_use"));
                System.out.printf("def_use:          %d%n", w.countTable("def_use"));
                System.out.printf("control_flow:     %d%n", w.countTable("control_flow"));
                System.out.printf("(in %.1fs)%n", (System.currentTimeMillis() - t0) / 1000.0);
                return 0;
            }
        }
    }
}
