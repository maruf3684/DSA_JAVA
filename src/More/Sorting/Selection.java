package More.Sorting;

import java.util.Arrays;

//Note: select minimum and swap with first one
public class Selection {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,0,5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {
            int miniIndex = i;
            int mini = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<mini){
                    mini = arr[j];
                    miniIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = mini;
            arr[miniIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}

//Complixity = worst: n^2 , best : n^2