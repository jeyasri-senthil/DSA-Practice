// Problem Link: https://www.codingninjas.com/studio/problems/best-time-to-buy-and-sell-stock_6194560
// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeToBuyAndSell {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int min = prices[0], maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int cost =  prices[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
