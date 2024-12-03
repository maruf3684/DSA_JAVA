package Advanced.IO.Code.InputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample3_2 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            System.out.println("Read int: " + intValue);
            System.out.println("Read float: " + floatValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
