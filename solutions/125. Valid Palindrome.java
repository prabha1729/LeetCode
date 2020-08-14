class Solution {
    public boolean isPalindrome(String s) {
         String s1 = s.replaceAll("\\W+","");
         StringBuilder sb = new StringBuilder(s1);
         String s2= sb.reverse().toString();
        return s1.equalsIgnoreCase(s2);   
    }
}
