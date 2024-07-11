package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import data.Data;

public class ReaderReentrantLock implements Runnable {
    private ReadWriteLockReentrantLock lock;
    private final Lock lockAttesa;
    private Data data;

    public ReaderReentrantLock(ReadWriteLockReentrantLock lock, Data data) {
    	lockAttesa = new ReentrantLock();
        this.lock = lock;
        this.data = data;
    }

    @Override
    public void run() {
        try {
        	lockAttesa.lock();
            lock.acquireReadLock();
            int value = data.getValue();
            Thread.sleep(3000); // Simula il tempo di lettura
            System.out.println("Lettore ha letto: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.releaseReadLock();
        	lockAttesa.unlock();
        }
    }
}