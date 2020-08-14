/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList();
        if(root==null) return list;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> curList = new ArrayList();
            for(int i=0;i<size;i++){
                Node cur = queue.poll();
                curList.add(cur.val);
                for(var child:cur.children){
                    if(child!=null)
                        queue.add(child);
                        // curList.add(child.val);
                }
            }
            list.add(curList);
        }
        return list;
    }
}
​
​
​
//Recursive
// class Solution {
//     public List<List<Integer>> levelOrder(Node root) {
//         List<List<Integer>> list = new ArrayList();
//         helper(root,list,0);
//         return list;
//     }
//     private void helper(Node root,List<List<Integer>> list,int level){
//         if(root==null) return;
//         if(list.size()==level)
//             list.add(new ArrayList());
//         list.get(level).add(root.val);
//         for(var child:root.children){
//             helper(child,list,level+1);
//         }
//     }
// }
