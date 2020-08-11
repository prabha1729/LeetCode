class Solution {
    public int minSubArrayLen(int s, int[] nums) {
     int left=0;
     int minLen = Integer.MAX_VALUE;
     int windowSum=0;
     for(int right=0;right<nums.length;right++){
         windowSum+=nums[right];
         while(windowSum>=s){
             minLen = Math.min(minLen,right-left+1);
             windowSum-=nums[left];
             left++;
         }
     }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
