package DS_ALGO.Array.Easy;

public class FindNumberAppearOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,4};
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans^nums[i];
        }

        System.out.println(ans);
    }
}
