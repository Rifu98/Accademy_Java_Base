package main;

public class Main {

	public static void main(String[] args) {
        int[] arr = {34, 67, 12, 89, 23, 76, 45, 54, 31, 78};
        
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        
        double average = (double) sum / arr.length;
        
        System.out.println("Valore massimo: " + max);
        System.out.println("Valore minimo: " + min);
        System.out.println("Somma: " + sum);
        System.out.println("Media: " + average);
	}

}
