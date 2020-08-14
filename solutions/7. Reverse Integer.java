class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x != 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x /= 10;
        }
        return rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ? 0 : (int) rev;
    }
}
