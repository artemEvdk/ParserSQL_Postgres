package org.example.Parser;
//добавить join
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SqlTest {
    public static void main(String[] args) throws Exception {

        String sql = "SELECT customers.name, COUNT(orders.order_id) AS order_count, AVG(orders.amount) AS avg_amount FROM customers JOIN orders ON customers.customer_id = orders.customer_id WHERE customers.registration_date > '2020-01-01'AND customers.region_id IN ( SELECT region_id FROM regions WHERE region_name = 'West') GROUP BY customers.name HAVING COUNT(orders.order_id) > 5 ORDER BY avg_amount DESC LIMIT 10;";

        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        for (Token token : tokens.getTokens()) {
            System.out.println(token.getText() + " - " + token.getType());
        }

        PostgreSQLParser parser = new PostgreSQLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Error at line " + line + ", position " + charPositionInLine + ": " + msg);
            }
        });


        ParseTree tree = parser.statement();

        System.out.println(tree.toStringTree(parser));
    }
}
