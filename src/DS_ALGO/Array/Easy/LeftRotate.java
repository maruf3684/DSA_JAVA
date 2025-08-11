package DS_ALGO.Array.Easy;

import java.util.Arrays;

public class LeftRotate {
    //Shamner element ake ake piche niye giye lagabo
    //1,2,3,4,5
    //3,4,5,1,2

    //sol: 2 ta alada kore reverse kore then abar full reverse kore dau
    //2,1-5,4,3
    //3,4,5,1,2

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int place) {
        reverse(arr,0 , place-1);
        reverse(arr, place, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr,int start, int end) {
        while(start<=end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

}
