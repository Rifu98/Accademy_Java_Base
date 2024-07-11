package main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(201) - 100;  // Numeri casuali tra -100 e 100
        }

        int target = 50;  // Numero da cercare
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Indice del primo elemento corrispondente: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Numero non presente nell'array");
        }

	}

}
