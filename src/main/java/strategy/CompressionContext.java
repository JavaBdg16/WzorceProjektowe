package strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {

//    strategy.Main.strategy.RarCompression rarCompression = new strategy.Main.strategy.RarCompression();
//    strategy.Main.strategy.ZipCompression zipCompression = new strategy.Main.strategy.ZipCompression();

    private CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(List<File> files) {
        compressionStrategy.compressFiles(files);
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
}
