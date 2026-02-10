import java.util.Scanner;

public class A1_MaxSubarraySumBruteForce {

    // Brute force method to find maximum subarray sum
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    public static void maxSubArraySumBruteForce(int numbers[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        // Loop for starting index
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            // Loop for ending index
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;

                // Calculate sum of subarray from start to end
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }

                System.out.println("Subarray (" + start + "," + end + ") = " + currSum);

                // Update maximum sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySumBruteForce(numbers);
    }
}
