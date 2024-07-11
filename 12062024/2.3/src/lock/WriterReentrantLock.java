package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import data.Data;

public class WriterReentrantLock implements Runnable {
    private ReadWriteLockReentrantLock lock;
    private final Lock lockAttesa;
    private Data data;
    private int value;

    public WriterReentrantLock(ReadWriteLockReentrantLock lock, Data data, int value) {
    	lockAttesa = new ReentrantLock();
        this.lock = lock;
        this.data = data;
        this.value = value;
    }

    @Override
    public void run() {
        try {
        	lockAttesa.lock();
            lock.acquireWriteLock();
            data.setValue(value);
            Thread.sleep(3000); // Simula il tempo di lettura
            System.out.println("Scrittore ha scritto: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.releaseWriteLock();
        	lockAttesa.unlock();
        }
    }
}