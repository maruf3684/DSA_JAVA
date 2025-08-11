package DS_ALGO.Stackz;

import java.util.Stack;

public class ValidParen {
    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else {
                if(st.isEmpty()){
                    return false;
                }
                Character poped = st.pop();
                if(s.charAt(i)==')' && poped != '('){
                    return false;
                } else if (s.charAt(i)=='}' && poped != '{') {
                    return false;
                } else if (s.charAt(i)==']' && poped != '[') {
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
