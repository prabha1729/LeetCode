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
    // public boolean isValidBST(TreeNode root) {
    //    return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    // }
    // private boolean isValidBST(TreeNode root,long min,long max){
    //     if(root==null) return true;
    //     long value = root.val;
    //     if(value < min || value > max) return false;
    //     return  isValidBST(root.left,min,value-1)&&isValidBST(root.right,value+1,max);     
    // }
     public boolean isValidBST(TreeNode root) {
       return isValidBST(root,null,null);
    }
    private boolean isValidBST(TreeNode root,Integer min,Integer max){
        if(root==null) return true;
        int value = root.val;
        if(((min!=null)&& value <= min) || ((max!=null) && value >= max)) return false;
        return  isValidBST(root.left,min,value)&&isValidBST(root.right,value,max);     
    }
}
