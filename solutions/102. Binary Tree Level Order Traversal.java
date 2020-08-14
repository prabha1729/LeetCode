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
   public List<List<Integer>> levelOrder(TreeNode root) {
       int height=height(root);
       System.out.println(height);
       List<List<Integer>> result=new ArrayList<List<Integer>>();
       for(int i=0;i<=height;i++){
           List<Integer> temp=getNodesAtDistance(root,i);
           result.add(temp);
       }
       return result;
   }
   private int height(TreeNode root){
       if(root==null)
           return -1;
       return 1+Math.max(height(root.left),height(root.right));
   }
  public ArrayList<Integer> getNodesAtDistance(TreeNode root,int distance) {
   var list = new ArrayList<Integer>();
   getNodesAtDistance(root, distance, list);
   return list;
 }
​
 private void getNodesAtDistance(TreeNode root, int distance, ArrayList<Integer> list) {
   if (root == null)
     return;
​
   if (distance == 0) {
     list.add(root.val);
     return;
   }
​
   getNodesAtDistance(root.left, distance - 1, list);
   getNodesAtDistance(root.right, distance - 1, list);
 }
}
​
