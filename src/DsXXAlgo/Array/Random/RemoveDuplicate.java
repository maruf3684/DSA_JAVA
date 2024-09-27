package DsXXAlgo.Array.Random;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,7,8,9,10,10};
        remove(arr);
    }

    public static void remove(int[] arr){
        //j picher ta i samner ta
        //samner ta picer tar sathe na mille , picher tar next ghora  samner ta bosbe
        //j er indigate ak ghor agiye jabe
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]){
                arr[j+1] = arr[i];
                j=j+1;
            }
        }

        for (int i = j+1 ; i < arr.length; i++) {
            arr[i]=-1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
