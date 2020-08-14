class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] count_in_edges= new int[N+1];
        int[] count_out_edges= new int[N+1];
        for(int[] tr:trust){
            count_in_edges[tr[1]]++;
            count_out_edges[tr[0]]++;
        }
        for(int i=1;i<=N;i++){
            if(count_in_edges[i]==N-1 && count_out_edges[i]==0) return i;
        }
        return -1;
    }
}
