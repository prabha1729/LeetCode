class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getDigitSquareSum(n);
        while(slow != fast){
            slow = getDigitSquareSum(slow);
            fast = getDigitSquareSum(getDigitSquareSum(fast));
        }
        return fast == 1;
    }
​
    private int getDigitSquareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
