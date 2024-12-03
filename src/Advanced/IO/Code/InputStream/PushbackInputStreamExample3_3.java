package Advanced.IO.Code.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamExample3_3 {
    public static void main(String[] args) {
        try (PushbackInputStream pbis = new PushbackInputStream(new FileInputStream("example.txt"))) {
            int byteRead = pbis.read();
            System.out.print((char) byteRead);

            // Push back the byte
            pbis.unread(byteRead);

            // Read again
            byteRead = pbis.read();
            System.out.print((char) byteRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
