package easyTasks;

import dw.ListNode;
import dw.easyTasks.MergeTwoSortedListsSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsSolutionTest {
    @Test
    void solution() {
        ListNode list1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        list1.next = node2;
        node2.next = node3;

        ListNode list2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        list2.next = node4;
        node4.next = node5;
        MergeTwoSortedListsSolution solution = new MergeTwoSortedListsSolution();
        ListNode result = solution.solution(list1, list2);
        while (result != null) {
            System.out.print(result.val + ", ");
            result = result.next;
        }
    }

}