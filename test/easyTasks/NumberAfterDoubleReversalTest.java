package easyTasks;

import dw.easyTasks.NumberAfterDoubleReversal;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class NumberAfterDoubleReversalTest {
    NumberAfterDoubleReversal solution = new NumberAfterDoubleReversal();
    @Test
    public void isSameAfterReversals() {
        HashMap<Integer, Boolean> tests = new HashMap<>();
        tests.put(123, true);
        tests.put(111, true);
        tests.put(5, true);
        tests.put(99099, true);
        tests.put(9870, false);
        tests.forEach((key, value) -> {
            assertEquals(solution.isSameAfterReversals(key), value);
        });
    }
}