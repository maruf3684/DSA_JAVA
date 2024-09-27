package DsXXAlgo.Searching;

public class Binar {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,9,12,16,17,100,233,566,777};
        int find=566;
        System.out.println(binary(arr,find));
    }
    public static int binary(int[] arr,int find){
        int start=0;
        int end= arr.length-1;
        int mid = start + (end-start)/2; //Losagu korle (start+end)/2 hoi

        while (start<=end){
            if (arr[mid] < find){
                start=mid+1;
                mid = (start+end)/2; //Same thing  start + (end-start)/2;
            }else if (arr[mid] > find){
                end=mid-1;
                mid = (start+end)/2;
            }else {
                return arr[mid];
            }
        }

        return -1;
    }
}
