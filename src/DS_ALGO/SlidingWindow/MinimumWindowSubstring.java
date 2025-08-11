package DS_ALGO.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("aab","aab"));
    }
    public static String minWindow(String s2, String s1) {
        if(s2.length()<s1.length()) return "";
        Map<Character,Integer> s1map = new HashMap<>();
        Map<Character,Integer> s2map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            s1map.put(ch, 1+s1map.getOrDefault(ch,0));
            s2map.put(ch,0);
        }

        int fast = 0;
        int slow = 0;
        int[] length = new int[]{0,s2.length()+1};
        int have = 0;

        while (fast<s2.length()){
            Character ch = s2.charAt(fast);
            if(s2map.containsKey(ch)){
                s2map.put(ch, 1+s2map.getOrDefault(ch,0));
                if (Objects.equals(s2map.get(ch), s1map.get(ch))){
                    have ++;
                }
            }
            while (have==s2map.size()){
                if((fast-slow)+1 < (length[1]-length[0])+1){
                    length[0] = slow;
                    length[1] = fast;
                }
                Character slowCh = s2.charAt(slow);
                if(s2map.containsKey(slowCh)){
                    s2map.put(slowCh,s2map.get(slowCh)-1);
                    if (s2map.get(slowCh)<s1map.get(slowCh)){
                        have --;
                    }
                }
                slow ++;
            }
            fast++;
        }

        return length[1]==s2.length()+1 ?"": s2.substring(length[0],length[1]+1);
    }
}
