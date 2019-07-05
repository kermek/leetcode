package binarytree.traverse.inorder94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class SolutionIterative {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }

    public static void main(String[] args) {
        //
        //                    6
        //                   / \
        //                  /   \
        //                 /     \
        //                /       \
        //               2         7
        //              /  \        \
        //             1    4        8
        //                 / \      /
        //                3   5    9
        //

        TreeNode root = new TreeNode(6);
        {
            root.left = new TreeNode(2);
            {
                root.left.left = new TreeNode(1);
                root.left.right = new TreeNode(4);
                {
                    root.left.right.left = new TreeNode(3);
                    root.left.right.right = new TreeNode(5);
                }
            }
            root.right = new TreeNode(7);
            {
                root.right.right = new TreeNode(8);
                {
                    root.right.right.left = new TreeNode(9);
                }
            }
        }

        SolutionIterative solution = new SolutionIterative();
        List list = solution.inorderTraversal(root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}