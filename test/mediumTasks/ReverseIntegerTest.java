package mediumTasks;

import dw.mediumTasks.ReverseInteger;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();
    @Test
    public void solution() {
        int x = 123;
        int expected = 321;
        assertEquals(expected, reverseInteger.solution(x));

        x = -123;
        expected = -321;
        assertEquals(expected, reverseInteger.solution(x));

        x = -20100;
        expected = -102;
        assertEquals(expected, reverseInteger.solution(x));

        x = 2147483647; //max int
        expected = 0; //expected overflow, so return 0
        assertEquals(expected, reverseInteger.solution(x));
    }
}