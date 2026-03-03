public class A4_SubString {


    // Method to extract substring
    public static String subString(String str, int si, int ei) {
        String substr = ""; // stores result substring

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i); // add each character to substring
        }

        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        // Custom substring method
        System.out.println(subString(str, 0, 5)); // Hello

        // Inbuilt substring method
        System.out.println(str.substring(0, 5)); // Hello
    }
}