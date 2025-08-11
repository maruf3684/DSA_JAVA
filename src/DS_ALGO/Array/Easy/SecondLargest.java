package DS_ALGO.Array.Easy;

/**
 * SecondLargest
 */
public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = {12,1,2,3,4,5,5,9,2};
    Large(arr);
    SecondLarge(arr);
    
  }
  public static void Large(int[] arr) {
    int large  = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>large){
            large = arr[i];
        }
    }
    System.out.println(large);
  }
  public static void SecondLarge(int[] arr){
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
        }else{
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
    }
    System.out.println(secondLargest);
  }
}