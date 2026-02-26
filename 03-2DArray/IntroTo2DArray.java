import java.util.Scanner;

public class IntroTo2DArray {

    // Method to search a key in the matrix
    public static boolean search(int matrix[][] , int key){
         for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++) {     
                if (matrix[i][j] == key) {
                    System.out.println("Element found at cell (" + i + "," + j + ")" );
                    return true;
                }
            }             
        }
        System.out.println("Key not found");
        return false;
    }

    // Method to find the largest element in the matrix
    public static int largestInMatrix(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++){
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    // Method to find the smallest element in the matrix
    public static int smallestInMatrix(int[][] matrix) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    // Method to calculate sum of all elements in the matrix
    public static int sumOfMatrix(int matrix[][]){
        int sum = 0 ;
        for (int i = 0; i < matrix.length; i++) {          
            for (int j = 0; j < matrix[0].length; j++){
              sum += matrix[i][j];
            }
        }
        return sum;
    }


     public static void main(String[] args) {

        // Creation of 2D array
        int[][] matrix = new int[3][3];

        int rows = matrix.length;        // number of rows
        int cols = matrix[0].length;     // number of columns

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter " + (rows * cols) + " elements of the matrix:");
        for (int i = 0; i < rows; i++) {         
            for (int j = 0; j < cols; j++) {      
                matrix[i][j] = sc.nextInt();    
            }
        }

        // Printing the matrix -- Output
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {          
            for (int j = 0; j < cols; j++) {     
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();                
        }

        // Input key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        search(matrix, key);

        // Print largest, smallest and sum
        System.out.println("Largest element: " + largestInMatrix(matrix));
        System.out.println("Smallest element: " + smallestInMatrix(matrix));
        System.out.println("Sum of elements: " + sumOfMatrix(matrix));

        sc.close();
    }
}
