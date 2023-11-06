package dw.easyTasks;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReformatDateTest {
    ReformatDate solution = new ReformatDate();
    @Test
    public void reformatDate() {
        String date = "20th Oct 2052";
        String expected = "2052-10-20";
        assertEquals(expected, solution.reformatDate(date));

        date = "6th Jun 1933";
        expected = "1933-06-06";
        assertEquals(expected, solution.reformatDate(date));

        date = "26th May 1960";
        expected = "1960-05-26";
        assertEquals(expected, solution.reformatDate(date));
    }
}