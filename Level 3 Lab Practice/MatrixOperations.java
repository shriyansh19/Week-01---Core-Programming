import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random integers from 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
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

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
                        - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
                        + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
        return determinant;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example Usage
        System.out.print("Enter the number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int cols = scanner.nextInt();

        // Creating two random matrices
        int[][] matrix1 = createMatrix(rows, cols);
        int[][] matrix2 = createMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Addition
        System.out.println("Addition of Matrices:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication
        if (cols == rows) { // Ensure multiplication is possible
            System.out.println("Multiplication of Matrices:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible for the given dimensions.");
        }

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        // Determinant (only for 2x2 and 3x3 matrices)
        if (rows == 2 && cols == 2) {
            System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2(matrix1));
        } else if (rows == 3 && cols == 3) {
            System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(matrix1));
        } else {
            System.out.println("Determinant can only be calculated for 2x2 or 3x3 matrices.");
        }

        scanner.close();
    }
}
