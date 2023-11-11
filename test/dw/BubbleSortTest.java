package dw;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    public void sort() {
        int[] arr = {3, 1, 5, 6, 4, 2, 7, 9, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr, expected);
    }
}