class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // track min price
        int maxProfit = 0;                 // track max profit
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;           // new min (better buy day)
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // new best profit
            }
        }
        return maxProfit;
    }
}
