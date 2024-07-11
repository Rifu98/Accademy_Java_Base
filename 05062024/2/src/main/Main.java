package main;

import veicoli.*;

public class Main {

    public static void main(String[] args) {
    	
        Veicolo[] veicoli = new Veicolo[3];
        
        veicoli[0] = new Vettura("AB123CD", "Fiat", "Panda", "utilitaria");
        veicoli[1] = new Motociclo("XY456ZT", "Yamaha", "XJ6", 600);
        veicoli[2] = new Vettura("EF789GH", "BMW", "X5", "SUV");

        // Simula alcuni veicoli guasti
        veicoli[0].setGuasto(true);
        veicoli[2].setGuasto(true);

        System.out.println("Veicoli guasti:");
        
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getGuasto()) {
                System.out.println(veicolo.getTarga());
            }
        }
    }
}
