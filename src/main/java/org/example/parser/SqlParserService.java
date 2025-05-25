package org.example.parser;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLLexer;
import org.example.parser.generated.PostgreSQLParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqlParserService {
    private static final Logger logger = LoggerFactory.getLogger(SqlParserService.class);

    public ParseTree parseSql(String sql, PostgreSQLParser[] parserHolder) {
        logger.info("Начало парсинга SQL-скрипта.");
        logger.debug("SQL: {}", sql);

        CharStream input = CharStreams.fromString(sql);
        PostgreSQLLexer lexer = new PostgreSQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        parserHolder[0] = parser;

        parser.removeErrorListeners();
        lexer.removeErrorListeners();

        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        parser.addErrorListener(errorListener);
        lexer.addErrorListener(errorListener);

        ParseTree tree = parser.statement(); // начальный rule может отличаться в зависимости от грамматики

        if (errorListener.hasErrors()) {
            String message = "Синтаксические ошибки при парсинге SQL: " + String.join("; ", errorListener.getErrors());
            logger.error(message);
            throw new RuntimeException(message);
        }

        logger.info("Парсинг завершён успешно.");
        return tree;
    }

}
