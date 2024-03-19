// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, sum = 0;
        for(int i=1; i<n; i++) {
            int val = prices[i]-prices[i-1];
            if(val > 0) sum += val;
        }
        return sum;
    }
}
