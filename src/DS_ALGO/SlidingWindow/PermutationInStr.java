package DS_ALGO.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInStr {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1Map= new HashMap<>();
        Map<Character,Integer> s2Map= new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            s1Map.put(ch, s1Map.getOrDefault(ch, 0) == 0 ? 1 : s1Map.get(ch)+1);
        }

        int fast = 0;
        int slow = 0;
        boolean isAvailable = true;
        while (fast<s2.length()){
            Character ch = s2.charAt(fast);
            s2Map.put(ch, s2Map.getOrDefault(ch, 0) == 0 ? 1 : s2Map.get(ch)+1);

            int windowLengh = (fast-slow) + 1;
            if(windowLengh == s1.length()){
                for (Character key : s1Map.keySet()) {
                    if(!s1Map.get(key).equals(s2Map.get(key))){
                        isAvailable = false;
                    }
                }
                if (isAvailable){
                    return true;
                }
                //resetting isAvailable
                isAvailable = true;
                fast ++;

                Character c = s2.charAt(slow);
                s2Map.put(c,s2Map.get(c)-1);
                slow++;
            }else {
                fast ++;
            }
        }
        return false;
    }
}
