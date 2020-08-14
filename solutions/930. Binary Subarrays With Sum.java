class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int start=0;
        int sum=0;
        int count=0;
        for(int end=0;end<A.length;end++){
            sum+=A[end];
            while(start<end && sum>S){
                sum-=A[start];
                start++;
            }
            if(sum==S){
                count++;
            }
            for (int i = start; sum == S && i < end && A[i] == 0; i++){
                     count++; 
            }
        }
        return count;
    }
}
