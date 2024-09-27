package DsXXAlgo.Map;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 25);
        map.put(2, 30);
        map.put(3, 35);
        map.put(4, 40);

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
