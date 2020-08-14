class Solution {
    public int totalFruit(int[] tree) {
        int start=0;
        int len=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int end=0;end<tree.length;end++){
            map.put(tree[end],map.getOrDefault(tree[end],0)+1);
            while(map.size()>2){
                 map.put(tree[start],map.get(tree[start])-1);
                if(map.get(tree[start])==0){
                    map.remove(tree[start]);
                }
                start++;
            }
            len = Math.max(len,end-start+1);
        }
        return len;
    }
}
