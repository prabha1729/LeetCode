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
    //##22/68 passed
     public TreeNode invertTree(TreeNode root) {
         if(root==null) return root;
           TreeNode temp = null;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
         invertTree(root.left);
         invertTree(root.right);
         return root;
    }
    private TreeNode swapLeftRight(TreeNode root) {
        if(root==null) return root;
            TreeNode temp = null;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        return root;
    }
    
    // public TreeNode invertTree(TreeNode root) {
    //     TreeNode temp =null;
    //     if(root!=null) {
    //          temp = swapLeftRight(root);
    //          temp.left = swapLeftRight(root.left);
    //          temp.right = swapLeftRight(root.right);
    //     }
    //     return temp;
    // }
    // private TreeNode swapLeftRight(TreeNode root) {
    //     if(root!=null){
