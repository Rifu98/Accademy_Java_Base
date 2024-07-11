package runnable;

import buffer.Buffer;

public class Consumatore implements Runnable {
    private Buffer buffer;

    public Consumatore(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int dato = buffer.consuma();
                System.out.println("Buffer size: " + buffer.size());
                Thread.sleep(2000); // Simuliamo il consumo di un dato
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}