package main;

public class Main {

	public static void main(String[] args) {
        int sommaPari = 0;
        int sommaDispari = 0;

        for (int num = 1; num <= 50; num++) {
            if (num % 2 == 0) {
                sommaPari += num * num;
            } else {
                sommaDispari += num * num * num;
            }
        }

        System.out.println("Somma dei quadrati dei numeri pari: " + sommaPari);
        System.out.println("Somma dei cubi dei numeri dispari: " + sommaDispari);

        if (sommaPari > sommaDispari) {
            System.out.println("I numeri pari hanno una somma maggiore.");
        } else if (sommaDispari > sommaPari) {
            System.out.println("I numeri dispari hanno una somma maggiore.");
        } else {
            System.out.println("Le somme sono uguali.");
        }
	}

}