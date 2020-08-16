class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int[] freq = new int[26];
        int res=0;
        int mostOccured = 0;
        int tobeReplace = 0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            mostOccured = Arrays.stream(freq).max().getAsInt();
            tobeReplace = (right-left+1) - mostOccured;
            if(tobeReplace>k){
                 freq[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}
