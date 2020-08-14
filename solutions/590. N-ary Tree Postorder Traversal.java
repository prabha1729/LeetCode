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
​
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList();
        if (root == null) return list;
        Stack<Node> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            list.add(0,temp.val);
            for(var node:temp.children){
                stack.push(node);
            }
        }
        return list;
    }
    
}
// class Solution {
//     public List<Integer> postorder(Node root) {
//         List<Integer> list = new ArrayList();
//         helper(root,list);
//         return list;
//     }
//     private void helper(Node root,List<Integer> list){
//         if(root==null) return;
//         for(var child:root.children){
//             helper(child,list);
//         }
