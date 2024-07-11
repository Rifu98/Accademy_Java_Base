package runnable;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(2000); // intervallo di 2 secondi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}