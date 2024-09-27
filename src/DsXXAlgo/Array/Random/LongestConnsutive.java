package DsXXAlgo.Array.Random;

import java.util.HashSet;
import java.util.Set;

public class LongestConnsutive {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest  = 1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int item:set){
            if(!set.contains(item-1)){
                int count = 1;
                int increment =1;
                while (set.contains(item+increment)){
                    increment ++;
                    count++;
                }
                longest=Math.max(count,longest);
            }
        }


        return longest;
    }
}
