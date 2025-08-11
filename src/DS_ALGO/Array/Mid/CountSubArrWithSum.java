package DS_ALGO.Array.Mid;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrWithSum {
    public static void main(String[] args) {
        //int[] nums = {1,2,1,1,1,1,3};
        //int[] nums = {1,-1,0};
        int[] nums = {5,-5,5,0};
        int k = 5;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int start = 0;
        int sum = 0;

        while(start<nums.length){
            sum = sum + nums[start];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
            start++;
        }

        System.out.println(count);
    }
}
