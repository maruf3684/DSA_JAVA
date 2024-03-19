package MultiThread;

public class TestTwo implements Runnable{

    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        TestTwo t = new TestTwo();
        Thread th = new Thread(t);
        th.start();
    }
}
