package dw.easyTasks;

import java.util.*;

/*
Task 2144. Minimum Cost of Buying Candies With Discount

The description is too long, I'll just drop the link to this problem:
https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/

Example 2:
Input: cost = [6,5,7,9,2,2]
Output: 23
Explanation: The way in which we can get the minimum cost is described below:
- Buy candies with costs 9 and 7
- Take the candy with cost 6 for free
- We buy candies with costs 5 and 2
- Take the last remaining candy with cost 2 for free
Hence, the minimum cost to buy all candies is 9 + 7 + 5 + 2 = 23.
*/
public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        final Deque<Integer> orderedPrices = new ArrayDeque<>();
        for (int c : cost) {
            orderedPrices.add(c);
        }

        int answer = 0;
        int i = 1;
        while (!orderedPrices.isEmpty()) {
            int price = orderedPrices.pollLast();
            if (i % 3 != 0)
                answer += price;
            i++;
        }

        return answer;
    }
}










