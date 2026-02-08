import java.util.Scanner;
public class A5_ReverseAnArray {

    public static void reverseAnArray(int numbers[]) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // Move pointers towards center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {3, 5, 7, 9, 11, 17};

        reverseAnArray(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
