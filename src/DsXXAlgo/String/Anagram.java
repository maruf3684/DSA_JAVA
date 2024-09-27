package DsXXAlgo.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(calculation("ab","cd"));
    }

    public static boolean calculation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> s1MAP= new HashMap<>();
        Map<Character,Integer> s2MAP= new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character s1key = s.charAt(i);
            Character t1key = t.charAt(i);

            if(s1MAP.containsKey(s1key)){
                s1MAP.put(s1key,s1MAP.get(s1key)+1);
            }else{
                s1MAP.put(s1key,1);
            }
            if(s2MAP.containsKey(t1key)){
                s2MAP.put(t1key,s2MAP.get(t1key)+1);
            }else{
                s2MAP.put(t1key,1);
            }
        }

        for (Character key : s1MAP.keySet()) {
            if(!s2MAP.containsKey(key)){
                return false;
            }
            if(!Objects.equals(s1MAP.get(key), s2MAP.get(key))){
                return false;
            }
        }
        return true;
    }

}
