package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cittadini.*;
import seggio.Seggio;
import util.Voto;

public class Main {
    public static void main(String[] args) {
        List<Cittadino> cittadini = new ArrayList<>();
        Random rand = new Random();

        // Creazione dei cittadini
        for (int i = 0; i < 100; i++) {
            int eta = rand.nextInt(40); // Età casuale tra 0 e 39
            if (eta < 21) {
                cittadini.add(new Cittadino());
            } else {
                cittadini.add(new CittadinoSenato());
            }
        }

        // Assegnazione dei voti casuali
        for (Cittadino cittadino : cittadini) {
            Voto votoCamera = Voto.values()[rand.nextInt(Voto.values().length)];
            cittadino.setVotoCamera(votoCamera);
            if (cittadino instanceof CittadinoSenato) {
                Voto votoSenato = Voto.values()[rand.nextInt(Voto.values().length)];
                ((CittadinoSenato) cittadino).setVotoSenato(votoSenato);
            }
        }

        // Creazione del seggio
        Seggio seggio = new Seggio(cittadini);

        // Ottenere e stampare i voti alla Camera
        int[] votiCamera = seggio.getVotiCamera();
        System.out.println("Voti alla Camera:");
        System.out.println("SINISTRA: " + votiCamera[0]);
        System.out.println("CENTRO: " + votiCamera[1]);
        System.out.println("DESTRA: " + votiCamera[2]);
        System.out.println("NULLO: " + votiCamera[3]);

        // Ottenere e stampare i voti al Senato
        int[] votiSenato = seggio.getVotiSenato();
        System.out.println("\nVoti al Senato:");
        System.out.println("SINISTRA: " + votiSenato[0]);
        System.out.println("CENTRO: " + votiSenato[1]);
        System.out.println("DESTRA: " + votiSenato[2]);
        System.out.println("NULLO: " + votiSenato[3]);
    }
}
