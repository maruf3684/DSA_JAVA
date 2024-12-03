package Advanced.IO.Code.OutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample3_2 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(currentDir+"/"+"data.bin"))) {
            dos.writeInt(42);
            dos.writeFloat(3.14f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
