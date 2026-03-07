public class A1_BitManipulationBasics {

    // Method to Checks whether a number is odd or even using bitwise AND with 1
    public static void oddOrEven(int n){
        int bitMask = 1;
        if (( n & bitMask) == 0) {
            // even number
            System.out.println("Even Number");
        }else{
            // odd number
            System.out.println("Odd Number");
        }
    }

    // Method to demonstrate basic bitwise operations like AND, OR, XOR, NOT, left shift, and right shift
    public static void demonstrateBitOperations() {

        int a = 5;   // Binary: 0101
        int b = 6;   // Binary: 0110

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a & b  (AND)  : " + (a & b));
        System.out.println("a | b  (OR)   : " + (a | b));
        System.out.println("a ^ b  (XOR)  : " + (a ^ b));
        System.out.println("~a     (NOT)  : " + (~a));
        System.out.println("a << 2 (Left Shift) : " + (a << 2));
        System.out.println("b >> 1 (Right Shift): " + (b >> 1));
    }

    public static void main(String[] args) {
        demonstrateBitOperations();

        // Check odd or even numbers
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);

    }
}
