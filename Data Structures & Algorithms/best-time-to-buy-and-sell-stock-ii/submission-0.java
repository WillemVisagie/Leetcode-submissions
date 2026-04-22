class Solution {
    public int maxProfit(int[] prices) {
        int balance = 0;
        int i = 0;
        // while (i < prices.length) {
            while (i + 1 < prices.length) {
                if (prices[i + 1] > prices[i]) {
                    balance -= prices[i];
                    i++;
                    balance += prices[i];
                } else {
                    i++;
                }
            // }
            // i++;
        }
        return balance;
    }
}