package DsXXAlgo.Stackz;

import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String k = tokens[i];
            if ("+".equals(k) || "-".equals(k) || "*".equals(k) || "/".equals(k)) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(a+b);
                }else if(tokens[i].equals("-")){
                    stack.push(b-a);
                }
                else if(tokens[i].equals("*")){
                    stack.push(a*b);
                }
                else if(tokens[i].equals("/")){
                    stack.push(b/a);
                }
            }else {
                stack.push(Integer.valueOf(k));
            }
        }
        return stack.pop();
    }
}