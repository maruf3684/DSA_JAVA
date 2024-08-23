package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String patern = getPatern(strs[i]);
            if(map.containsKey(patern)){
                map.get(patern).add(strs[i]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(patern, list);
            }

        }
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>(map.values());
        List<List<String>> listOfLists2 = new ArrayList<>(listOfLists);

        System.out.println(listOfLists2);
    }

    public static String getPatern(String str){
        StringBuilder ans = new StringBuilder("");
        int[] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i) - 'a';

            if(frequency[value] == 0){
                frequency[value] = 1;
            }else {
                frequency[value] = frequency[value] +1;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != 0){
                ans.append((char) (i+'a'));
                ans.append("-");
                ans.append(frequency[i]);
            }
        }
        return ans.toString();
    }
}
