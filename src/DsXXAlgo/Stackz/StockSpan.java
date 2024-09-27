package DsXXAlgo.Stackz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Pair{
    Integer index;
    Integer Value;

    public Pair(Integer index, Integer value) {
        this.index = index;
        Value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getValue() {
        return Value;
    }
}

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        Deque<Pair> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()){
                list.add(-1);
            } else if (stack.peek().getValue()>arr[i]) {
                list.add(i-stack.peek().index);
            } else if (stack.peek().getValue()<arr[i]) {
                while (!stack.isEmpty() && stack.peek().getValue()<arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                   list.add(-1);
                }else {
                    list.add(i-stack.peek().index);
                }
            }
            stack.push(new Pair(i,arr[i]));
        }
        System.out.println(list);
    }
}
