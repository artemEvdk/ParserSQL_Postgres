package org.example.tree;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLLexer;
import org.example.parser.generated.PostgreSQLParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeToDotSerializerTest {

    private ParseTree parse(String sql) {
        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        return parser.statement();
    }

    @Test
    void serializeToDotProducesNonEmptyOutput() {
        String sql = "SELECT * FROM users;";
        ParseTree tree = parse(sql);

        TreeToDotSerializer serializer = new TreeToDotSerializer();
        String dot = serializer.serializeToDot(tree);

        assertNotNull(dot);
        assertTrue(dot.startsWith("digraph ParseTree"));
        assertTrue(dot.contains("node"));
        assertTrue(dot.contains("->"));
    }

    @Test
    void serializeToDotHandlesEmptyTree() {
        TreeToDotSerializer serializer = new TreeToDotSerializer();
        String dot = serializer.serializeToDot(new PostgreSQLParser.StatementContext(null, 0));

        assertNotNull(dot);
        assertTrue(dot.startsWith("digraph ParseTree"));
    }
}
