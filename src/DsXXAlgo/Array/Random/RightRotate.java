package DsXXAlgo.Array.Random;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int k=3;
        int kk =k % arr.length;
        int[] arr2 = new int[kk];

        int i = arr.length-kk;
        int j =0;
        while (i<arr.length){
            arr2[j] = arr[i];
            i=i+1;
            j=j+1;
        }

        for (int l = arr.length-1; l >= kk; l--) {
            arr[l]= arr[l-kk];
        }

        for (int m = 0; m < arr2.length; m++) {
            arr[m]=arr2[m];
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
}
