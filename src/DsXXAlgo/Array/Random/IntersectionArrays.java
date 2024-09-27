package DsXXAlgo.Array.Random;

import java.util.ArrayList;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        ArrayList<Integer> unionArr= new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                i=i+1;
            } else if (arr1[i]>arr2[j]) {
                j=j+1;
            }else {
                unionArr.add(arr1[i]);
                i=i+1;
                j=j+1;
            }
        }
        System.out.println(unionArr);
    }
}
