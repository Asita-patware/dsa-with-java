import java.util.Scanner; 
public class A2_LinearSearch {

    // Linear search for integer array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;     // return index if found
            }
        }
        return -1;      // if not found
    }

    // Linear search for String array (returns int index)
    public static int linearSearch_Rt_Int(String menu1[], String key1) {
        for (int i = 0; i < menu1.length; i++) {
            if (menu1[i].equals(key1)) {
                return i;
            }
        }
        return -1;
    }

    // Linear search for String array (returns String index)
    public static String linearSearch_Rt_String(String menu2[], String key2) {
        for (int i = 0; i < menu2.length; i++) {
            if (menu2[i].equals(key2)) {
                return String.valueOf(i); // convert int → String
            }
        }
        return "-1";
    }

    public static void main(String[] args) {

        // Linear Search (int array)
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        // Linear Search (String array → int return)
        String menu1[] = {"dosa", "chole", "samosa"};
        String key1 = "samosa";

        int index1 = linearSearch_Rt_Int(menu1, key1);
        if (index1 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index1);
        }

        // Linear Search (String array → String return)
        String menu2[] = {"dosa", "chole", "samosa"};
        String key2 = "samosa";

        String index2 = linearSearch_Rt_String(menu2, key2);
        if (index2.equals("-1")) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index2);
        }
    }
}