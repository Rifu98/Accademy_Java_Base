package lock;

import data.Data;

public class ReaderCustomLock implements Runnable {
    private ReadWriteLockCustom lock;
    private Data data;

    public ReaderCustomLock(ReadWriteLockCustom lock, Data data) {
        this.lock = lock;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            lock.acquireReadLock();
            int value = data.getValue();
            System.out.println("Lettore (custom) ha letto: " + value);
            Thread.sleep(500); // Simula il tempo di lettura
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.releaseReadLock();
        }
    }
}