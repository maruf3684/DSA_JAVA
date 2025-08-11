package DS_ALGO.Array.Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(Arrays.toString(topKFrequent(arr,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build the frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a PriorityQueue (max-heap) to get the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        // Add all entries to the priority queue
        maxHeap.addAll(frequencyMap.entrySet());

        // Extract the top k elements from the heap
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = maxHeap.poll().getKey();
        }

        return topK;
    }
}
