package org.example.util;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class DotToImageConverter {

    private static final Logger logger = LoggerFactory.getLogger(DotToImageConverter.class);

    public static void convertDotToImage(String dotFilePath, String outputImagePath, Format format) throws IOException {
        logger.info("Чтение DOT-файла: {}", dotFilePath);

        MutableGraph graph = new Parser().read(new File(dotFilePath));
        logger.debug("Граф успешно прочитан. Генерация изображения...");

        Graphviz.fromGraph(graph)
                .render(format)
                .toFile(new File(outputImagePath));

        logger.info("Изображение успешно создано: {}", outputImagePath);
    }
}
