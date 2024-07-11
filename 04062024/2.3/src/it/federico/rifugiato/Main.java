package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        String s = "alloro";
        char c = '-';
        
        System.out.println(inserisciCarattere(s, c));
        System.out.println(inserisciCarattereRicorsivo(s, c));
    }

    public static String inserisciCarattere(String s, char c) {
        StringBuilder risultato = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            risultato.append(s.charAt(i));
            if (i < s.length() - 1) {
                risultato.append(c);
            }
        }
        return risultato.toString();
    }

    public static String inserisciCarattereRicorsivo(String s, char c) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(0) + String.valueOf(c) + inserisciCarattereRicorsivo(s.substring(1), c);
    }
}