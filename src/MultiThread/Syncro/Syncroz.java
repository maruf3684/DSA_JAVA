package MultiThread.Syncro;

public class Syncroz {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thrd thrd1 = new Thrd(counter);
        Thrd thrd2 = new Thrd(counter);

        thrd1.start();
        thrd2.start();

        thrd1.join();
        thrd2.join();

        System.out.println(counter.getCount());
    }
}
