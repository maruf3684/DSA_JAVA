package DS_ALGO.Array.Mid;

import java.util.Arrays;

//national flag algo - solve it n complixity
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        int start = 0;
        int mid =0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,start);
                start++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            } else if (nums[mid]==2) {
                swap(nums,mid,high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public  static void swap(int[] nums,int ptr1,int ptr2){
        int temp = nums[ptr1];
        nums[ptr1] = nums[ptr2];
        nums[ptr2]=temp;
    }
}
