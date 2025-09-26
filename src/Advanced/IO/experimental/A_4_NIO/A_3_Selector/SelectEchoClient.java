package Advanced.IO.experimental.A_4_NIO.A_3_Selector;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SelectEchoClient {
    public static void main(String[] args) {
        // try-with-resources → ensures socket closes automatically
        try (SocketChannel client = SocketChannel.open(new InetSocketAddress("localhost", 5002))) {

            // --- Send message to server ---
            String message = "Hello Server!";
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
            client.write(buffer);
            System.out.println("📤 Sent to server: " + message);

            // --- Read reply from server ---
            buffer.clear();
            client.read(buffer);
            buffer.flip();
            String reply = new String(buffer.array(), 0, buffer.limit()).trim();
            System.out.println("📥 Server replied: " + reply);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
