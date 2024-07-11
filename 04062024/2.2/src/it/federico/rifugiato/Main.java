package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        String testo = "Esempio";
        
        System.out.println(sottostringa(testo));
    }

    public static String sottostringa(String testo) {
        if (testo.length() < 3) {
            return testo;
        } else {
            return testo.substring(0, 3);
        }
    }
}