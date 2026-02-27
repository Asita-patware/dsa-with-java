import java.util.Scanner;

public class A2_SpiralMatrix {

    // Method to print the elements of a 2D matrix in spiral order
    public static void printSpiralMatrix(int matrix[][]){

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;


        while (startRow <= endRow && startCol <= endCol) {

            // top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom row
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {    // single row left
                    break;
                }
               System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if (startCol == endCol) {    // single column left
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }


            // move to inner layer
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][4];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // Print the original matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print the matrix in spiral order
        System.out.println("Spiral Order:");
        printSpiralMatrix(matrix);

        sc.close();
    }
}
