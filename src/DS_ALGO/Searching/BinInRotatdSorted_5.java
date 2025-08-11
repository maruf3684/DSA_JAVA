package DS_ALGO.Searching;

public class BinInRotatdSorted_5 {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        //int[] arr= {1,2,3,4,5,6,7,8,9};
        int target = 4;

        int start = 0;
        int end = arr.length-1;


        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            //imp : boundery tulona ta kar sathe korbo? start or end ? tar jonne dan-bam kon dik sorted check kore naoua dorkar.

            if(arr[start]<=arr[mid]){
                //bam pas sorted
                if(target<arr[mid] && target>=arr[start]){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }else{
                //dan pash sorted
                if(target>arr[mid] && target<=arr[end]){
                   start = mid+1;
                }else {
                   end = mid -1;
                }
            }


        }
    }
}
