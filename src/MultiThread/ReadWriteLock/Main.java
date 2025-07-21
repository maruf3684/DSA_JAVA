package MultiThread.ReadWriteLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Work work = new Work();
        WriteWorker t1 = new WriteWorker("T1",work);
        //WriteWorker t2 = new WriteWorker("T2",work);

        ReadWorker r1 = new ReadWorker("R1",work);
        ReadWorker r2 = new ReadWorker("R2",work);

        t1.start();
        //t2.start();
        r1.start();
        r2.start();

        t1.join();
        //t2.join();
        r1.join();
        r2.join();
        System.out.println("Main thread end");
    }
}
