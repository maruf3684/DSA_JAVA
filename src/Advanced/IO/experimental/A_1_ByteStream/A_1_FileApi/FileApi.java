package Advanced.IO.experimental.A_1_ByteStream.A_1_FileApi;

import java.io.File;


public class FileApi {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String fullDirectoryPath = currentDir+"/src/Advanced/IO/Udemy/FileApi";
        File ex1 = new File(fullDirectoryPath,"example.txt");

        IO.println(ex1.exists());
        IO.println(ex1.isFile());
        IO.println(ex1.isDirectory());

    }
}
