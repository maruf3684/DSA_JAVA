package MultiThread.lambdaThread;

public class Main {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(r1);

        Thread t2 = new Thread(()->System.out.println(Thread.currentThread().getName()));

        t1.start();
        t2.start();
    }
}
