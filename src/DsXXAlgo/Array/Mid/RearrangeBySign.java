package DsXXAlgo.Array.Mid;

import java.util.Arrays;
import java.util.List;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4}; //for always even number of n size array
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos = pos+2;
            }else{
                ans[neg]=nums[i];
                neg = neg+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
