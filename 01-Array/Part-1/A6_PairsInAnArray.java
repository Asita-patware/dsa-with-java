import java.util.Scanner;
public class A6_PairsInAnArray {

    // Prints all pairs in an array and counts total pairs
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void pairsInAnArray(int numbers[]) {
        int totalPair = 0;

        // Outer loop selects the first element
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            // Inner loop selects the second element
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                totalPair++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs: " + totalPair); // n(n-1)/2
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairsInAnArray(numbers);
    }

}
