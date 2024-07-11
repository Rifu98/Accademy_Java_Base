package main;

import exceptions.HotelException;
import hotel.*;

public class Main {
    public static void main(String[] args) {
        try {
            PrenotazioneHotel cameraStandard = new CameraStandard(5);
            PrenotazioneHotel suite = new Suite(3);

            try {
                cameraStandard.prenotaCamera("Mario");
                cameraStandard.prenotaCamera("Luigi");
            } catch (HotelException e) {
                System.err.println("Errore: " + e.getMessage());
            }

            try {
                suite.prenotaCamera("Giovanni");
                suite.prenotaCamera("Paolo");
                suite.prenotaCamera("Anna");
            } catch (HotelException e) {
                System.err.println("Errore: " + e.getMessage());
            }

            System.out.println("Stato camera standard: " + cameraStandard);
            System.out.println("Stato suite: " + suite);

            try {
                cameraStandard.cancellaCamera("Mario");
            } catch (HotelException e) {
                System.err.println("Errore: " + e.getMessage());
            }

            try {
                suite.cancellaCamera("Paolo");
            } catch (HotelException e) {
                System.err.println("Errore: " + e.getMessage());
            }
            try {
                cameraStandard.cancellaCamera("Pippo");
            } catch (HotelException e) {
                System.err.println("Errore: " + e.getMessage());
            }

            System.out.println("Stato camera standard dopo cancellazione: " + cameraStandard);
            System.out.println("Stato suite dopo cancellazione: " + suite);
        } catch (Exception e) {
            System.err.println("Errore generale: " + e.getMessage());
        }
    }
}
