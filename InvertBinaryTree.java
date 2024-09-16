import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {

    if (root == null) return null;

    Queue<TreeNode> frontier = new LinkedList<>();
    frontier.add(root);

    while (!frontier.isEmpty()) {

      TreeNode current = frontier.poll();
      // Add left child node
      if (current.left != null) {
        frontier.add(current.left);
      }
      // Add right child node
      if (current.right != null) {
        frontier.add(current.right);
      }
      // Swap left and right nodes
      TreeNode temp = current.left;
      current.left = current.right;
      current.right = temp;
      
    }
    return root;
  }
}
