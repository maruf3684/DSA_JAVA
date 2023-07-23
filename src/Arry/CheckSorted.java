package Arry;

public class CheckSorted {
    public static void main(String[] args) {
        //int [] arr = {1,2,4,7,7,5,4,3};
        int [] arr = {1,2,4,7,8,10};
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

}
