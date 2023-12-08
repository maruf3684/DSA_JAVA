package Arry;

public class KadanesAlgo_8 {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start = i;
            }

            int currentVal = arr[i];
            sum = sum+currentVal;

            if (sum>max){
                max=sum;
                end = i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
        System.out.println(start);
        System.out.println(end);
    }
}
