import java.util.Scanner;
public class A3_MaxSubarraySumKadane {

    // Kadane’s Algorithm: finds maximum subarray sum (0 if all negative)
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static void maxSubArraySumKadane(int numbers[]) {
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE; 

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];

            // If currSum becomes negative, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }

            // Update maxSum if currSum is larger
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max Subarray Sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArraySumKadane(numbers);
    }

}
