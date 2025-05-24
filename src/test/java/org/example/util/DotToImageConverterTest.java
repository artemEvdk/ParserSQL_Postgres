package org.example.util;

import guru.nidi.graphviz.engine.Format;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class DotToImageConverterTest {

    @Test
    void convertDotToImage_createsImageFile() throws IOException {
        String dotContent = """
            digraph ParseTree {
              node0 [label="SELECT"];
              node1 [label="FROM"];
              node0 -> node1;
            }
            """;

        File dotFile = File.createTempFile("test", ".dot");
        Files.write(dotFile.toPath(), dotContent.getBytes());

        File outputFile = File.createTempFile("test", ".png");
        outputFile.delete();

        DotToImageConverter.convertDotToImage(dotFile.getAbsolutePath(), outputFile.getAbsolutePath(), Format.PNG);

        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0);
    }
    @Test
    void convertDotToImage_skipsInvalidInputGracefully() throws IOException {
        String invalidDot = "digraph { this is not valid DOT }";

        File dotFile = File.createTempFile("invalid", ".dot");
        File outputFile = File.createTempFile("invalid", ".png");
        outputFile.delete();

        Files.write(dotFile.toPath(), invalidDot.getBytes());

        assertDoesNotThrow(() -> {
            DotToImageConverter.convertDotToImage(dotFile.getAbsolutePath(), outputFile.getAbsolutePath(), Format.PNG);
        });

        assertTrue(outputFile.exists());
        assertTrue(outputFile.length() > 0, "Файл изображения создан, но может быть пустым или невалидным.");
    }

}
