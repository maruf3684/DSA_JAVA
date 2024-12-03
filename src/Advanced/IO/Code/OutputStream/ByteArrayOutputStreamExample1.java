package Advanced.IO.Code.OutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample1 {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String data = "Hello, world!";
            baos.write(data.getBytes());
            System.out.println("Byte array: " + new String(baos.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
