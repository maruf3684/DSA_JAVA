package MultiThread.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Work {
    public Integer count = 0;

    public final ReadWriteLock lock = new ReentrantReadWriteLock();

    Lock readLock = lock.readLock();
    Lock writeLock = lock.writeLock();


    public void increment(){
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" - write lock aquire the lock");
            //Thread.sleep(1000);
            count++;
            System.out.println(Thread.currentThread().getName()+" - write value :" + count);
        } finally {
            writeLock.unlock();
        }
    }

    public Integer getCount(){
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" - Thread is running and Read Value is: " + count);
            return count;
        }finally {
            readLock.unlock();
        }
    }
}
