package DsXXAlgo.Array.Mid;

public class SubArrayWithLargestSum {
    public static void main(String[] args) {
        int[] nums = {-1};
        int sum = 0;
        int bigSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(sum>bigSum){
                bigSum=sum;
            }
            if(sum<0){
                sum = 0;
            }

        }
        System.out.println(bigSum);
    }
}
