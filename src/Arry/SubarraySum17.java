package Arry;

import java.util.HashMap;
import java.util.Map;

// find all subarray which sum = 3;
public class SubarraySum17 {
    public static void main(String[] args) {
        brut();
        better();
        optimal(3);
    }

    public static void brut(){
        int [] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum=sum+arr[k];
                }
                if (sum == 3){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

    public static void better(){
        int [] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if (sum == 3){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

    public static void optimal(int find){
        int [] arr = {1,2,3,-3,1,1,1,4,2,-3};
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            sum =  sum + arr[i];
            if (map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }

            if (map.containsKey(sum-find)){
              count=count+map.get(sum-find);
            }
        }
        System.out.println(count);
    }
}
