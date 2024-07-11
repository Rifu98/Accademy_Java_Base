package main;

public class Main {
	
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        
        long result = 50000L + 10 * (b + s + i);
        System.out.println("Risultato: " + result);
    }

}
