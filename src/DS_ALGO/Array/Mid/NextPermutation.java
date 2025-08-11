package DS_ALGO.Array.Mid;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        System.out.println(Arrays.toString(optimal(nums)));


    }

    public static int[] optimal(int[] nums){
        int choto_index = -1;

        for (int i = nums.length-2; i >= 0; i--) {
            if(nums[i]<nums[i+1]){
                choto_index=i;
                break;
            }
        }
        if(choto_index==-1){
            reverse(nums,0,nums.length-1);
            return nums;
        }

        for (int i = nums.length-1; i > choto_index; i--) {
            if(nums[i]>nums[choto_index]){
               swap(nums,i,choto_index);
               break;
            }
        }

        reverse(nums,choto_index+1,nums.length-1);

        return nums;
    }

    public static void reverse(int[] nums,int start,int end){
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
