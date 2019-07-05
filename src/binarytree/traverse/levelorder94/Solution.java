package binarytree.traverse.levelorder94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode terminator = new TreeNode(0);
        queue.add(root);
        queue.add(terminator);
        boolean isLevelFinished = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == terminator) {
                if (row.isEmpty()) {
                    break;
                }
                list.add(row);
                isLevelFinished = true;
                row = new ArrayList<>();
            } else if (node != null) {
                row.add(node.val);
            }
            if (node != null && node.left != null) {
                queue.add(node.left);
            }
            if (node != null && node.right != null) {
                queue.add(node.right);
            }
            if (isLevelFinished) {
                queue.add(terminator);
                isLevelFinished = false;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode child1 = new TreeNode(9);
        root.left = child1;
        TreeNode child2 = new TreeNode(20);
        root.right = child2;
        TreeNode child3 = new TreeNode(15);
        child2.left = child3;
        TreeNode child4 = new TreeNode(7);
        child2.right = child4;

        Solution solution = new Solution();
        List list = solution.levelOrder(root);
        System.out.println(Arrays.toString(list.toArray()));
    }
}