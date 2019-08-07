package recursion.principle.reverselinkedlist206;

import java.util.Stack;

public class SolutionIterative {
    Stack<ListNode> stack = new Stack<>();

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        SolutionIterative solutionRecursive = new SolutionIterative();
        solutionRecursive.reverseList(head);

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode node = head;
        while (!stack.isEmpty()) {
            ListNode temp = stack.pop();
            node.next = temp;
            node = temp;
        }
        node.next = null;
        return head;
    }
}
