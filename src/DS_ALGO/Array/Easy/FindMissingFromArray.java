package DS_ALGO.Array.Easy;

public class FindMissingFromArray {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
        }

        int expectedSum =  ((nums.length)*(nums.length+1))/2;
        int missingElement = expectedSum - sum;

        System.out.println(missingElement);
    }
}
