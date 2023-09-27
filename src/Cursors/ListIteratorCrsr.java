package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorCrsr {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("munna");
        arr.add("shohan");
        arr.add("razzak");

        ListIterator i = arr.listIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("....................");

        while (i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}
