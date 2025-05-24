package org.example.parser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLParser;

public class SqlParseResult {
    private final PostgreSQLParser parser;
    private final ParseTree parseTree;

    public SqlParseResult(PostgreSQLParser parser, ParseTree parseTree) {
        this.parser = parser;
        this.parseTree = parseTree;
    }

    public PostgreSQLParser getParser() {
        return parser;
    }

    public ParseTree getParseTree() {
        return parseTree;
    }
}
