package it.federico.rifugiato;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};
        
        System.out.println(sommaBidimensionale(array, 0, 0));
    }

    public static int sommaBidimensionale(int[][] array, int i, int j) {
        if (i == array.length) {
            return 0;
        }
        if (j == array[i].length) {
            return sommaBidimensionale(array, i + 1, 0);
        }
        return array[i][j] + sommaBidimensionale(array, i, j + 1);
    }
}
