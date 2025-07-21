package MultiThread.ReadWriteLock;

public class ReadWorker extends Thread{
    private final Work work;
    public ReadWorker (String name,Work work){
        super(name);
        this.work = work;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            work.getCount();
        }
    }
}
