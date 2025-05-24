package org.example.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLLexer;
import org.example.parser.generated.PostgreSQLParser;

public class SqlParserService {

    public SqlParseResult parse(String sql) {
        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                throw new RuntimeException("Syntax error at line " + line + ", pos " + charPositionInLine + ": " + msg);
            }
        });

        ParseTree tree = parser.statement();
        return new SqlParseResult(parser, tree);
    }

}
