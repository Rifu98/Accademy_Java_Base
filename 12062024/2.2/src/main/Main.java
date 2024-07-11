package main;

import buffer.Buffer;
import runnable.Consumatore;
import runnable.Produttore;

public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Creiamo un buffer con una capacità di 5 elementi

        Thread produttore = new Thread(new Produttore(buffer));
        Thread consumatore = new Thread(new Consumatore(buffer));

        produttore.start();
        consumatore.start();
    }
}
