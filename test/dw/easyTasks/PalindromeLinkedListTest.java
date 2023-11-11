package dw.easyTasks;

import dw.ListNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeLinkedListTest {
    @Test
    public void isPalindrome() {
        int[] values = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        ListNode node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            node = new ListNode(values[i], node);
        }
        assertTrue(PalindromeLinkedList.isPalindrome(node));

        values = new int[] {1, 2, 3, 4, 4, 3, 2, 1};
        node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            node = new ListNode(values[i], node);
        }
        assertTrue(PalindromeLinkedList.isPalindrome(node));

        values = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            node = new ListNode(values[i], node);
        }
        assertFalse(PalindromeLinkedList.isPalindrome(node));
    }
}