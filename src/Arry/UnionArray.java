package Arry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hashSet.add(arr2[i]);
        }

        int setSize = hashSet.size();
        int[] unionArr= new int[setSize];

        // Create an iterator for the HashSet
        Iterator<Integer> iterator = hashSet.iterator();

        // Iterate and retrieve values one by one
        int i=0;
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            unionArr[i]=value;
            i=i+1;
        }

        System.out.println(Arrays.toString(unionArr));

    }
}
