package strategy;

import java.io.File;
import java.util.List;

public class GzipCompression implements CompressionStrategy {
    @Override
    public void compressFiles(List<File> files) {
        System.out.println("GZIP Compression");
    }
}
