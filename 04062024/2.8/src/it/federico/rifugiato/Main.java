package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(fibonacciProcedurale(n));
        System.out.println(fibonacciRicorsivo(n));
    }

    public static int fibonacciProcedurale(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacciRicorsivo(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacciRicorsivo(n - 1) + fibonacciRicorsivo(n - 2);
    }
}