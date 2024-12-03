package Advanced.IO.Code.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample3_3 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        try (PrintStream ps = new PrintStream(new FileOutputStream(currentDir+"/"+"example.txt"))) {
            ps.println("Hello, world!");
            ps.printf("This is a number: %d%n", 42);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
