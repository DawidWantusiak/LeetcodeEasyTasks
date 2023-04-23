import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraySolutionTest {
    public MergeSortedArraySolution solution = new MergeSortedArraySolution();
    @Test
    void merge() {
        int[] numbersA, numbersB, expectedResult;
        numbersA = new int[]{1,2,3,0,0,0};
        numbersB = new int[]{2,5,6};
        expectedResult = new int[]{1,2,2,3,5,6};
        solution.merge(numbersA, 3, numbersB, 3);
        assertArrayEquals(expectedResult, numbersA);

        numbersA = new int[]{0};
        numbersB = new int[]{1};
        expectedResult = new int[]{1};
        solution.merge(numbersA, 0, numbersB, 1);
        assertArrayEquals(expectedResult, numbersA);

//        numbersA = new int[]{1,2,3,0,0,0};
//        numbersB = new int[]{2,5,6};
//        expectedResult = new int[]{1,2,2,3,5,6};
//        solution.merge(numbersA, 3, numbersB, 3);
//        assertArrayEquals(expectedResult, numbersA);
    }
}