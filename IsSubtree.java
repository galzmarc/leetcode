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

public class IsSubtree {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {

    if (subRoot == null) return true;
    if (root == null) return false;

    Queue<TreeNode> frontier = new LinkedList<>();
    frontier.add(root);
    
    while (!frontier.isEmpty()) {
      TreeNode current = frontier.poll();
      
      if (current.val == subRoot.val) {
        if (isSameTree(current, subRoot)) return true;
      }

      if (current.left != null) {
        frontier.add(current.left);
      }
      if (current.right != null) {
        frontier.add(current.right);
      }
    }
    return false;
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null || p.val != q.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
