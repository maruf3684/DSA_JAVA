package DsXXAlgo.Array.Random;

import java.util.Arrays;

public class MvZeroEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        //int[] arr = {1,2,3};
        int pointer1=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                pointer1=i;
                break;
            }
        }
        if (pointer1==-1){
            System.out.println("No zero found");
            return;
        }

        for (int i = pointer1+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp=arr[pointer1];
                arr[pointer1]=arr[i];
                arr[i]=temp;
                pointer1=pointer1+1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
