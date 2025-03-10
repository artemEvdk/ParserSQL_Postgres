package org.example;

import guru.nidi.graphviz.engine.Format;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.Parser.PostgreSQLLexer;
import org.example.Parser.PostgreSQLParser;
import org.example.Tree.TreeToDotSerializer;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.example.DotToImageConverter.convertDotToImage;
import static org.example.Tree.GuiTree.showTreeInGUI;


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

        //System.out.println(tree.toStringTree(parser));// //;
     // showTreeInGUI(parser, tree);
        // Сериализация дерева в DOT
        TreeToDotSerializer serializer = new TreeToDotSerializer();
        String dot = serializer.serializeToDot(tree);
        //System.out.println(dot); // Вывод DOT в консоль

        // Сохранение DOT в файл
        Files.write(Paths.get("parse_tree.dot"), dot.getBytes());

        String dotFilePath = "parse_tree.dot";
        String outputImagePath = "parse_tree.png";
        Format format = Format.PNG; // Формат изображения

        convertDotToImage(dotFilePath, outputImagePath, format);

   }

}
