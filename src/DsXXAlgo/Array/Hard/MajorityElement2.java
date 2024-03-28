package DsXXAlgo.Array.Hard;
//229. Majority Element II
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//Example 1:
//Input: nums = [3,2,3]
//Output: [3]

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
      //int[] nums = {1,1,1,1,3,3,2,2,2};
      int[] nums = {1,1,1,1,3,4,5,6,7};
      int element1 = Integer.MIN_VALUE;
      int element2= Integer.MIN_VALUE;
      int counter1=0;
      int counter2=0;

        for (int i = 0; i < nums.length; i++) {
            if(counter1 == 0 && element2!=nums[i]){
                element1 = nums[i];
                counter1 = 1;
            }else if(counter2==0 && element1!=nums[i]){
                element2 = nums[i];
                counter2 = 1;
            }else  if(element1==nums[i]){
                counter1++;
            } else if (element2==nums[i]) {
                counter2++;
            }else {
                counter1--;
                counter2--;
            }
        }
        System.out.println(element1);
        System.out.println(counter1);

        System.out.println(element2);
        System.out.println(counter2);

        int actualCountrt1=0;
        int actualCounter2=0;
        for (int i = 0; i < nums.length; i++) {
            if (element1==nums[i]){
                actualCountrt1++;
            }
            if(element2==nums[i]){
                actualCounter2++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        if(actualCountrt1>=(nums.length/3)+1){
            ans.add(element1);
        }
        if(actualCounter2>=(nums.length/3)+1){
            ans.add(element2);
        }
    }
}

