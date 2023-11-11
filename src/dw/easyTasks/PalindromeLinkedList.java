package dw.easyTasks;

import dw.ListNode;

/*
Problem 234. Palindrome Linked List: https://leetcode.com/problems/palindrome-linked-list/description/

Given the head of a singly linked list,
return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

Follow up: Could you do it in O(n) time and O(1) space?
*/
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;

        var allValues = new StringBuilder();
        var node = head;
        while (node.next != null) {
            allValues.append(node.val);
            node = node.next;
        }
        allValues.append(node.val);

        int middle = allValues.length() / 2;
        String firstHalf = allValues.substring(0, middle);
        String secondHalf = allValues.reverse().substring(0, middle);
        return firstHalf.equals(secondHalf);
    }
}
