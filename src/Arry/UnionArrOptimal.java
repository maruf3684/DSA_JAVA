package Arry;

import java.util.ArrayList;

public class UnionArrOptimal {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        ArrayList<Integer> unionArr= new ArrayList<>();


        int i = 0;
        int j = 0;
        while (i<arr1.length && j< arr2.length){
            System.out.println("looping");
            if(unionArr.isEmpty()){
                if(arr1[i]<arr2[j]){
                        unionArr.add(arr1[i]);
                        i=i+1;
                } else if (arr1[i]>arr2[j]) {
                        unionArr.add(arr2[j]);
                        j=j+1;
                }else {
                        unionArr.add(arr1[i]);
                        i=i+1;
                        j=j+1;
                }
            }else{
                if(arr1[i]<arr2[j]){
                    if(unionArr.get(unionArr.size()-1) != arr1[i]){
                        unionArr.add(arr1[i]);
                    }
                    i=i+1;
                } else if (arr1[i]>arr2[j]) {
                    if(unionArr.get(unionArr.size()-1) != arr2[j]){
                        unionArr.add(arr2[j]);
                    }
                    j=j+1;
                }else {
                    if(unionArr.get(unionArr.size()-1) != arr1[i]){
                        unionArr.add(arr1[i]);
                    }
                    i=i+1;
                    j=j+1;
                }
            }

        }
        while (i<arr1.length){
            if(unionArr.get(unionArr.size()-1) != arr1[i]){
                unionArr.add(arr1[i]);
            }
            i=i+1;
        }
        while (j< arr2.length){
            if(unionArr.get(unionArr.size()-1) != arr2[j]){
                unionArr.add(arr2[j]);
            }
            j=j+1;
        }
        System.out.println(unionArr);
    }
}
