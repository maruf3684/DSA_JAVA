package DsXXAlgo.Sorting;

import java.util.Arrays;

//Note: Take a element and place it in its correct position (back a sorted array er moddhe while loop cholbe)
//        15,12,14,9
//        12,15,14,9
//        12,14,15,9
//        9,12,14,15
public class Incertion {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,0,5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Complixity = worst: n^2 , best : n