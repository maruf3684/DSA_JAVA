package Advanced.IO.experimental.A_4_NIO.A_1_Channel;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel {
    public static void main(String[] args) throws IOException {
        String currentDir = System.getProperty("user.dir");
        String fullDirectoryPath = currentDir+"/src/Advanced/IO/experimental/A_1_ByteStream/A_1_FileApi/example.txt";
        String fullDirectoryWritePath = currentDir+"/src/Advanced/IO/experimental/A_1_ByteStream/A_1_FileApi/example_write.txt";

        try (
                RandomAccessFile rafRead = new RandomAccessFile(fullDirectoryPath,"r");
                RandomAccessFile rafWrite = new RandomAccessFile(fullDirectoryWritePath,"rw");
                FileChannel readChannel = rafRead.getChannel();
                FileChannel writeChannel = rafWrite.getChannel()
        ){

            // Create buffer with 48 bytes capacity
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytesReadLength = readChannel.read(buffer);

            while (bytesReadLength != -1) {
                System.out.println("Read " + bytesReadLength + " bytes");

                buffer.flip(); // switch from write mode to read mode

                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get()); // read one byte as char
                }

                // Flip again to write to file
                buffer.rewind();   // move position back to 0 to write same data
                writeChannel.write(buffer);

                buffer.clear(); // clear for next read
                bytesReadLength = readChannel.read(buffer);
            }
        }

    }
}


///explain buffer

