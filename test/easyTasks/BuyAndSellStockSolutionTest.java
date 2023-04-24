package easyTasks;

import easyTasks.BuyAndSellStockSolution;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockSolutionTest {
    public BuyAndSellStockSolution solution = new BuyAndSellStockSolution();

    @Test
    void maxProfit() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int expectedResult = 5;
        int result = solution.maxProfit(prices);
        assertEquals(expectedResult, result);

        //test for the edge case prices.length = 10^5
        prices = generateIntArray(10_000, 1_000);
        long startTime = System.currentTimeMillis();
        result = solution.maxProfit(prices);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(elapsedTime + " ms");
    }

    private int[] generateIntArray(int size, int maxValue){
        Random random = new Random();
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++){
            output[i] = random.nextInt(0, maxValue+1);
        }
        return output;
    }
}