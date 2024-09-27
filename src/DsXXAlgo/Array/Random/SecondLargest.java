package DsXXAlgo.Array.Random;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,7,5,4,3};
        optimal(arr);
        mostOptimal(arr);
    }

    public static void optimal(int[] arr){
        int largest=arr[0];
        int secondLargest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }

    public static void mostOptimal(int[] arr){
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }

        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
