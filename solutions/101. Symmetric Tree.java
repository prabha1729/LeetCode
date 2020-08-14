/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // TreeNode other = root;
    public boolean isSymmetric(TreeNode root) {
        TreeNode other =root;
        return isSymmetric(root,other);
    }
    private boolean isSymmetric(TreeNode root,TreeNode other){
        if(root==null && other==null) return true;
        if(root==null || other==null) return false;
        boolean flag = (root.val==other.val);
        // System.out.println(flag);
        return (flag)
            &&isSymmetric(root.right,other.left)
            &&isSymmetric(root.left,other.right);
    }
}
