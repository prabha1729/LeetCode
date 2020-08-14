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
​
//Iterative BFS
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            List<Integer> currList=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left !=null){
                    q.add(curr.left);
                }
                
                if(curr.right !=null){
                    q.add(curr.right);
                }
                currList.add(curr.val);
            }
            
            list.add(currList);
        }
        
        return list;
