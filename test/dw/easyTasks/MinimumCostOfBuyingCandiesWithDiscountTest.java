package dw.easyTasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumCostOfBuyingCandiesWithDiscountTest {

    MinimumCostOfBuyingCandiesWithDiscount solution = new MinimumCostOfBuyingCandiesWithDiscount();
    @Test
    public void minimumCost() {
        int[] arr = {6, 5, 7, 9, 2, 2};
        int expectedAnswer = 23;
        assertEquals(expectedAnswer, solution.minimumCost(arr));
    }
}