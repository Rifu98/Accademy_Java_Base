package main;

import exceptions.*;
import mezziDiTrasporto.*;

public class Main {
    public static void main(String[] args) {

        try {
            Transport busErr = new Bus();
            busErr.setSpeed(-60);
            busErr.start();
            System.out.println("Costo del Bus per 100Km: " + busErr.calculateCost(100));
            busErr.stop();
        } catch (InvalidSpeedException | InvalidDistanceException e) {
            System.err.println("Errore: " + e.getMessage());
        }
        
        try {
            Transport bus = new Bus();
            bus.setSpeed(60);
            bus.start();
            System.out.println("Costo del Bus per 100Km: " + bus.calculateCost(100));
            bus.stop();

            Transport train = new Train();
            train.setSpeed(120);
            train.start();
            System.out.println("Costo del Treno per 100Km: " + train.calculateCost(100));
            train.stop();

            Transport airplane = new Airplane();
            airplane.setSpeed(600);
            airplane.start();
            System.out.println("Costo dell'Aereo per 100Km: " + airplane.calculateCost(100));
            airplane.stop();
        } catch (InvalidSpeedException | InvalidDistanceException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
