package DsXXAlgo.SlidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int fast = 0;
        int slow = 0;
        int maxx = 0;
        int maxfreq = 0;

        while (fast<s.length()){
            Character letter = s.charAt(fast);
            if(!map.containsKey(letter)){
                map.put(letter,1);
            }else {
                map.put(letter,map.get(letter)+1);
            }
            maxfreq = Math.max(maxfreq,map.get(letter));

            int windowLength = (fast-slow)+1;
            if(windowLength - maxfreq <= k){
               maxx = Math.max(maxx,(fast-slow)+1);
            }else {
                Character slowChar = s.charAt(slow);
                map.put(slowChar, map.get(slowChar) - 1);
                slow++;
            }

            fast++;
        }
        return maxx;
    }
}
