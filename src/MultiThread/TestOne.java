package MultiThread;

public class TestOne extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        TestOne t = new TestOne();
        t.start();
    }
}
