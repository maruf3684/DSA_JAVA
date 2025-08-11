package DS_ALGO.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> tempArr = new ArrayList<>();
        int leftPointer = low;
        int rightPointer  = mid+1;
        while (leftPointer<=mid && rightPointer<=high){
            if(arr[leftPointer] < arr[rightPointer]){
                tempArr.add(arr[leftPointer]);
                leftPointer++;
            }else {
                tempArr.add(arr[rightPointer]);
                rightPointer++;
            }
        }

        while (leftPointer<=mid){
            tempArr.add(arr[leftPointer]);
            leftPointer++;
        }

        while (rightPointer<=high){
            tempArr.add(arr[rightPointer]);
            rightPointer++;
        }

        //rearranging in array
        int j = 0;
        for (int i = low; i <= high; i++) {
           // arr[i] = tempArr.get(i-low);
            //or
            arr[i] = tempArr.get(j);
            j++;
        }


    }

    public static void mergeSort(int[] arr,int low,int high){
        if(high==low) {
            return;
        }
        int mid = (high+low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
