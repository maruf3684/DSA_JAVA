package DS_ALGO.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
//a, b, c, and d are distinct.
//nums[a] + nums[b] + nums[c] + nums[d] == target
public class FourSum {
    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        //int[] nums ={1,0,-1,0,-2,2};
        int[] nums ={1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j < nums.length; j++) {
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        Collections.addAll(temp,nums[i],nums[j],nums[k],nums[l]);
                        list.add(temp);
                        k++;
                        l--;
                        while (k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                        while (l>k && nums[l] == nums[l+1]){
                            l--;
                        }
                    } else if (sum<target) {
                        k++;
                    }else if(sum>target){
                        l--;
                    }
                }
            }

        }
        System.out.println(list);
    }
}
