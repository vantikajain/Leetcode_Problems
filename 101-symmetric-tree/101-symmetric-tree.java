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
    
    public static boolean isSame(TreeNode left,TreeNode right){
         if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
            
        }
        if(left.val==right.val){
            return isSame(left.left,right.right)&&isSame(left.right,right.left) ;
        }
     return false;
    
}
    public boolean isSymmetric(TreeNode root) {
        
        return isSame(root.left,root.right);
    }
    
    
}
    
