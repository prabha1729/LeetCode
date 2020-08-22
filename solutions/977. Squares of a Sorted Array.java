class Solution {
    public int[] sortedSquares(int[] A) {
        
        int left=0;
        int k= A.length-1;
        int right = A.length-1;
        int[] ans = new int[A.length];
        while(left<=right){
            if(Math.abs(A[left])>Math.abs(A[right])){
                ans[k--] = A[left]*A[left];
                left++;
            }else{
                 ans[k--] = A[right]*A[right];
                 right--;
            }
        }
        return ans;
    }
}
