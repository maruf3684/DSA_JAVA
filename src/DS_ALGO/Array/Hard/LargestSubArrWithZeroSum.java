package DS_ALGO.Array.Hard;


import java.util.HashMap;
import java.util.Map;


public class LargestSubArrWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {-60,-5,-5};
        int target = -10;


        int sum = 0;
        int length = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            length = length+1;


            if(sum == target){
                maxLen=Math.max(length,maxLen);
            }else if(sum>target || sum<target){
                if(map.containsKey(sum-target)){
                    maxLen = Math.max(maxLen,i-map.get(sum-target));
                }
            }


            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
}

