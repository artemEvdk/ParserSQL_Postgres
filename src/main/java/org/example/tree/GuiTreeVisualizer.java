package org.example.tree;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parser.generated.PostgreSQLParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.Arrays;

public class GuiTreeVisualizer {
    private static final Logger logger = LoggerFactory.getLogger(GuiTreeVisualizer.class);

    public static void showTree(PostgreSQLParser parser, ParseTree tree) {
        logger.info("Отображение дерева синтаксического анализа через GUI.");

        try {
            JFrame frame = new JFrame("ANTLR Parse Tree");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);

            viewer.setScale(1.0);
            panel.add(viewer);
            frame.add(panel);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);

            logger.info("Окно GUI успешно отображено.");
        } catch (Exception e) {
            logger.error("Ошибка при отображении дерева в GUI: {}", e.getMessage(), e);
        }
    }
}
