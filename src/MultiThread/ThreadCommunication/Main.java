package MultiThread.ThreadCommunication;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();
        Producer poducer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread t1 = new Thread(poducer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Main Thread End");
    }
}
