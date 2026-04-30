class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int maxProfit = 0;
        for(int buy = 0; buy < prices.length - 1; buy++){
            for(int sell = buy + 1 ; sell < prices.length; sell++){
                profit = prices[sell] - prices[buy];
                maxProfit = (profit > maxProfit) ? profit : maxProfit;
            }
        }
      return maxProfit;  
    }
}
