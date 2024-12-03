package Advanced.IO.Code.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        try (FileOutputStream fos = new FileOutputStream(currentDir+"/"+"example.txt")) {
            String data = "Hello, world!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
