package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 8, 1};
        
        System.out.println(minimo(array, array.length));
    }

    public static int minimo(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.min(array[n-1], minimo(array, n-1));
    }
}