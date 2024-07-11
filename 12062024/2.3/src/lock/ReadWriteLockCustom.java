package lock;

public class ReadWriteLockCustom {
    private int readers = 0;
    private boolean writing = false;

    public synchronized void acquireReadLock() throws InterruptedException {
        while (writing) {
            wait();
        }
        readers++;
    }

    public synchronized void releaseReadLock() {
        readers--;
        if (readers == 0) {
            notifyAll();
        }
    }

    public synchronized void acquireWriteLock() throws InterruptedException {
        while (readers != 0) {
            wait();
        }
        writing = true;
    }

    public synchronized void releaseWriteLock() {
        writing = false;
        notifyAll();
    }
}