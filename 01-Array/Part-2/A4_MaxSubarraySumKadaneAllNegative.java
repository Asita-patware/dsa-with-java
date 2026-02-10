import java.util.Scanner;
public class A4_MaxSubarraySumKadaneAllNegative {

    // Kadane's Algorithm that handles all-negative arrays
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static void maxSubArraySumKadaneAllNegative(int numbers[]) {
        int currSum = numbers[0];
        int maxSum = numbers[0];

        // Iterate from second element
        for (int i = 1; i < numbers.length; i++) {

           // Start new subarray or extend current
            currSum = Math.max(numbers[i], currSum + numbers[i]);

            // Update overall max sum
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        // Example with negative numbers
        int numbers[] = {-2, -3, -1, -5};

        // Example with mixed numbers
        int numbers2[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("All-negative array example:");
        maxSubArraySumKadaneAllNegative(numbers);

        System.out.println("\nMixed array example:");
        maxSubArraySumKadaneAllNegative(numbers2);
    }
}
