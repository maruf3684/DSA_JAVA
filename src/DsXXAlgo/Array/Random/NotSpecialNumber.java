package DsXXAlgo.Array.Random;

public class NotSpecialNumber {
    public static void main(String[] args) {
        System.out.println(nonSpecialCount(4,16));
    }

    public static int nonSpecialCount(int l, int r) {
        int count = 0;
        for (int i = l; i <=r ; i++) {
            if(i != Math.floor(i)){
                continue;
            }
            double item = Math.sqrt(i);
            if (!isPrime(item)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(double num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Eliminate multiples of 2 and 3
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // Check divisibility by i and i + 2
            }
        }
        return true;
    }
}
