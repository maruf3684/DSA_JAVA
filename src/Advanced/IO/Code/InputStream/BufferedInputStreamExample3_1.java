package Advanced.IO.Code.InputStream;

//	•	Purpose: It provides buffering for an input stream to improve efficiency by reducing the number of read operations.
//	•	Key Features:
//        •	Reads data in larger chunks (buffering) rather than one byte at a time, which can improve performance.
//	      •It can wrap any InputStream (like FileInputStream, DataInputStream, etc.) to enhance reading efficiency.
//        •	It provides methods like read(), read(byte[] b), and available().


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample3_1 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            int byteRead;
            while ((byteRead = bis.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
