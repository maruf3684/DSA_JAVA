package MultiThread.Basic.runnable;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread 1");
        Thread t1 = new Thread(runnableDemo1);

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread 2");
        Thread t2 = new Thread(runnableDemo2);

        t1.start();
        t2.start();
    }
}
