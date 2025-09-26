package Advanced.IO.experimental.A_4_NIO.A_2_Buffer;

import java.nio.ByteBuffer;

public class Buffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.put((byte) 'A');
        buffer.put((byte) 'B');
        buffer.put((byte) 'C');

        //       📊 State after writing "ABC":
        //        [ A ][ B ][ C ][   ][   ][   ][   ][   ]
        //                    ^ position=3
        //        limit=8
        //        capacity=8
        //Position moved forward as we wrote data.
        // Limit is still at 8 (capacity).

        buffer.flip();

        //        flip() does:
        //        limit = position (set new read boundary).
        //        position = 0 (go back to start for reading).

        //📊 State:
        //        [ A ][ B ][ C ][   ][   ][   ][   ][   ]
        //          ^ position=0
        //        limit=3
        //        capacity=8

        System.out.println((char) buffer.get()); // A
        System.out.println((char) buffer.get()); // B

        //📊 State after 2 reads:
        //        [ A ][ B ][ C ][   ][   ][   ][   ][   ]
        //                 ^ position=2
        //        limit=3
        //        capacity=8

        buffer.rewind();

        //        rewind() does:
        //        Reset position = 0.
        //        limit stays the same.
        //        📊 State:

        //        [ A ][ B ][ C ][   ][   ][   ][   ][   ]
        //         ^ position=0
        //        limit=3
        //        capacity=8
       // 👉 This allows us to re-read data from the buffer again (A, B, C) without rewriting into it.

        buffer.clear();

        //        clear() does:
        //        position = 0
        //        limit = capacity
        //        📊 State:

        //        [ A ][ B ][ C ][   ][   ][   ][   ][   ]
        //         ^ position=0
        //        limit=8
        //        capacity=8

//        ✅ Quick analogy:
//
//        flip() = “I finished writing, now prepare to read what I wrote.”
//
//        rewind() = “Go back to the start of what I was reading/writing.”
//
//        clear() = “Forget old data, get ready to write new data.”




    }
}
