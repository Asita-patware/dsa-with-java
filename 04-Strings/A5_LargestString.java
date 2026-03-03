public class A5_LargestString {

    public static void main(String[] args) {
        String fruits[] = {"Apple", "Mango", "banana"};

        // Finds largest string (case-sensitive)
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        // Finds largest string (ignore case)
        String largestIgnoreCase = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largestIgnoreCase.compareToIgnoreCase(fruits[i]) < 0) {
                largestIgnoreCase = fruits[i];
            }
        }

        System.out.println(largest); // banana (Uppercase < lowercase)
        System.out.println(largestIgnoreCase); // Mango 
    }
}