package DsXXAlgo.String;

public class Compare {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);       // false
        System.out.println(str1.equals(str2));  // true

    }
}
