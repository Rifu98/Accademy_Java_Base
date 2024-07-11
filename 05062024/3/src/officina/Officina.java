package officina;

import java.util.Random;
import veicoli.*;

public class Officina {
    public double ripara(Veicolo veicolo) {
    	
        Random rand = new Random();
        double costo = 0.0;
        
        if (veicolo.getGuasto()) {
            if (veicolo instanceof Vettura) {
                costo = rand.nextDouble(100,200);
            } else if (veicolo instanceof Motociclo) {
                costo = rand.nextDouble(50,100);
            }
            
            veicolo.setGuasto(false);
        } else {
            if (veicolo instanceof Vettura) {
                costo = rand.nextDouble(25,50);
            } else if (veicolo instanceof Motociclo) {
                costo = rand.nextDouble(0,25);
            }
        }
        
        return costo;
    }
}