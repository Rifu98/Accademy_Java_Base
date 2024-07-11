package runnable;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000); // intervallo di 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}