package DS_ALGO.Array.Hard;

import java.util.HashMap;
import java.util.Map;

public class CountAllSubArrWithGivnSum {
    public static void main(String[] args) {
        int[] arr = {5,-5,5,0};
        int target = 5;
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        //map e stoe hobe sum  and sum er count/ mane same sum kotogula pailam
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum == target){
                count = count + map.get(sum-target); //basically sum-target=0 here                   //// oi sum er name koita count ache? sob soh0 jog
            }else if(sum>target || sum<target){
                if(map.containsKey(sum-target)){
                    count = count + map.get(sum-target);
                }
            }
            //sum paile 1 barabo / na paile 1 vorbo
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
        }
        System.out.println(count);
    }
}
