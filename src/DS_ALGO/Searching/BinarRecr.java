package DS_ALGO.Searching;

public class BinarRecr {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,9,12,16,17,100,233,566,777};
        int find=777;
        int start=0;
        int end= arr.length-1;
        System.out.println(srarch(arr,start,end,find));
    }
    public static int srarch(int[] arr,int start,int end,int find){
        if (start>end){
            return -1;
        }
        int mid = start + (end-start)/2; //Losagu korle (start+end)/2 hoi
        if (arr[mid] < find){
            start=mid+1;
            return srarch(arr,start,end,find);
        }else if (arr[mid] > find){
            end=mid-1;
            return srarch(arr,start,end,find);
        }else {
            return arr[mid];
        }
    }
}
