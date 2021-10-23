package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamProgram {

    public static void main(String[] args) {

        String file = "files/file.txt";
        try (InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char)c);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
