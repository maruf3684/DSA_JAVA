package Stack;

import java.util.*;

public class NextLargestElement {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,5,4,6};
        //-1,6,6,5,4,4,3
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = arr.length-1 ; i>=0; i--) {
            if(stack.isEmpty()){
                list.add(-1);
            } else if (stack.peek()>arr[i]) {
                list.add(stack.peek());
            } else if (stack.peek()<=arr[i]) {
                while (!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else {
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}
