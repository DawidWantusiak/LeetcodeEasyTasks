import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberSolutionTest {

    SingleNumberSolution solution = new SingleNumberSolution();
    @Test
    void singleNumber() {
        int[] testNums;
        int expectedResult;

        testNums = new int[]{1, 2, 3, 2, 1};
        expectedResult = 3;
        assertEquals(expectedResult, solution.singleNumber(testNums));

        testNums = new int[]{4,1,2,1,2};
        expectedResult = 4;
        assertEquals(expectedResult, solution.singleNumber(testNums));

        testNums = new int[]{2,2,1};
        expectedResult = 1;
        assertEquals(expectedResult, solution.singleNumber(testNums));

        testNums = new int[]{2,2,8,4,5,6,7,6,7,4,5};
        expectedResult = 8;
        assertEquals(expectedResult, solution.singleNumber(testNums));
    }
}