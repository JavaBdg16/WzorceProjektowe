package strategy;

import java.io.File;
import java.util.List;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compressFiles(List<File> files) {
        System.out.println("ZIP Compression");
    }
}
