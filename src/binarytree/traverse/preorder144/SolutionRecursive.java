package binarytree.traverse.preorder144;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionRecursive {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        root.right = child1;
        TreeNode child2 = new TreeNode(3);
        child1.left = child2;

        SolutionRecursive solution = new SolutionRecursive();
        List list = solution.preorderTraversal(root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}