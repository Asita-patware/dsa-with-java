public class A2_CheckPalindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input){
    int n = input.length();
    for(int i = 0; i < n / 2; i++){
        if (input.charAt(i) != input.charAt(n - 1 - i)) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {

        String input = "racecar";
        System.out.println(isPalindrome(input));
    }
}
