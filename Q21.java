package Nullpoint;
import java.util.Arrays;

public class Q21 {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        System.out.println("Matrix Addition:");
        try {
            int[][] additionResult = addMatrices(matrix1, matrix2);
            printMatrix(additionResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error during addition: " + e.getMessage());
        }

        System.out.println("Matrix Multiplication:");
        try {
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            printMatrix(multiplicationResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error during multiplication: " + e.getMessage());
        }

        System.out.println("Matrix Transpose:");
        try {
            int[][] transposeResult = transposeMatrix(matrix1);
            printMatrix(transposeResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error during transpose: " + e.getMessage());
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Number of columns in matrix1 must be equal to the number of rows in matrix2 for multiplication.");
        }

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
