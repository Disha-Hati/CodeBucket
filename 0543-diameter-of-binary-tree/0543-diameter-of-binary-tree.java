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
   private int diam = 0;  // Use an instance variable to store the diameter
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  // Calculate height and update diameter
        return diam;   // Return the diameter
    }
    
    private int height(TreeNode root) {
        if (root == null) return 0;  // Base case
        
        int left = height(root.left);   // Recursively get the height of the left subtree
        int right = height(root.right); // Recursively get the height of the right subtree
        
        // Update the diameter if the path through the root is larger
        diam = Math.max(diam, left + right);
        
        // Return the height of the tree
        return 1 + Math.max(left, right);
    }
    
}