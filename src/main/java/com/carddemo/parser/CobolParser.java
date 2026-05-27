package com.carddemo.parser;

import com.carddemo.ast.Node;
import com.carddemo.transform.CstToAstVisitor;
import io.proleap.cobol.asg.metamodel.Program;
import io.proleap.cobol.asg.params.CobolParserParams;
import io.proleap.cobol.asg.params.impl.CobolParserParamsImpl;
import io.proleap.cobol.asg.runner.impl.CobolParserRunnerImpl;
import io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Drives ProLeap on a single .cbl file with our copybook search path.
 */
public final class CobolParser {

    private final List<File> copybookDirs;
    private final List<String> copybookExtensions;
    private final CobolSourceFormatEnum format;

    public CobolParser(List<File> copybookDirs) {
        this.copybookDirs = copybookDirs;
        this.copybookExtensions = Arrays.asList("cpy", "CPY", "cbl", "CBL", "");
        this.format = CobolSourceFormatEnum.FIXED;
    }

    public ParseResult parse(File cobolFile) {
        ParseResult result = new ParseResult();
        result.file = cobolFile;
        try {
            CobolParserParams params = new CobolParserParamsImpl();
            params.setCopyBookDirectories(copybookDirs);
            params.setCopyBookExtensions(copybookExtensions);
            params.setFormat(format);
            Program program = new CobolParserRunnerImpl().analyzeFile(cobolFile, params);
            CstToAstVisitor visitor = new CstToAstVisitor(cobolFile.getName());
            result.nodes = visitor.visit(program);
            result.success = true;
        } catch (IOException | RuntimeException e) {
            result.success = false;
            result.error = e.getClass().getSimpleName() + ": " + (e.getMessage() == null ? "" : e.getMessage().split("\n")[0]);
            result.nodes = new ArrayList<>();
        }
        return result;
    }

    public static final class ParseResult {
        public File file;
        public boolean success;
        public String error;
        public List<Node> nodes;
    }
}
