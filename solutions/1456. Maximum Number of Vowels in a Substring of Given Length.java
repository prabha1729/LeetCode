class Solution {
    public int maxVowels(String s, int k) {
        
        int start=0;
        int count=0;
        Set vowels = Set.of('a','e','i','o','u');
        int res=0;
        for(int end=0;end<s.length();end++){
            if(vowels.contains(s.charAt(end))){
                count++;
            }
            if(end-start>=k){
                if(vowels.contains(s.charAt(start))){
                    count--;  
                }
                start++;
            }
             res = Math.max(count,res);
        }
        return res;
    }
}
