package MultiThread.ThreadCommunication;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(200); // simulate delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
