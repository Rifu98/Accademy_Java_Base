package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReadWriteLockReentrantLock {
    private final Lock lock = new ReentrantLock();
    private int readers = 0;
    private int writers = 0;

    public void acquireReadLock() throws InterruptedException {
    	try {
	        while (writers != 0) {
	            System.out.println("Sto aspettando: ci sono " + writers + " scrittori");
	            lock.wait();
	        }
    	} finally {
            System.out.println("Ci sono " + writers + " scrittori, Quindi inizio a Leggere");
	        lock.lock();
            readers++;
            System.out.println("Lettori attuali: " + readers);
            System.out.println("Scrittori attuali: " + writers);
    	}
    }

    public void releaseReadLock() {
    	try {
    		while (readers == 0) {
	            lock.notifyAll(); 
	        }
    	} finally {
            System.out.println("Ho finito di leggere");
            readers--;
            System.out.println("Lettori attuali: " + readers);
            System.out.println("Scrittori attuali: " + writers);
	        lock.unlock();
    	}
    }

    public void acquireWriteLock() throws InterruptedException {
    	try {
	        while (readers != 0) {
	            System.out.println("Sto aspettando: ci sono " + this.readers + " lettori");
	            lock.wait(); 
	        }
    	} finally {
            System.out.println("Ci sono " + readers + " lettori, Quindi inizio a Scrivere");
	        lock.lock();
            writers++;
            System.out.println("Lettori attuali: " + readers);
            System.out.println("Scrittori attuali: " + writers);
    	}
    }

    public void releaseWriteLock() {
    	try {
    		while (writers == 0) {
	            lock.notifyAll(); 
	        }
    	} finally {
            System.out.println("Ho finito di scrivere");
            writers--;
            System.out.println("Lettori attuali: " + readers);
            System.out.println("Scrittori attuali: " + writers);
            lock.unlock();
    	}
    }
}