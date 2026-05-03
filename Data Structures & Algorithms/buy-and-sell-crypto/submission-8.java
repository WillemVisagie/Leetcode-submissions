class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int cur;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                cur = prices[j] - prices[i];
                if (cur > max) max = cur;
            }
        }
        return max;
        }
}
