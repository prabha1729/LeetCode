class Solution {
    public void reverseArray(int[] nums,int low,int high){
        int temp = -1 ;
        while(low<high){
            temp = nums[low];
            nums[low]=nums[high];
            nums[high] =temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
       
        int len = nums.length;
        // k = len-k;  ##k times left shift
        k = k%len;
        reverseArray(nums,0,len-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,len-1);
        
        }
}
