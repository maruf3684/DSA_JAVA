package DsXXAlgo.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public  static Map<Character,Integer> s1Map= new HashMap<>();
    public  static Map<Character,Integer> s2Map= new HashMap<>();
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s2, String s1) {
        int [] getarr = minWindowfinder( s2, s1);
        int fast;
        String substring;
        if (getarr.length != 0){
            fast = getarr[0];
            substring = s2.substring(0,fast+1);
            for (int i = 0; i < substring.length(); i++) {
                Character c = s2.charAt(i);
                s2Map.put(c,s2Map.get(c)-1);
                if(check()){
                    substring = substring.substring(i+1);
                }
            }
            return substring;
        }
        return "-";
    }
    public static int[] minWindowfinder(String s2, String s1) {
        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            s1Map.put(ch, s1Map.getOrDefault(ch, 0) == 0 ? 1 : s1Map.get(ch)+1);
        }

        int fast = 0;
        int slow = 0;
        boolean find;

        while (fast<s2.length()){
            Character ch = s2.charAt(fast);
            s2Map.put(ch, s2Map.getOrDefault(ch, 0) == 0 ? 1 : s2Map.get(ch)+1);

            int windowLengh = (fast-slow) + 1;
            if(windowLengh >= s1.length()){
               find = check();
               if (find){
                   return new int[]{fast};
               }
            }
            fast++;
        }
        return new int[0];
    }

    public  static  boolean check(){
        boolean isAvailable = true;
        for (Character key : s1Map.keySet()) {
            if(!s1Map.get(key).equals(s2Map.get(key))){
                isAvailable = false;
                break;
            }
        }
        return isAvailable;
    }
}
