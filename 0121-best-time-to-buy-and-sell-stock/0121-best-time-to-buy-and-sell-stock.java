class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0]; 
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i]; 
            } else if (prices[i] > sell) {
                sell = prices[i];
            }
            int currentProfit = sell - buy;
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }
        return profit;
    }
}
