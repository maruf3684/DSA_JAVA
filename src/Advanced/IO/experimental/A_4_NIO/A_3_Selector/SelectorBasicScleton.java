package Advanced.IO.experimental.A_4_NIO.A_3_Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorBasicScleton {
    public static void main(String[] args) throws IOException {
        try(
                Selector selector = Selector.open();
                ServerSocketChannel serverChannel = ServerSocketChannel.open()
        ){
            serverChannel.bind(new InetSocketAddress(5000));
            serverChannel.configureBlocking(false);

            while (true) {
                selector.select();   // blocks until something happens
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iter = keys.iterator();

                while (iter.hasNext()) {
                    SelectionKey key = iter.next();

                    if (key.isAcceptable()) {
                        // a new client connected
                    }
                    if (key.isReadable()) {
                        // a client sent data
                    }
                    if (key.isWritable()) {
                        // channel is ready to write
                    }

                    iter.remove(); // very important
                }
            }
        }

    }
}
