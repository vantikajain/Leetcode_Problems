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
    
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp ;
        if(root==null){
            return root;
        }
    
            temp = root.right;
            root.right=root.left;
            root.left= temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        
    }
    
}