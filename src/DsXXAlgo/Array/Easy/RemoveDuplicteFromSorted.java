package DsXXAlgo.Array.Easy;

import java.util.Arrays;

// i diye unique array tuko er map rakhbo
// j diye khuje unique paile ane i er samne boaiye dibo

public class RemoveDuplicteFromSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,4,5,6};
        System.out.println(remove(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int remove(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
          if(arr[j]!=arr[i]){
             arr[i+1] = arr[j];
             i++;
          }
        }
        return i;
      }
}
