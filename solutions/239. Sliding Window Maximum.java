class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if (nums == null || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();
        int noOfwindows = n-k+1;
        int[] result = new int[noOfwindows];
        int idx = 0;
        for(int i=0;i<n;i++){
            int windowStart = i-k+1;
            if(!deque.isEmpty() && deque.peekFirst()<windowStart){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(windowStart>=0){
                result[idx] = nums[deque.peek()];
                idx++;
            }
        }
        return result;
    }
}
