package DsXXAlgo.Array.Mid;

import java.util.Arrays;

public class ReplaceWithLeader {
    public static void main(String[] args) {
        int[] nums= {17,18,5,4,6,1};
        int current_Leader = -1;
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i]>current_Leader){
                int temp = nums[i];
                nums[i]=current_Leader;
                current_Leader=temp;
            }else {
                nums[i]=current_Leader;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
