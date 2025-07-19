package MultiThread.ThreadMethods;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (long j = 0; j < 10000000000L; j++) {
                Integer a = 10;
            }
            System.out.println(Thread.currentThread().getName()+" is running for = "+i + " Priority "+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread("Thread-1");
        MyThread myThread2 = new MyThread("Thread-2");
        MyThread myThread3 = new MyThread("Thread-3");

        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.NORM_PRIORITY);
        myThread3.setPriority(Thread.MIN_PRIORITY);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        System.out.println("I am main thread");
    }
}
