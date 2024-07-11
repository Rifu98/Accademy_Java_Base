package main;

import veicoli.*;
import officina.*;

public class main {
    public static void main(String[] args) {
        Veicolo[] veicoli = {
            new Vettura("AB123CD", "Fiat", "Panda", "utilitaria"),
            new Motociclo("XY987ZT", "Honda", "CBR", 125),
            new Vettura("EF456GH", "BMW", "X5", "SUV"),
            new Motociclo("UV654WX", "Yamaha", "MT-07", 700)
        };

        // Alcuni veicoli diventano guasti
        veicoli[0].setGuasto(true);
        veicoli[1].setGuasto(true);

        System.out.println("Lista dei veicoli guasti:");
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getGuasto()) {
                System.out.println("Veicolo targa: " + veicolo.getTarga());
            }
        }

        Officina officina = new Officina();

        for (Veicolo veicolo : veicoli) {
            double prezzo = officina.ripara(veicolo);
            System.out.println("Veicolo targa: " + veicolo.getTarga() + ", costo riparazione: " + prezzo);
        }

        System.out.println("Lista dei veicoli guasti:");
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getGuasto()) {
                System.out.println("Veicolo targa: " + veicolo.getTarga());
            }
        }
    }

}
