import java.util.Scanner;
public class A2_MaxSubarraySumPrefixSum {

    // Prefix sum method to find maximum subarray sum
    // Time complexity: O(n^2) → two nested loops
    // Space complexity: O(n) → extra prefix array
    public static void maxSubArraySumPrefix(int numbers[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        // Build prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Loop for starting index
        for (int start = 0; start < numbers.length; start++) {
            
            // Loop for ending index
            for (int end = start; end < numbers.length; end++) {
                
                // Subarray sum using prefix array
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                // Update maxSum if needed
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubArraySumPrefix(numbers);
    }
}
