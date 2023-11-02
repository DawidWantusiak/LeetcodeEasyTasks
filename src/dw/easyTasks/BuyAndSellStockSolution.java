package dw.easyTasks;/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:
1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
*/

public class BuyAndSellStockSolution {
    public int maxProfit(int[] prices) {
        //let's iterate from the end, where first sell price is prices[prices.length-1]
        //then traverse the array from buy price at prices[sellIndex-1] to the left, checking the profits for each buy-sell pair
        //if the profit is larger than the current largest profit, store this profit
        //at the end, return the most recently stored profit - it's the largest one
        /*
        if (prices.length < 2)
            return 0;

        int largestProfit = 0;
        for (int sellIndex = prices.length-1; sellIndex > 0; sellIndex--){
            for (int buyIndex = sellIndex-1; buyIndex >= 0; buyIndex--){
                int profit = prices[sellIndex] - prices[buyIndex];
                if (profit > largestProfit)
                    largestProfit = profit;
            }
        }
        return largestProfit;
        */
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
