package main;

import runnable.*;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1());
        Thread thread2 = new Thread(new MyRunnable2());

        thread2.start(); // Avvia prima il Thread 2
        try {
            thread2.join(); // Attendi che il Thread 2 completi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread1.start();
        try {
            thread1.join(); // Attendi che il Thread 1 completi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Il programma è terminato.");
    }

}
