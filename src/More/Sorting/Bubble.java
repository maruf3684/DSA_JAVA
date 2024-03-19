package More.Sorting;

import java.util.Arrays;

//Note: Push maximum to the last by [adjacent swapping]
//        15,12,14,9
//        12,14,9,15
//        12,9,14,15
//        9,12,14,15
//i mean: boro ta ke dhakka dite-dite piche niye jau
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,0,5,4,3,2,1};
        for (int i = arr.length-1; i >= 0; i--) {
            int checkSwapedOrNotFirstTime  = 0; //kono swap e jodi na hoi. tar mane tho array sorted , loop chaliye luv nai
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    checkSwapedOrNotFirstTime = 1;
                }
            }
            if(checkSwapedOrNotFirstTime==0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Complixity = worst: n^2 , best : n