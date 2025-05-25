package org.example.tree;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeToDotSerializer {

    private static final Logger logger = LoggerFactory.getLogger(TreeToDotSerializer.class);
    private final StringBuilder dotBuilder = new StringBuilder();
    private int nodeId = 0;

    /**
     * Сериализует дерево в формат DOT.
     */
    public String serializeToDot(ParseTree tree) {
        logger.info("Начало сериализации дерева в формат DOT.");
        dotBuilder.append("digraph ParseTree {\n");
        dotBuilder.append("    node [shape=box];\n");
        visit(tree);
        dotBuilder.append("}\n");
        logger.info("Сериализация завершена успешно.");
        return dotBuilder.toString();
    }

    /**
     * Рекурсивный обход дерева.
     */
    private int visit(ParseTree tree) {
        int currentNodeId = nodeId++;
        String nodeLabel = getNodeLabel(tree);

        dotBuilder.append("    node").append(currentNodeId)
                .append(" [label=\"").append(nodeLabel).append("\"];\n");

        for (int i = 0; i < tree.getChildCount(); i++) {
            int childNodeId = visit(tree.getChild(i));
            dotBuilder.append("    node").append(currentNodeId)
                    .append(" -> node").append(childNodeId).append(";\n");
        }

        return currentNodeId;
    }

    /**
     * Возвращает метку для узла дерева.
     */
    private static String getNodeLabel(ParseTree tree) {
        if (tree instanceof TerminalNode) {
            return tree.getText();
        } else if (tree instanceof ParserRuleContext) {
            return tree.getClass().getSimpleName().replace("Context", "");
        }
        return "UNKNOWN";
    }
}