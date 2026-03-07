public class A3_CheckPowerOfTwo {


    // Method to Check if a given number is a power of 2
    public static boolean isPowerOfTwo(int n){
        if(n <= 0) return false;  // power of 2 must be positive
        return (n & (n-1)) == 0;  // removes the lowest set bit
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8)); // true
        System.out.println(isPowerOfTwo(15)); // false

    }
}
