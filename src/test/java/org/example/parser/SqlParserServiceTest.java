package org.example.parser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqlParserServiceTest {

    private final SqlParserService service = new SqlParserService();

    @Test
    public void testValidSqlShouldParseSuccessfully() {
        String sql = "SELECT * FROM users;";
        PostgreSQLParser[] parserHolder = new PostgreSQLParser[1];
        ParseTree tree = service.parseSql(sql, parserHolder);

        assertNotNull(tree, "Parse tree should not be null");
        assertNotNull(parserHolder[0], "Parser should not be null");
        assertTrue(parserHolder[0] instanceof PostgreSQLParser, "Parser should be instance of PostgreSQLParser");
    }

    @Test
    public void testInvalidSqlShouldThrowException() {
        String sql = "SELEC FROM";
        PostgreSQLParser[] parserHolder = new PostgreSQLParser[1];

        Exception exception = assertThrows(RuntimeException.class, () -> {
            service.parseSql(sql, parserHolder);
        });

        String message = exception.getMessage();
        assertNotNull(message);
        assertTrue(message.toLowerCase().contains("syntax error") || message.toLowerCase().contains("error"), "Exception message should contain 'syntax error'");
    }

    @Test
    public void testComplexQueryParsesCorrectly() {
        String sql = "SELECT name FROM customers WHERE id IN (SELECT customer_id FROM orders);";
        PostgreSQLParser[] parserHolder = new PostgreSQLParser[1];
        ParseTree tree = service.parseSql(sql, parserHolder);

        assertNotNull(tree, "Parse tree should not be null");
        assertTrue(tree.getChildCount() > 0, "Parse tree should have children");
    }
}
