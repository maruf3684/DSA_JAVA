package DS_ALGO.Greedy.Easy;

import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) {
        int[] g  = {1,2,3,7,90};
        int[] c = {1,2,3,6,8};

        Arrays.sort(g);
        Arrays.sort(c);

        int i=0;
        int j=0;
        while (i<g.length && j<c.length){
            if(c[j]>=g[i]){
                i++;
                j++;
            }else {
                j++;
            }
        }

        System.out.println(i);
    }
}
