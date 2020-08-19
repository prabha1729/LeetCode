class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];
        int idx = 0;
        int start = 0;
        int max = findMaxInRange(nums,0,k);
        result[idx++] = max;
        
        for(int end=k;end<n;end++){
            if(max==nums[start]){
                max = findMaxInRange(nums,start+1,end);
            }
            if(nums[end]>max){
                max=nums[end];
            }
            result[idx++] = max;
            start++;
        }
        return result;
    }
    public int findMaxInRange(int[] array, int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(array[i]>=max){
                max = array[i];
            }
        }
