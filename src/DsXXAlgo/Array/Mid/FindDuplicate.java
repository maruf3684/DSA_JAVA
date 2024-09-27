package DsXXAlgo.Array.Mid;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {9,4,9,5,7,2,8,9,3,9};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == nums[j] && i != j) {
                return nums[i];
            }
            i = i+1;
            j= j+2;

            if(i==nums.length){
                i = 0;
            }
            if(j >= nums.length){
                j = 0;
            }
        }
        return 0;
    }
}
