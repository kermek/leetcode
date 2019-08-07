package recursion.principle.reverselinkedlist206;

public class SolutionRecursive {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode tail = getTail(newHead);
        head.next = null;
        tail.next = head;
        return newHead;
    }

    private static ListNode getTail(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        return getTail(node.next);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        SolutionRecursive solutionRecursive = new SolutionRecursive();
        solutionRecursive.reverseList(head);

    }
}
