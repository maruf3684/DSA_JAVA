package DS_ALGO.Sorting;
//note: select pivot and put it its correct place

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex = sort(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static int sort(int[] arr,int low,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i<j){
            while (arr[i]<= pivot && i<high){
                i++;
            }
            while (arr[j]> pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];   //swap
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j]; //swap
        arr[j]=temp;
        return j;
    }
}
