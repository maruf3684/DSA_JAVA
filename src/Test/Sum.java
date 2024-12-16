package Test;


import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        Integer a = 10;
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);

        test(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void test (Integer a,ArrayList<Integer> b){
        a++;
        b.set(0,2);
    }
}
