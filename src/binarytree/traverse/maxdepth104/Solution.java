package binarytree.traverse.maxdepth104;

import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1;
  }

  public static void main(String[] args) {
    //
    //                    3
    //                   / \
    //                  /   \
    //                 /     \
    //                /       \
    //               9         20
    //                       /  \
    //                     15    7
    //

    TreeNode root = new TreeNode(3);
    {
      root.left = new TreeNode(9);
      root.right = new TreeNode(20);
      {
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
      }
    }

    Solution solution = new Solution();
    int depth = solution.maxDepth(root);
    System.out.println(depth);
  }
}