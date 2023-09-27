package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCrsr {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("munna");
        arr.add("shohan");
        arr.add("razzak");

        Iterator i = arr.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
