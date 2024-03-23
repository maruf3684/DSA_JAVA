package DsXXAlgo.Array.Mid;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSome {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        HashMap<Integer,Integer> map= new HashMap<>();
        int target = 13;
        int[] ans = new int[2];
        map.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(ans));
        //return ans;
    }
}
