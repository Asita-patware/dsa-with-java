import java.util.Scanner;
public class A7_Subarrays {

    // Prints all subarrays and counts total subarrays
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static void printSubarrays(int numbers[]) {
        int totalSubarray = 0;

        // Outer loop: selects starting index
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

             // Middle loop: selects ending index
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                // Print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }

                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: " + totalSubarray);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
