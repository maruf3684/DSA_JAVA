package MultiThread.Basic.extend;

public class ThreadDemo extends Thread{
    String name;
    Boolean sleep;
    public ThreadDemo(String name, Boolean sleep) {
        this.name = name;
        this.sleep = sleep;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (sleep) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name + " " + i);;
        }
    }
}
