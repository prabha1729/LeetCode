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
    public int maxLevelSum(TreeNode root) {
    int[] sum =new int[10001];
    helper(root,sum,1);
    int level = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0;i<sum.length;i++){
        if(sum[i]>maxSum){
            maxSum = sum[i];
            level = i;
        }
    }
    return level;
    }
    private void helper(TreeNode root,int[] sum,int level){
        if(root==null) return;
        sum[level]+=root.val;
        helper(root.left,sum,level+1);
        helper(root.right,sum,level+1);
    }
}
