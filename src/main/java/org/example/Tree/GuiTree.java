package org.example.Tree;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.Parser.PostgreSQLParser;

import javax.swing.*;
import java.util.Arrays;

public class GuiTree {
    public static void showTreeInGUI(PostgreSQLParser parser, ParseTree tree) {

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
