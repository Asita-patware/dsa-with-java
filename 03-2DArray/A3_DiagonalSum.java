import java.util.Scanner;

public class A3_DiagonalSum {

    // Method to calculate diagonal sum using nested loops (O(n^2))
    public static int DiagonalSumBruteForce(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secondary diagonal
                else if (i + j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    // Optimized method to calculate diagonal sum using a single loop (O(n))
    public static int DiagonalSumOptimized(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Add primary diagonal element
            // Add secondary diagonal element if it's not the same as primary (center in odd-sized matrix)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] matrix = new int[4][4];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Calculate and print diagonal sums
        System.out.println("Diagonal sum (Brute Force): " + DiagonalSumBruteForce(matrix));
        System.out.println("Diagonal sum (Optimized): " + DiagonalSumOptimized(matrix));
    }
}