package Advanced.IO.Code.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

//file-stream theke character banacchi

public class FileInputStreamExample2 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDir);

        try  {
            FileInputStream fis = new FileInputStream("example.txt");
            int byteRead = fis.read();
            while (byteRead != -1) {
                System.out.print((char) byteRead);
                byteRead = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
