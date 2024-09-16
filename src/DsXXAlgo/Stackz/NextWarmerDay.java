package DsXXAlgo.Stackz;

import java.util.Arrays;
import java.util.Stack;

public class NextWarmerDay {
    public static void main(String[] args) {
        int[] a = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(a)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            st.push(i);
        }

        for (int i = 0; i < temperatures.length; i++) {
            
        }

        return ans;
    }
}
