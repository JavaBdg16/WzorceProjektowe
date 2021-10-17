package strategy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CompressionContext compressionContext
                = new CompressionContext(new ZipCompression());

        compressionContext.createArchive(new ArrayList<>());

        compressionContext.setCompressionStrategy(new RarCompression());

        compressionContext.createArchive(new ArrayList<>());

        compressionContext.setCompressionStrategy(new GzipCompression());

        compressionContext.createArchive(new ArrayList<>());
    }
}
