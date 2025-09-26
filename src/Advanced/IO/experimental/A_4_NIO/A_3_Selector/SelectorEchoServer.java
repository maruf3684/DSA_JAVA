package Advanced.IO.experimental.A_4_NIO.A_3_Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorEchoServer {
    public static void main(String[] args) {
        try(
                Selector selector = Selector.open();
                ServerSocketChannel serverChannel = ServerSocketChannel.open()
        ) {
            // 1. Bind server to port 5000
            serverChannel.bind(new InetSocketAddress(5002));

            // 2. Set non-blocking mode (required for selector)
            serverChannel.configureBlocking(false);

            // 3. Register server channel to listen for ACCEPT events
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Server started on port 5002...");

            // 4. Main loop: wait for events (accept/read/write)
            while (true){
                selector.select(); // blocks until an event occurs
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iter = keys.iterator();

                // 5. Process all ready events
                while (iter.hasNext()){
                    SelectionKey key = iter.next();

                    // --- Accept new client connection ---
                    if(key.isAcceptable()){
                        SocketChannel client = serverChannel.accept();
                        if (client != null) {
                            client.configureBlocking(false);

                            // Register new client channel for READ events
                            client.register(selector, SelectionKey.OP_READ);
                            System.out.println("Accepted new client: " + client.getRemoteAddress());
                        }
                    // --- Read data from client ---
                    }else if(key.isReadable()){
                        SocketChannel client = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(256);
                        int bytesRead = client.read(buffer);

                        if (bytesRead == -1) {
                            // Client closed connection
                            System.out.println("❌ Client disconnected: " + client.getRemoteAddress());
                            client.close();
                        } else {
                            buffer.flip();
                            String msg = new String(buffer.array(), 0, buffer.limit()).trim();
                            System.out.println("📥 Received from client " + client.getRemoteAddress() + ": " + msg);

                            // Echo message back to client
                            client.write(ByteBuffer.wrap(("Echo: " + msg).getBytes()));
                        }
                    }
                    iter.remove(); // avoid reprocessing
                }
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}


//🔹 Selector basics recap (mental model)
//Selector = an event multiplexer.
//
//One thread can monitor many channels.
//
//Channels must be non-blocking.
//
//You register a channel with a selector and tell it what you’re interested in:
//
//OP_ACCEPT → new connection (server only)
//
//OP_CONNECT → connection finished (client only)
//
//OP_READ → data available to read
//
//OP_WRITE → channel ready to write