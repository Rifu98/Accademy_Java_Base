package main;

import banca.*;
import exceptions.InvalidValueException;

public class Main {
    public static void main(String[] args) {
        try {
            ContoCorrenteInteressiSemplici cc1 = new ContoCorrenteInteressiSemplici(1000, 5, 30);

            System.out.println("Somma corrente con interessi semplici: " + cc1.sommaCorrente());
        } catch (InvalidValueException e) {
            System.err.println("Errore: " + e.getMessage());
        }
        try {
            ContoCorrenteInteressiComposti cc2 = new ContoCorrenteInteressiComposti(1000, 5, 30);

            System.out.println("Somma corrente con interessi composti: " + cc2.sommaCorrente());
        } catch (InvalidValueException e) {
            System.err.println("Errore: " + e.getMessage());
        }
        try {
            ContoCorrenteInteressiComposti cc3 = new ContoCorrenteInteressiComposti(-1000, -5, -30);

            System.out.println("Somma corrente con interessi composti: " + cc3.sommaCorrente());
        } catch (InvalidValueException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}