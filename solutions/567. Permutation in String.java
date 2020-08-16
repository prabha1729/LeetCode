class Solution {
    public boolean checkInclusion(String s1, String s2) {  
      if(s1.length()>s2.length())
        return false;
      int[] ch1=new int[26];
      int[] ch2=new int[26];
      for(int i=0;i<s1.length();i++){
          ch1[s1.charAt(i)-'a']++;
          ch2[s2.charAt(i)-'a']++;
      }
      for(int i=0;i<s2.length()-s1.length();i++){
          if(Arrays.equals(ch1,ch2))
              return true;
          ch2[s2.charAt(i+s1.length())-'a']++;
          ch2[s2.charAt(i)-'a']--;
      }
        return Arrays.equals(ch1,ch2);
    }
}
