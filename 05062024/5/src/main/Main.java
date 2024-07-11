package main;

import banca.*;

public class Main {
    public static void main(String[] args) {
        ContoCorrente cc1 = new ContoCorrenteInteressiSemplici(1000, 5, 30);
        ContoCorrente cc2 = new ContoCorrenteInteressiComposti(1000, 5, 30);

        System.out.println("Somma corrente con interessi semplici: " + cc1.sommaCorrente());
        System.out.println("Somma corrente con interessi composti: " + cc2.sommaCorrente());
    }
}
