package MultiThread.ThreadCommunication;

public class Buffer {
    private int data;
    private boolean isEmpty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (isEmpty == false) {
            wait();
        }

        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (isEmpty == true) {
            wait();
        }
        isEmpty = true;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}