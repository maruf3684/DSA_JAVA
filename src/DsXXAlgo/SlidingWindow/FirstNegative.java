package DsXXAlgo.SlidingWindow;

import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {
        brut();
        //better();
    }

    public static void brut() {
        int[] arr = {12, -1, 7, 8, -15, 30, 17, 88, 99};
        int limit = 3;

        int i = 0;
        int j = 0;
        Deque<Integer> negativeDeque = new LinkedList<>();

        while (j < arr.length) {
            if (arr[j] < 0) {
                negativeDeque.offerLast(arr[j]); // Enqueue negative element at the end
            }

            if (j - i + 1 == limit) {
                if (negativeDeque.isEmpty()) {
                    System.out.println("No negative");
                } else {
                    System.out.println(negativeDeque.peekFirst()); // Print the first negative element without dequeuing
                }

                if (!negativeDeque.isEmpty() && negativeDeque.peekFirst() == arr[i]) {
                    negativeDeque.pollFirst(); // Remove the first element from the deque if it's equal to arr[i]
                }

                i = i + 1;
            }

            j = j + 1;
        }

    }
}