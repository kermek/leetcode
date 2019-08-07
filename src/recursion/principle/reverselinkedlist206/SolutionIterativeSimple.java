package recursion.principle.reverselinkedlist206;

public class SolutionIterativeSimple {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        SolutionIterativeSimple solutionRecursive = new SolutionIterativeSimple();
        solutionRecursive.reverseList(head);

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
