class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map =new HashMap();
        char[] charArray = s.toCharArray();
        for (char ch:charArray){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        List<Character> list = new ArrayList<Character>(map.keySet());
        // Collections.sort(list,(a,b)->map.get(b)- map.get(a));
        Collections.sort(list, (a,b)->Integer.compare(map.get(b), map.get(a)));
        
         StringBuilder sb =new StringBuilder();
        for (char c: list) {
            for (int i=0; i<map.get(c); i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
        
        
        // Collections.sort(list, new Comparator<Character>() {
        //     @Override
        //     public int compare(Character x, Character y) {
        //         return map.get(y) - map.get(x);
        //     }
        // });
        // System.out.println(list);
        // StringBuilder str =new StringBuilder();
        // String str =new String();
        // for(int i=0;i<list.size();i++){
            // str = str+list.get(i).toString().repeat(map.get(list.get(i)));
            // str = appendChars(list.get(i),map.get(list.get(i)),str);
        // }
        // return str.toString();
        // return str;
    }
    public StringBuilder appendChars(Character ch,int count,StringBuilder str){
        for(int i=0;i<count;i++)
            str = str.append(ch);
        return str;
    }
}
