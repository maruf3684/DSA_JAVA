package DsXXAlgo.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//bacnaac
//abba
//pwwkew
//wobbrovw
//wobgrovw
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "wobgrovw";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int firstPointer = 0;
        int slowPointter = 0;
        int maax = 0;
        while (firstPointer<=s.length()-1){
            Character letter = s.charAt(firstPointer);
            if(map.containsKey(letter)){
                if(slowPointter < map.get(letter) + 1){
                    slowPointter = map.get(letter) + 1;
                }
                map.put(letter,firstPointer);
            }else{
                map.put(letter,firstPointer);
            }
            maax = Math.max(maax,(firstPointer-slowPointter)+1);
            firstPointer ++;
        }
        return maax;
    }
}
