package MultiThread.Syncro;

public class Thrd extends Thread {
    private Counter counter;

    public Thrd(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
