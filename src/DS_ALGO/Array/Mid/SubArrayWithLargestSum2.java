package DS_ALGO.Array.Mid;

public class SubArrayWithLargestSum2 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int bigSum = nums[0];
        int startFlag = -1;
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if(sum==0){
                startFlag=i; //for track start
            }
            sum = sum+nums[i];
            if(sum>bigSum){
                bigSum=sum;
                start = startFlag;
                end = i;
            }
            if(sum<0){
                sum = 0;
            }

        }
        System.out.println(bigSum);
        System.out.println(start);
        System.out.println(end);
    }
}
