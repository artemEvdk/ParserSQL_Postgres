        //String sql = "SELECT DISTINCT department, COUNT(employee_id) AS emp_count, AVG(salary) FROM employees WHERE salary > 50000 GROUP BY department HAVING COUNT(employee_id) > 5 ORDER BY AVG(salary) DESC LIMIT 10";
        //String sql = "SELECT * FROM table1 JOIN table2 ON table1.id = table2.id";

/*String sql = "SELECT customers.name, COUNT(orders.order_id) AS order_count, AVG(orders.amount) AS avg_amount " +
        "FROM customers JOIN orders ON customers.customer_id = orders.customer_id " +
        "WHERE customers.registration_date > '2020-01-01' AND customers.region_id IN (" +
        "SELECT region_id FROM regions WHERE region_name = 'West') " +
        "GROUP BY customers.name HAVING COUNT(orders.order_id) > 5 " +
        "ORDER BY avg_amount DESC LIMIT 10";*/

package org.example;

import guru.nidi.graphviz.engine.Format;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.SqlParserService;
import org.example.tree.TreeToDotSerializer;
import org.example.util.DotToImageConverter;
import org.example.tree.GuiTreeVisualizer;
import org.example.parser.generated.PostgreSQLParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;

public class MainApp {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        logger.info("=== Запуск приложения SQL Parser ===");

        String sql = "SELECT name FROM customers WHERE age > 30";
        PostgreSQLParser[] parserHolder = new PostgreSQLParser[1];

        try {
            SqlParserService parserService = new SqlParserService();
            ParseTree tree = parserService.parseSql(sql, parserHolder);
            PostgreSQLParser parser = parserHolder[0];

            GuiTreeVisualizer.showTree(parser, tree);

            TreeToDotSerializer serializer = new TreeToDotSerializer();
            String dot = serializer.serializeToDot(tree);
            Files.write(Paths.get("parse_tree.dot"), dot.getBytes());
            logger.info("Файл DOT успешно записан.");

            DotToImageConverter.convertDotToImage("parse_tree.dot", "parse_tree.png", Format.PNG);

        } catch (Exception e) {
            logger.error("Ошибка во время выполнения приложения: {}", e.getMessage(), e);
        }

        logger.info("=== Завершение работы приложения ===");
    }
}


