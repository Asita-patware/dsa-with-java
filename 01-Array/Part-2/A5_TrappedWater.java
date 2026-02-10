import java.util.Scanner;
public class A5_TrappedWater {

    // Method to calculate trapped rain water
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int trappedRainWater(int height[]) {

        int n = height.length;

        // 1. Calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // 2. Calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        } 

        // 3. Loop to calculate trapped water
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            // Water level = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water at index i = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rain Water = " + trappedRainWater(height));
    }
}
