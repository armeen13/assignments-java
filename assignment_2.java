import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N): ");
        int n = scanner.nextInt();
        // Initializing
        int[][] matrix = new int[n][n];
        int mainDiagonalSum = 0;
        int reverseDiagonalSum = 0;

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEntered Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculating
        System.out.println("\n--- Sums ---");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];

                colSum += matrix[j][i];
            }
            System.out.println("Sum of elements in Row " + i + ": " + rowSum);
            System.out.println("Sum of elements in Column " + i + ": " + colSum);
        }

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            reverseDiagonalSum += matrix[i][n - 1 - i]; 
        }

        // showing
        System.out.println("\nSum of all main diagonal elements: " + mainDiagonalSum);
        System.out.println("Sum of all reverse diagonal elements: " + reverseDiagonalSum);

        scanner.close();
    }
}
