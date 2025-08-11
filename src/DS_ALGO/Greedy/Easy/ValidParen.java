package DS_ALGO.Greedy.Easy;

import java.util.Stack;

public class ValidParen {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String k = "qweeerrrrrr";

        for (int i = 0; i < k.length(); i++) {
            stack.push(k.charAt(i));
        }

        System.out.println(stack);
    }
}
