import java.util.Scanner;

public class A1_StringIntro {

    
    // Method to print each character of a String
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        // Two different ways of creating String
        String str = "Asita";                 // Using String literal
        String str2 = new String("xyz");      // Using new keyword

        // Strings are immutable

        Scanner sc = new Scanner(System.in);


        // Two methods for taking String input:
        // 1. next()      -> reads a single word (stops at space)
        // 2. nextLine()  -> reads the complete line (including spaces)

        System.out.println("Enter a full line:");
        String name = sc.nextLine();   // Reads full line

        System.out.println("Enter a single word:");
        String name1 = sc.next();      // Reads one word

        System.out.println("nextLine() output: " + name);
        System.out.println("next() output: " + name1);

        // String length
        String fullName = "Asita patware";
        System.out.println("Length: " + fullName.length());  // Length - 13  
        // length() returns the total number of characters in the string, including spaces 

        // Concatenation
        String firstName = "asita";
        String lastName = "patware";

        String fullName1 = firstName + " " + lastName;   // Joins first and last name with a space
        System.out.println(fullName1);
        System.out.println(fullName1.charAt(0));    // Get character at specified index

        // Print each character of String
        printLetter(str);

        // String literal (stored in String pool)
        String s1 = "Tony";
        String s2 = "Tony";

        // String object (stored in heap)
        String s3 = new String("Tony");

        // Compares reference (memory address)
        System.out.println(s1 == s2); // true

        // Compares reference (different memory)
        System.out.println(s1 == s3); // false

        // Compares actual content of strings
        System.out.println(s1.equals(s3)); //true

        sc.close();
    }
}
