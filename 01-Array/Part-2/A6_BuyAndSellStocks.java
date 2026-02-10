public class A6_BuyAndSellStocks {

    // Method to calculate maximum profit from stock prices
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int buyAndSellStocks(int prices[]){
        
        int buyPrice = Integer.MAX_VALUE; // Minimum price to buy
        int maxProfit = 0;             

        for(int i = 0; i < prices.length; i++){
            // If current price is higher than buying price → profit possible
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // Today's profit
                maxProfit = Math.max(maxProfit, profit); // Update max profit
            } 
            // Update buy price if lower price found
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit = " + buyAndSellStocks(prices));
    }
}
