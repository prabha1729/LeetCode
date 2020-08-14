class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
    }
        int[] frequency = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(char c: sArray) {
            frequency[c - 'a']++;
        }
        
        for(int i=0;i<tArray.length;i++) {
            frequency[tArray[i] - 'a']--;
            if(frequency[tArray[i] - 'a']<0) return false;
        }
        
        return true;
    }
}
