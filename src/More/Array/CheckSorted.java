package More.Array;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        System.out.println(CheckSorted(arr));

    }
    public static boolean CheckSorted(int[] arr) {
        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
               sorted = false;
            }
        }
        return sorted;
    }
}
