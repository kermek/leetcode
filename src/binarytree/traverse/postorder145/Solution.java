package binarytree.traverse.postorder145;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        root.right = child1;
        TreeNode child2 = new TreeNode(3);
        child1.left = child2;

        Solution solution = new Solution();
        List list = solution.postorderTraversal(root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}