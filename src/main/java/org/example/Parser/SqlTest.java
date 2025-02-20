package org.example.Parser;
//добавить join
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.util.Arrays;

public class SqlTest {
    public static void main(String[] args) throws Exception {
        String sql = "SELECT customers.name, COUNT(orders.order_id) AS order_count, AVG(orders.amount) AS avg_amount FROM customers JOIN orders ON customers.customer_id = orders.customer_id WHERE customers.registration_date > '2020-01-01'AND customers.region_id IN ( SELECT region_id FROM regions WHERE region_name = 'West') GROUP BY customers.name HAVING COUNT(orders.order_id) > 5 ORDER BY avg_amount DESC LIMIT 10";
        //String sql = "SELECT DISTINCT department, COUNT(employee_id) AS emp_count, AVG(salary) FROM employees WHERE salary > 50000 GROUP BY department HAVING COUNT(employee_id) > 5 ORDER BY AVG(salary) DESC LIMIT 10";
        //String sql = "SELECT * FROM table1 JOIN table2 ON table1.id = table2.id";


        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);


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

        showTreeInGUI(parser, tree);
    }

    /**
     * Метод для отображения дерева в графическом интерфейсе.
     */
    private static void showTreeInGUI(PostgreSQLParser parser, ParseTree tree) {

        JFrame frame = new JFrame("ANTLR Parse Tree");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);


        viewer.setScale(1.0);
        panel.add(viewer);
        frame.add(panel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
