package easyTasks;

import easyTasks.ExcelSheetColumnTitleSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleSolutionTest {

    ExcelSheetColumnTitleSolution solution = new ExcelSheetColumnTitleSolution();
    int columnNumber;
    String expectedResult;
    @Test
    void convertToTitle() {
        columnNumber = 5;
        expectedResult = "E";
        assertEquals(expectedResult, solution.convertToTitle(columnNumber));

        columnNumber = 26;
        expectedResult = "Z";
        assertEquals(expectedResult, solution.convertToTitle(columnNumber));

        columnNumber = 700;
        expectedResult = "ZX";
        assertEquals(expectedResult, solution.convertToTitle(columnNumber));

        columnNumber = 2000;
        expectedResult = "BXX";
        assertEquals(expectedResult, solution.convertToTitle(columnNumber));
    }
}