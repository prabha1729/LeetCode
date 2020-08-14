class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map =new HashMap();
        char[] charArray = s.toCharArray();
        for (char ch:charArray){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<Character>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)- map.get(a));
        StringBuilder str =new StringBuilder();
        for(int i=0;i<list.size();i++){
            str = str.append(list.get(i).toString().repeat(map.get(list.get(i))));
        }
        return str.toString();
    }
}
