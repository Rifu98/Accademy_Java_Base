package runnable;

import buffer.Buffer;

public class Produttore implements Runnable {
    private Buffer buffer;

    public Produttore(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produci(i);
                System.out.println("Buffer size: " + buffer.size());
                Thread.sleep(1000); // Simuliamo la produzione di un dato
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}