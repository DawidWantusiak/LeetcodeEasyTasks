package dw.easyTasks;
/*
Task 21
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list.
The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/
import dw.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsSolution {
    //this solution is far from optimal
    public ListNode solution(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        List<Integer> allNums = new ArrayList<>();
        ListNode node = list1;
        while (node != null) {
            allNums.add(node.val);
            node = node.next;
        }
        node = list2;
        while (node != null) {
            allNums.add(node.val);
            node = node.next;
        }
        Collections.sort(allNums);
        List<ListNode> allNodes = new ArrayList<>();
        ListNode head = new ListNode(allNums.get(0));
        allNodes.add(head);
        for (int i = 1; i < allNums.size(); i++) {
            ListNode listNode = new ListNode(allNums.get(i));
            allNodes.get(i - 1).next = listNode;
            allNodes.add(listNode);
        }
        return head;
    }
}













