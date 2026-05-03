class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int cur;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            while (r < prices.length - 1 && prices[r] < prices[l]) {
                l = r;
                r++;
            }
            cur = prices[r] - prices[l];
            if (cur > max)
                max = cur;
            r++;
        }
        return max;
    }
}
