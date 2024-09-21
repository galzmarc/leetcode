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

 public class LevelOrder {
  public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> frontier = new LinkedList<>();
    frontier.add(root);

    while (!frontier.isEmpty()) {
      int levelSize = frontier.size();
      List<Integer> currentLevel = new ArrayList<>();

      for (int i = 0; i < levelSize; i++) {
        TreeNode current = frontier.poll();
        currentLevel.add(current.val);

        if (current.left != null) {
          frontier.add(current.left);
        }
  
        if (current.right != null) {
          frontier.add(current.right);
        }
      }
      result.add(currentLevel);
    }
    return result;
  }
}
