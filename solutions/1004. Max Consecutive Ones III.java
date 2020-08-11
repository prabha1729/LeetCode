class Solution {
    public int longestOnes(int[] A, int K) {
        int windowStart=0;
        int maxLength = Integer.MIN_VALUE;
        int windowCount=0;
        for(int windowEnd=0;windowEnd<A.length;windowEnd++){
            if(A[windowEnd]==0){
                windowCount++;
            }
            while(windowCount>K){
                if(A[windowStart]==0){
                    windowCount--;
                }
                windowStart++;
            }
             maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
