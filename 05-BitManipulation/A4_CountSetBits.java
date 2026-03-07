public class A4_CountSetBits {

    // Method to count number of set bits (1s) in a number
    public static int countSetBits(int n){
        int count = 0;
        
        while (n > 0) {
            if ((n & 1) != 0) { // check if last bit is 1
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    
    public static void main(String[] args) {

        System.out.println(countSetBits(15)); // 4
        System.out.println(countSetBits(16)); // 1

    }
}
