package Arry;

public class LiniarSearch {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int find = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find){
                System.out.println(i);
            }
        }
    }
}
