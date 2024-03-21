package DsXXAlgo.Array;

import java.util.ArrayList;
import java.util.List;
//je choto tare agaite thsaki
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,11};
        int[] arr2 = {3,3,4,5,6,7,8};
        List<Integer> ans = new ArrayList<>();
        int i =0;
        int j=0;

        while (i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr2[i]<arr1[i]) {
                j++;
            }else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(ans);
    }
}
