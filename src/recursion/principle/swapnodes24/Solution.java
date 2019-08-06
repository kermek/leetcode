package recursion.principle.swapnodes24;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution solution = new Solution();
        solution.swapPairs(head);

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail;
        if (head.next.next != null) {
             tail = swapPairs(head.next.next);
        } else {
            tail = null;
        }
        ListNode temp = head;
        head = head.next;
        head.next = temp;
        head.next.next = tail;
        return head;
    }
}