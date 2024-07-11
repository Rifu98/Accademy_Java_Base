package buffer;

import java.util.LinkedList;

public class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produci(int dato) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Il buffer è pieno, il produttore aspetta
        }
        buffer.add(dato);
        System.out.println("Prodotto: " + dato);
        notifyAll(); // Risveglia tutti i thread in attesa (potenziali consumatori)
    }

    public synchronized int consuma() throws InterruptedException {
        while (buffer.size() == 0) {
            wait(); // Il buffer è vuoto, il consumatore aspetta
        }
        int dato = buffer.removeFirst();
        System.out.println("Consumato: " + dato);
        notifyAll(); // Risveglia tutti i thread in attesa (potenziali produttori)
        return dato;
    }

	public int size() {
		return this.buffer.size();
	}
}
