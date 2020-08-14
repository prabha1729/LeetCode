class Solution {
    Random random;
    int[] sum;
    public Solution(int[] w) {
        this.random = new Random();
        // this.sum = w.clone();
        this.sum = w;
        for(int i=1;i<w.length;i++){
            sum[i] = sum[i-1]+w[i];
        }
        // for (int i = 1; i < sum.length; i++) {
        //     sum[i] += sum[i - 1];
        // }
    }
    
    public int pickIndex() {
        int pick = random.nextInt(sum[sum.length - 1]) + 1;
        int left = 0;
        int right = sum.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sum[mid] < pick) {
                left = mid + 1;
            } else if (sum[mid] > pick) {
                right = mid - 1;
            } else {
​
                return mid;
            }
        }
​
        return left; 
    }
}
​
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
