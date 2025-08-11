package MultiThread.ThreadCommunication;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        try {
            while (true) {
                buffer.produce(i++);
                Thread.sleep(100); // simulate delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
