public class A5_FastExponentiation {

    // Method to perform fast exponentiation using binary exponentiation
    public static int fastExpo(int a, int n){
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // if current bit of exponent is 1
                ans = ans * a;
            }
            a = a * a;  // square the base
            n = n >> 1;   // move to next bit of exponent
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(fastExpo(3, 5)); // 243
        
    }
}
