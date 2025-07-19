package MultiThread.Basic.extend;

public class Main {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Thread-1",true);
        ThreadDemo t2 = new ThreadDemo("Thread-2",false);

        t1.start();
        t2.start();
    }
}
