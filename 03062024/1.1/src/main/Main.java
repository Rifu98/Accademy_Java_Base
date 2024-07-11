package main;

public class Main {

	public static void main(String[] args) {

        // 1. Divisione tra due interi
        int a = 5;
        int b = 3;
        double r1 = (double) a / b;  // Uso double per conservare la parte decimale
        System.out.println("Risultato della divisione: " + r1);

        // 2. Moltiplicazione tra un char e uno short
        char c = 'a';
        short s = 5000;
        int r2 = c * s;  // Uso int perché char e short vengono promossi a int in espressioni aritmetiche
        System.out.println("Risultato della moltiplicazione: " + r2);

        // 3. Somma tra un int e un float
        int i = 6;
        float f = 3.14F;
        float r3 = i + f;  // Uso float perché la somma di int e float risulta in float
        System.out.println("Risultato della somma: " + r3);

        // 4. Sottrazione tra r1, r2 e r3
        double r4 = r1 - r2 - r3;  // Uso double per conservare la precisione
        System.out.println("Risultato della sottrazione: " + r4);

	}

}
