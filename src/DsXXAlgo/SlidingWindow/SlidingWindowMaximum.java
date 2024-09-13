package DsXXAlgo.SlidingWindow;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {9,10,9,-7,-4,-8,2,-6};
        var a= maxSlidingWindow(nums,5);
        System.out.println(Arrays.toString(a));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq= new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!dq.isEmpty() && i-k+1 >dq.peekFirst()){
                dq.pollFirst();
            }
            if(dq.isEmpty()){
                dq.addLast(i);
            } else if (nums[dq.peekLast()] <= nums[i]) {
                while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                    dq.pollLast();
                }
                dq.addLast(i);
            } else if (nums[dq.peekLast()]>nums[i]) {
                dq.addLast(i);
            }

            if(i>=k-1){
                ans.add(nums[dq.peekFirst()]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

