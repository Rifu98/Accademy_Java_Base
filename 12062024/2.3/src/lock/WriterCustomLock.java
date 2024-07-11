package lock;

import data.Data;

public class WriterCustomLock implements Runnable {
    private ReadWriteLockCustom lock;
    private Data data;
    private int value;

    public WriterCustomLock(ReadWriteLockCustom lock, Data data, int value) {
        this.lock = lock;
        this.data = data;
        this.value = value;
    }

    @Override
    public void run() {
        try {
            lock.acquireWriteLock();
            data.setValue(value);
            System.out.println("Scrittore (custom) ha scritto: " + value);
            Thread.sleep(2000); // Simula il tempo di scrittura
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.releaseWriteLock();
        }
    }
}