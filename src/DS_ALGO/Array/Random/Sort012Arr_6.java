package DS_ALGO.Array.Random;

import java.util.Arrays;

public class Sort012Arr_6 {
    public static void main(String[] args) {
        optimal();
    }
    public static void optimal() {
         int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
         int start = 0;
         int mid = 0;
         int end = arr.length-1;

         while (mid<=end){
             if(arr[mid]==0){
                 swap(start,mid,arr);
                 start++;
                 mid++;
             } else if (arr[mid]==1) {
                 mid++;
             } else if (arr[mid] == 2) {
                 swap(end,mid,arr);
                 end --;
             }
         }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int a,int b , int[] arr){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
