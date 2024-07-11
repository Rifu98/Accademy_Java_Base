package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(fattoriale(n));
    }

    public static int fattoriale(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fattoriale(n - 1);
    }
}