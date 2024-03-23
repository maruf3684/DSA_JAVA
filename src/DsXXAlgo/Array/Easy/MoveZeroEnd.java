package DsXXAlgo.Array.Easy;

import java.util.Arrays;

/**
 * MoveZeroEnd
 */
public class MoveZeroEnd {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0,3,0,4,4,4};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int[] arr) {
        int zeroPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if(zeroPointer==i){
                if(arr[i] != 0){
                    arr[zeroPointer] = arr[i];
                    zeroPointer++;
                 }
            }else{
                if(arr[i] != 0){
                    int temp = arr[zeroPointer];
                    arr[zeroPointer] = arr[i];
                    arr[i]=temp;
                    zeroPointer++;
                 }
            }

        }
        
    }
}