import java.util.Scanner;
public class A4_BinarySearch {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            // Calculate middle index
            int mid = start + (end - start) / 2;

            if (numbers[mid] == key) { // If key is found at mid
                return mid;
            } else if (numbers[mid] > key) { // If key is smaller, search in left half
                end = mid - 1;
            } else { // If key is greater, search in right half
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int key = 8;

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
