//String sql = "SELECT customers.name, COUNT(orders.order_id) AS order_count, AVG(orders.amount) AS avg_amount FROM customers JOIN orders ON customers.customer_id = orders.customer_id WHERE customers.registration_date > '2020-01-01'AND customers.region_id IN ( SELECT region_id FROM regions WHERE region_name = 'West') GROUP BY customers.name HAVING COUNT(orders.order_id) > 5 ORDER BY avg_amount DESC LIMIT 10";
        //String sql = "SELECT DISTINCT department, COUNT(employee_id) AS emp_count, AVG(salary) FROM employees WHERE salary > 50000 GROUP BY department HAVING COUNT(employee_id) > 5 ORDER BY AVG(salary) DESC LIMIT 10";
        //String sql = "SELECT * FROM table1 JOIN table2 ON table1.id = table2.id";

package org.example;

import guru.nidi.graphviz.engine.Format;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLParser;
import org.example.parser.SqlParseResult;
import org.example.parser.SqlParserService;
import org.example.tree.GuiTreeVisualizer;
import org.example.tree.TreeToDotSerializer;
import org.example.util.DotToImageConverter;


import java.nio.file.Files;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) throws Exception {
        String sql = "SELECT customers.name, COUNT(orders.order_id) AS order_count, AVG(orders.amount) AS avg_amount " +
                "FROM customers JOIN orders ON customers.customer_id = orders.customer_id " +
                "WHERE customers.registration_date > '2020-01-01' AND customers.region_id IN (" +
                "SELECT region_id FROM regions WHERE region_name = 'West') " +
                "GROUP BY customers.name HAVING COUNT(orders.order_id) > 5 " +
                "ORDER BY avg_amount DESC LIMIT 10";

        //  Парсинг SQL
        SqlParserService parserService = new SqlParserService();
        SqlParseResult result = parserService.parse(sql);

        PostgreSQLParser parser = result.getParser();
        ParseTree tree = result.getParseTree();

        // GUI визуализация
        GuiTreeVisualizer.showTree(parser, tree);

        // Сериализовать дерево в DOT
        TreeToDotSerializer serializer = new TreeToDotSerializer();
        String dot = serializer.serializeToDot(tree);
        Files.write(Paths.get("parse_tree.dot"), dot.getBytes());

        // Сгенерировать изображение
        DotToImageConverter.convertDotToImage("parse_tree.dot", "parse_tree.png", Format.PNG);

        System.out.println("Визуализация завершена.");
    }
}

