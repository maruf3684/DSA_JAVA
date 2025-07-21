package MultiThread.ReadWriteLock;

public class WriteWorker extends Thread {
    private final Work work;

    WriteWorker(String name, Work work) {
        super(name);
        this.work = work;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" - Thread is running");
        for (int i = 0; i < 50; i++) {
            work.increment();
        }
    }
}
