package dw.easyTasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixDiagonalSumTest {
    MatrixDiagonalSum solution = new MatrixDiagonalSum();
    @Test
    public void diagonalSum() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expectedSum = 25;
        assertEquals(solution.diagonalSum(matrix), expectedSum);
    }
}