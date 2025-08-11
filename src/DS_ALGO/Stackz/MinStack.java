package DS_ALGO.Stackz;

import java.util.Stack;

class MinStack {
    public Stack<Integer> st ;
    public Stack<Integer> minStack ;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack n = new MinStack();
        n.push(-2);
        n.push(0);
        n.push(-3);

        n.pop();

        System.out.println(n.getMin());
        System.out.println(n.getMin());
        System.out.println(n.getMin());
    }

    public void push(int val) {
       st.push(val);
       if(minStack.isEmpty()){
           minStack.push(val);
       }else {
           if(minStack.peek()<val){
               minStack.push(minStack.peek());
           }else {
               minStack.push(val);
           }
       }
    }

    public void pop() {
      st.pop();
      minStack.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
       return minStack.peek();
    }
}

