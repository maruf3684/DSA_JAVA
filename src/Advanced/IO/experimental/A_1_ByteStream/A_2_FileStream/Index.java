package Advanced.IO.experimental.A_1_ByteStream.A_2_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Index {
    public static void main(String[] args) throws IOException {
        //readwritefromfile();
        readwritefromfilewith_buffer_array();
    }
    static void readwritefromfile() throws IOException{
        String currentDir = System.getProperty("user.dir");
        String fullDirectoryPath = currentDir+"/src/Advanced/IO/experimental/A_1_FileApi/example.txt";
        String fullDirectoryWritePath = currentDir+"/src/Advanced/IO/experimental/A_1_FileApi/example_write.txt";

        FileInputStream input = new FileInputStream(fullDirectoryPath);
        FileOutputStream output = new FileOutputStream(fullDirectoryWritePath);

        System.out.println(input.available());

        int data;
        while ((data = input.read()) != -1) {
            output.write(data);
            System.out.print(data);
            System.out.print((char) data);
        }

        input.close();
        output.close();
    }

    static void readwritefromfilewith_buffer_array() throws IOException{
        String currentDir = System.getProperty("user.dir");
        String fullDirectoryPath = currentDir+"/src/Advanced/IO/experimental/A_1_FileApi/cat.webp";
        String fullDirectoryWritePath = currentDir+"/src/Advanced/IO/experimental/A_1_FileApi/cat_write.webp";

        File f1 = new File(fullDirectoryPath);
        File f2 = new File(fullDirectoryWritePath);
        FileInputStream input = new FileInputStream(f1);
        FileOutputStream output = new FileOutputStream(f2);


        byte[] buffer = new byte[16]; // 8 KB buffer (use 4K–64K as you like)

        int bytesReadLength; //this is length
        while ((bytesReadLength = input.read(buffer)) != -1) {
            //between reed and write we can process data
            int avaliblebytes = input.available();
            System.out.println("avaliblebytes = " + avaliblebytes);

            //output.write(buffer, 1, bytesReadLength-1);    // 2=offset,3=length
            output.write(buffer, 0, bytesReadLength);
        }

        input.close();
        output.close();
    }
}
