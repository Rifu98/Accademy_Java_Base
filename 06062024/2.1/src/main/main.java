package main;

import java.util.ArrayList;
import java.util.List;
import forme.*;

public class main {

    public static void main(String[] args) {
    	
        List<Forma> forme = new ArrayList<>();
        
        forme.add(new Triangolo(3, 4, 5));
        forme.add(new Quadrato(2));
        forme.add(new Rettangolo(2, 3));
        forme.add(new Cerchio(2));

        for (Forma forma : forme) {
            System.out.println("Perimetro: " + forma.calcolaPerimetro());
            System.out.println("Area: " + forma.calcolaArea());
        }
    }

}
