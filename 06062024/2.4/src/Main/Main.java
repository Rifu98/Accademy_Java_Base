package Main;

import voli.*;

public class Main {
    public static void main(String[] args) {
        PrenotazioneVolo economy = new ClasseEconomy(100);
        PrenotazioneVolo business = new ClasseBusiness(20);
       

        economy.prenotaBiglietto("Mario");        
        economy.prenotaBiglietto("Luigi");        
        business.prenotaBiglietto("Giovanni");
        business.prenotaBiglietto("Paolo");
        business.prenotaBiglietto("Anna");

        System.out.println("Stato classe economy: " + economy);
        System.out.println("Stato classe business: " + business);

        economy.cancellaBiglietto("Mario");
        business.cancellaBiglietto("Paolo");

        System.out.println("Stato classe economy dopo cancellazione: " + economy);
        System.out.println("Stato classe business dopo cancellazione: " + business);
    }
}
