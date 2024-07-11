package main;

import data.Data;
import lock.*;

public class Main {
    public static void main(String[] args) {
        ReadWriteLockReentrantLock lock1 = new ReadWriteLockReentrantLock();
        Data data1 = new Data();

        Thread reader11 = new Thread(new ReaderReentrantLock(lock1, data1));
        Thread reader12 = new Thread(new ReaderReentrantLock(lock1, data1));
        Thread writer1 = new Thread(new WriterReentrantLock(lock1, data1, 10));

        reader11.setPriority(Thread.MAX_PRIORITY);
        reader12.setPriority(Thread.MIN_PRIORITY);
        writer1.setPriority(Thread.MIN_PRIORITY);
        
        reader11.start();
        reader12.start();
        writer1.start();

//        ReadWriteLockCustom lock2 = new ReadWriteLockCustom();
//        Data data2 = new Data();
//
//        Thread writer2 = new Thread(new WriterCustomLock(lock2, data2, 20));
//        Thread reader21 = new Thread(new ReaderCustomLock(lock2, data2));
//        Thread reader22 = new Thread(new ReaderCustomLock(lock2, data2));
//        
//        reader21.setPriority(Thread.MAX_PRIORITY);
//        reader22.setPriority(Thread.MIN_PRIORITY);
//
//        writer2.start();
//        reader21.start();
//        reader22.start();
    }
}
