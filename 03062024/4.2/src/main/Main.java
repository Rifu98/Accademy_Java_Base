package main;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {
            {34, 12, 76, 89},
            {45, 23, 11, 67},
            {78, 54, 31, 21},
            {56, 90, 43, 65}
        };

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {0, 5, 6, 7},
            {0, 0, 8, 9},
            {0, 0, 0, 10}
        };

        int[][] matrix3 = {
            {11, 0, 0, 0},
            {21, 12, 0, 0},
            {31, 22, 13, 0},
            {41, 32, 23, 14}
        };

        int[][] matrix4 = {
            {67, 33, 78, 54},
            {22, 89, 45, 11},
            {76, 88, 99, 23},
            {31, 66, 77, 90}
        };

        System.out.println("La matrice 1 è triangolare superiore: " + isUpperTriangular(matrix1));
        System.out.println("La matrice 2 è triangolare superiore: " + isUpperTriangular(matrix2));
        System.out.println("La matrice 3 è triangolare superiore: " + isUpperTriangular(matrix3));
        System.out.println("La matrice 4 è triangolare superiore: " + isUpperTriangular(matrix4));
    }

    public static boolean isUpperTriangular(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

}