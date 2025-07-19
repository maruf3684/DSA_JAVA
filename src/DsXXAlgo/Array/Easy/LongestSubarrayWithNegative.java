package DsXXAlgo.Array.Easy;

import java.util.HashMap;

public class LongestSubarrayWithNegative {
    public static void main(String[] args) {
        //int[] arr = {3,1,1,2,1  ,2,1,1,4};
        //int givenSum = 5;
        int[] arr = {2,0,0,3,-3,1,1,1};
        int givenSum = 3;
        best(arr,givenSum);
    }
    public static void best(int[] arr,int givenSum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = arr[0];
        map.put(arr[0],0);
        if(sum == givenSum){
//            System.out.println(STR."start = 0, end = \{0}");
            return;
        }

        int longDistance = -1;
        String keypair = "No subarray found";
        for (int i = 1; i < arr.length; i++) {
            sum=sum+arr[i];

            if(sum == givenSum){
                //System.out.println(STR."start = 0, end = \{i}");
                longDistance = i-0;
//                keypair=STR."start = 0, end = \{i}";
            }
            else if(sum > givenSum){
                if(map.containsKey(sum-givenSum)){
                    int prevKey = map.get(sum-givenSum)+1;
                    if(longDistance < i-prevKey){
                        longDistance = i-prevKey;
//                        keypair=STR."start = \{map.get(sum-givenSum)+1}, end = \{i}";
                    }
                    //System.out.println(STR."start = \{map.get(sum-givenSum)+1}, end = \{i}");
                }
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(longDistance);
        System.out.println(keypair);
    }
}
