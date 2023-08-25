package Arry;
import java.util.Arrays;

public class LeftRotateOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k=3;
        int kk =k % arr.length;
        int[] arr2 = new int[kk];


        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr[i];
        }
        for (int i = kk; i < arr.length; i++) {
            arr[i-kk]= arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr.length-kk+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
}
