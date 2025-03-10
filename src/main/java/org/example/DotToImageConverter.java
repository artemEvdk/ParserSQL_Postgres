package org.example;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;
import java.io.File;
import java.io.IOException;


public class DotToImageConverter {
    public static void convertDotToImage(String dotFilePath, String outputImagePath, Format format) throws IOException {

        MutableGraph graph = new Parser().read(new File(dotFilePath));

        Graphviz.fromGraph(graph)
                .render(format)
                .toFile(new File(outputImagePath));

        System.out.println("Изображение успешно создано: " + outputImagePath);
    }


}
