package DS_ALGO.DP;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        int [] dpArr = new int[arr.length];
        System.out.println(dp(arr,arr.length-1,dpArr));
        System.out.println(dp2(arr,arr.length));
    }

    public static int dp(int[] arr,int n,int[] dpArr){

        if(dpArr[n] != 0){
            return dpArr[n];
        }

        if(n == 0){
            return 0;
        }

        int option1 = dp(arr,n-1,dpArr) + Math.abs(arr[n]  - arr[n-1]);
        int option2 = Integer.MAX_VALUE;
        if(n>1){
            option2 = dp(arr,n-2,dpArr) + Math.abs(arr[n]  - arr[n-2]);
        }

        int ans  = Math.min(option1,option2);
        dpArr[n] = ans;
        return ans;
    }


    public static int dp2(int[] arr,int n){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;

        for(int ind=1;ind<n;ind++){
            int option1 = dp[ind-1] + Math.abs(arr[ind]  - arr[ind-1]);
            int option2 = Integer.MAX_VALUE;
            if(ind>1){
                option2 = dp[ind-2] + Math.abs(arr[ind]  - arr[ind-2]);
            }
            dp[ind]=Math.min(option1,option2);
        }

        return dp[n-1];
    }

}
