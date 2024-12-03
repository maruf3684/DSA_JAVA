package Advanced.IO.Code.InputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

//byte array-stream theke character banacchi

public class ByteArrayInputStreamExample1 {
    public static void main(String[] args) {
        byte[] data = "Hello, world!".getBytes();
        System.out.println(Arrays.toString(data));

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        System.out.println("total = " + bais.available());
        System.out.println();

        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());
        System.out.println((char)bais.read());

        int byteRead;
        while ((byteRead = bais.read()) != -1) {
            System.out.println((char) byteRead);
        }

        try {
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
