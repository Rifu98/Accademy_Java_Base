package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println(somma(array, array.length));
    }

    public static int somma(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        return array[n-1] + somma(array, n-1);
    }
}