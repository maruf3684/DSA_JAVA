package DS_ALGO.Searching;
//lower bound means arr[i] >= n

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,8,8,10,10,11};
        //int target= 4;
        int target= 9;
        System.out.println(lowerBound(arr,target));
    }
    public  static int lowerBound(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        int mid;
        int ans= arr.length-1;
        while (start<=end){
            mid = start + (end-start)/2;
            if (arr[mid] >= target){
                ans=mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
}
