class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];
        int idx = 0;
        int max = findMaxInRange(nums,0,k-1);
        result[idx++] = max;
        for(int i=k;i<n;i++){
            if(max==nums[i-k]){
                int current_max = findMaxInRange(nums,i-k+1,i);
                max = current_max;
                result[idx++] = max;
            }else{
                if(nums[i]>max){
                    max=nums[i];
                }
                 result[idx++] = max;
            }
            
        }
        return result;
    }
    public int findMaxInRange(int[] array, int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max; 
