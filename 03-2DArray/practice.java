import java.lang.reflect.Method;
import java.util.SortedMap;

public class practice {


    // Method to count occurrences of a key in a 2D array
    public static int search(int array[][] , int key){
        int count = 0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if (array[i][j] == key) {
                count++;
                }   
            }
        }
        return count;
    }


    // Method to find the sum of elements in the second row
    public static int secondRowSum(int[][] nums){
        int sum = 0;
        int row = 1;    // second row (0-based index)

            for(int j=0; j<nums[0].length; j++){
                    sum += nums[row][j];
            }
        return sum;
    }


    // Method to print the transpose of a matrix
    public static void transposeOfMatrix(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Transpose logic (swap rows and columns)
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose matrix
        System.out.println("Transpose of the matrix :");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }
       

    public static void main(String[] args) {


        int[][] array = {{4,7,8},
                         {8,8,7}};

        System.out.println(search(array, 7));


        int[][] nums = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        System.out.println(secondRowSum(nums));

        
        int[][] matrix = {{1,2,3},
                         {4,5,6}};

        transposeOfMatrix(matrix);

    }
}
