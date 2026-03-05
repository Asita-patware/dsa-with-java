package String;

import java.util.Arrays;
import java.util.Scanner;

public class A8_StringProblems {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String firstString, String secondString) {

        if (firstString == null || secondString == null) {
            return false;
        }

        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (firstString.length() != secondString.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] firstArray = firstString.toCharArray();
        char[] secondArray = secondString.toCharArray();

        // Sort both character arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Compare sorted arrays
        return Arrays.equals(firstArray, secondArray);
    }

    // Method to count lowercase vowels in a string
    public static void countLowercaseVowels(String inputString) {
        int vowelCount = 0;

        // Traverse through each character
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check for lowercase vowels
            if (currentChar == 'a' || currentChar == 'e' ||
                currentChar == 'i' || currentChar == 'o' ||
                currentChar == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Lowercase vowel count: " + vowelCount);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Input string from user to count lowercase vowels
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        countLowercaseVowels(userInput);

        // 2. String comparison using equals()
        String text1 = "DataStructures";
        String text2 = "Algorithms";
        String text3 = "DataStructures";

        System.out.println(text1.equals(text2) + " " + text1.equals(text3));

        // 3. Removing character 'm' from a string
        String modifiedString = "JavaProgramming".replace("m", "");
        System.out.println(modifiedString);

        // 4. Anagram check
        String word1 = "race";
        String word2 = "care";

        System.out.println(isAnagram(word1, word2));

        scanner.close();
    }
}