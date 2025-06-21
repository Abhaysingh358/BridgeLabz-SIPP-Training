package Methods;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperation {

    static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // values 0 to 9
        return matrix;
    }

    static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    static void displayMatrix(int[][] matrix, String title) {
        System.out.println(title);
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of Matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();
        System.out.print("Enter rows and columns of Matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();

        int[][] A = createRandomMatrix(rowsA, colsA);
        int[][] B = createRandomMatrix(rowsB, colsB);

        displayMatrix(A, "Matrix A:");
        displayMatrix(B, "Matrix B:");

        if (rowsA == rowsB && colsA == colsB) {
            displayMatrix(addMatrices(A, B), "Addition (A + B):");
            displayMatrix(subtractMatrices(A, B), "Subtraction (A - B):");
        } else {
            System.out.println("Addition/Subtraction not possible (different dimensions).\n");
        }

        if (colsA == rowsB) {
            displayMatrix(multiplyMatrices(A, B), "Multiplication (A * B):");
        } else {
            System.out.println("Multiplication not possible (A.cols != B.rows).\n");
        }
    }
}
