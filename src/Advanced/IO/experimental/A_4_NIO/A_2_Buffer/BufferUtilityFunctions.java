package Advanced.IO.experimental.A_4_NIO.A_2_Buffer;

import java.nio.ByteBuffer;

public class BufferUtilityFunctions {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(8);

        // Step 1: Write into buffer
        buffer.put((byte) 'A');
        buffer.put((byte) 'B');
        buffer.put((byte) 'C');
        printState("After writing ABC", buffer);

        // Step 2: Flip (prepare for reading)
        buffer.flip();
        printState("After flip()", buffer);

        // Step 3: Read 2 chars
        System.out.println("Read: " + (char) buffer.get());
        System.out.println("Read: " + (char) buffer.get());
        printState("After reading 2 chars", buffer);

        // Step 4: Mark current position (before C)
        buffer.mark();
        System.out.println("Marked position at index: " + buffer.position());

        // Step 5: Read remaining (C)
        System.out.println("Read: " + (char) buffer.get());
        printState("After reading last char", buffer);

        // Step 6: Reset (go back to mark)
        buffer.reset();
        printState("After reset()", buffer);

        // Step 7: Rewind (re-read everything)
        buffer.rewind();
        printState("After rewind()", buffer);

        // Step 8: Check hasRemaining
        while (buffer.hasRemaining()) {
            System.out.println("Remaining char: " + (char) buffer.get());
        }
        printState("After consuming all data", buffer);

        // Step 9: Clear (ready for new write)
        buffer.clear();
        printState("After clear()", buffer);
    }

    private static void printState(String action, ByteBuffer buffer) {
        System.out.println("\n--- " + action + " ---");
        System.out.println("position=" + buffer.position() +
                ", limit=" + buffer.limit() +
                ", capacity=" + buffer.capacity());
    }
}

//🔧 Utility Methods Explained
//
//flip() → switches from write mode to read mode (limit = position, position = 0).
//
//rewind() → resets position = 0 (allows re-reading data).
//
//clear() → resets buffer (position = 0, limit = capacity) for new write.
//
//compact() → keeps unread data and moves it to the start, then sets position after last unread byte (useful in sockets).
//
//mark() → sets a bookmark at the current position.
//
//reset() → goes back to the last marked position.
//
//hasRemaining() → checks if there is still data left to read (position < limit).
//
//remaining() → returns how many elements remain between position and limit.