import java.util.Scanner;
public class A3_LargestAndSmallestInArray {

    // Find largest number in array
    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Find smallest number in array
    public static int smallestNumber(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 4, 2, 6, 9, 6};

        System.out.println("Largest number is: " + largestNumber(numbers));
        System.out.println("Smallest number is: " + smallestNumber(numbers));
    }
}
