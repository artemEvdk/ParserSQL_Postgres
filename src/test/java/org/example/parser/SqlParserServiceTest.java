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
        SqlParseResult result = service.parse(sql);

        assertNotNull(result);
        assertNotNull(result.getParseTree());
        assertTrue(result.getParser() instanceof PostgreSQLParser);
    }

    @Test
    public void testInvalidSqlShouldThrowException() {
        String sql = "SELEC FROM";

        Exception exception = assertThrows(RuntimeException.class, () -> {
            service.parse(sql);
        });

        String message = exception.getMessage();
        assertTrue(message.contains("Syntax error"));
    }

    @Test
    public void testComplexQueryParsesCorrectly() {
        String sql = "SELECT name FROM customers WHERE id IN (SELECT customer_id FROM orders);";
        SqlParseResult result = service.parse(sql);
        ParseTree tree = result.getParseTree();

        assertNotNull(tree);
        assertTrue(tree.getChildCount() > 0);
    }
}
