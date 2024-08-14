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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !stack.isEmpty()) {
            // Go to the leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Peek the node on the top of the stack
            curr = stack.peek();

            // If the right subtree is not yet processed, go to the right
            if (curr.right != null && curr.right != lastVisited) {
                curr = curr.right;
            } else {
                // If the right subtree is already processed or there's no right subtree
                stack.pop();
                ans.add(curr.val);
                lastVisited = curr;
                curr = null; // Mark the node as processed
            }
        }

        return ans;

    }
}