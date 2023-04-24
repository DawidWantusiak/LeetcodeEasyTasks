package easyTasks;

import easyTasks.SqrtOfXSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtOfXSolutionTest {
    SqrtOfXSolution solution = new SqrtOfXSolution();

    @Test
    void mySqrt() {
        System.out.println(solution.mySqrt(35));
        assertEquals(5, solution.mySqrt(35));
        System.out.println(solution.mySqrt(16));
        assertEquals(4, solution.mySqrt(16));
        System.out.println(solution.mySqrt(14));
        assertEquals(3, solution.mySqrt(14));
        System.out.println(solution.mySqrt(81));
        assertEquals(9, solution.mySqrt(81));
    }
}