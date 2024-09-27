package DsXXAlgo.Array.Random;

import java.util.HashMap;
import java.util.Map;

//which 2 element make 14
public class TwoSum_5 {
    public static void main(String[] args) {
        brut();
        better();
        optimal();
        optimalPro();
        optimalProMax();
    }

    public static void brut(){
        System.out.println("----------brut------------");
        int[] arr = {2,3,6,5,8,11};
        int target = 14;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i]+arr[j] == 14){
                    System.out.println("Combination Found-> " + i + " and " + j);
                }
            }
        }
    }

    public static void better(){
        System.out.println("----------better------------");
        //brut and better same
        int[] arr = {2,3,6,5,8,11};
        int target = 14;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == 14){
                    System.out.println("Combination Found-> " + i + " and " + j);
                }
            }
        }
    }

    public static void optimal(){
        System.out.println("----------optimal-----------");
        int[] arr = {2,3,6,5,8,11};
        int target = 14;
        Map map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
           map.put(arr[i],i);
        }

        for (int i = 0; i < arr.length; i++) {
            int requiredvalue = 14-arr[i];
            if(map.containsKey(requiredvalue)){
                System.out.println("Combination Found-> " + i + " and " + map.get(requiredvalue));
            }
        }
    }

    public static void optimalPro(){
       // o(n*log n) = nLogn
        // for unsorted arr
        System.out.println("----------Optimal pro---------------");
        int[] arr = {2,3,6,5,8,11};
        int target = 14;
        Map map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            int requiredvalue = 14-arr[i];
            if(map.containsKey(requiredvalue)){
                System.out.println("Combination Found-> " + i + " and " + map.get(requiredvalue));
            }
            map.put(arr[i],i);
        }
    }


    public static void optimalProMax(){
        // Complixity O(n)
        //for sorted arrr
        System.out.println("----------Optimal pro max---------------");
        int[] arr = {2,3,6,5,8,11};
        int target = 14;

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int leftVal=arr[left];
            int rightVal= arr [right];
            int sum = leftVal+rightVal;

            if(sum<target){
                left ++;
            }else if (sum>target){
                right --;
            }else{
                System.out.println("Combination Found-> " + left + " and " + right);
                left ++;
                right --;
            }
        }

    }
}


////Complixity discussion
// o(n*log n) = nLogn