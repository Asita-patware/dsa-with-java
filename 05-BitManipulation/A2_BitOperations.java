public class A2_BitOperations {


    // Method to get the value of the ith bit (0 or 1)
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;

        if ((n & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }


    // Method to set the ith bit (make it 1)
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }


    // Method to clear the ith bit (make it 0)
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }


    // Method to update the ith bit with newBit (0 or 1)
    public static int updateIthBit(int n, int i, int newBit){
        
        /* 
        // If newBit = 0 → clear ith bit, if newBit = 1 → set ith bit (alternative conditional approach)
        if (newBit == 0) {
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
        */
        
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }


    // Method to clear last i bits
    public static int clearLastIBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }


    // Method to clear bits from position i to j (inclusive)
    public static int clearRangeOfBits(int n, int i, int j){
        int a =(~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }


    public static void main(String[] args) {
        
        
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10,2, 1));
        System.out.println(clearLastIBit(15,2));
        System.out.println(clearRangeOfBits(10,2, 4));




    }
    
}