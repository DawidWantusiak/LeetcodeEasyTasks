package easyTasks;

import dw.easyTasks.ReverseBitsSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsSolutionTest {
    ReverseBitsSolution solution = new ReverseBitsSolution();
    @Test
    void reverseBits() {
        int n = 43261596;
        int expectedResult = 964176192;
        assertEquals(expectedResult, solution.reverseBits(n));
    }
}