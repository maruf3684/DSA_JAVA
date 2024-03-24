package Advanced.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindEvenFromStream {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> evenNumbers = numbers.filter(val->val%2==0);
        evenNumbers.forEach(FindEvenFromStream::print);

        //System.out.println(Arrays.toString(evenNumbers.toArray()));
    }

    public static void print( Integer val){
        System.out.println(val);
    }
}
