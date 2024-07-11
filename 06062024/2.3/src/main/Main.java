package main;

import hotel.*;

public class Main {
    public static void main(String[] args) {
        PrenotazioneHotel cameraStandard = new CameraStandard(5);
        PrenotazioneHotel suite = new Suite(3);

        cameraStandard.prenotaCamera("Mario");
        cameraStandard.prenotaCamera("Luigi");
        suite.prenotaCamera("Giovanni");
        suite.prenotaCamera("Paolo");
        suite.prenotaCamera("Anna");

        System.out.println("Stato camera standard: " + cameraStandard);
        System.out.println("Stato suite: " + suite);

        cameraStandard.cancellaCamera("Mario");
        suite.cancellaCamera("Paolo");

        System.out.println("Stato camera standard dopo cancellazione: " + cameraStandard);
        System.out.println("Stato suite dopo cancellazione: " + suite);
    }
}
