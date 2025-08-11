package DS_ALGO.Array.Random;

//Longest subarray with sum k =6 [only for positive number]
public class LongestSubArrPos {
    public static void main(String[] args) {
        System.out.println(optimal());
    }

    public static int optimal() {
       //
        int arr []  = {20,2,3,1,1,1,1,3,3};
        int n = arr.length;
        int left = 0;
        int right=0;
        int sum = arr[0];
        int maxlen = 0;
        int k=6;

        while (right<n){
            while (left <= right && sum>k){
                sum-= arr[left];
                left ++;
            }
            if (sum==k){
                maxlen= Math.max(maxlen,right-left+1);
            }

            right ++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxlen;
    }
}
