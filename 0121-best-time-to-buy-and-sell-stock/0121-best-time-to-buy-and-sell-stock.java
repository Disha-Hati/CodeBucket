class Solution {
    public int maxProfit(int[] prices) {
        int minBuy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            
            profit=Math.max(profit,prices[i]-minBuy);
            minBuy=Math.min(minBuy,prices[i]);
        }
        return profit;
    }
}