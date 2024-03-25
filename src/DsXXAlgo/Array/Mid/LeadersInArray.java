package DsXXAlgo.Array.Mid;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums= {10,22,12,3,0,6};
        int current_lider = nums[nums.length-1];
        List<Integer> ans = new ArrayList<>();
        ans.add(current_lider);
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]>current_lider){
                ans.add(nums[i]);
                current_lider = nums[i];
            }
        }
        System.out.println(ans);
    }
}
