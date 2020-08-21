class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int m=1;
        int k=2;
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i] == nums[i - 1]) {
                if(count < k) {
                    nums[m++] = nums[i];
                }
                count++;
            } else {
                count = 1;
                nums[m++] = nums[i];
            }
        }
    return m;
        
    }
}
​
​
