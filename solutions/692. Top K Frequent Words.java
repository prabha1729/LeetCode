class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map =new HashMap();
        for(String w:words)
           map.put(w,map.getOrDefault(w,0)+1);
        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list,(a,b)->{
            int flag = map.get(b)- map.get(a);
               return (flag==0)?a.compareTo(b):flag;
            });
        return list.subList(0,k);
    }
}
