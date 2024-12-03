package Advanced.IO.Code.OutputStream;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream3_1 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir+"/"+"example.txt"))) {
            String data = "Hello, world buffer!";
            bos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
