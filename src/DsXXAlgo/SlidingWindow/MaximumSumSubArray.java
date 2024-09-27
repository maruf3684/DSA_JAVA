package DsXXAlgo.SlidingWindow;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,4,2,4,4,4,5,4,4};
        int limit = 3;

        int i =0;
        int j = 0;
        int sum = 0;
        int max = 0;
        while(j<arr.length){
            sum = sum + arr[j];
            if (j-i+1==limit){
                max= Math.max(max,sum);
                sum = sum-arr[i]; //important line
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
