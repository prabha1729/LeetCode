class Solution {
 public int kthSmallest(int[][] mat, int k) {
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < mat[0].length; i++) row.add(mat[0][i]);
        for(int i = 1; i < mat.length; ++i) {
            List<Integer> nr = new ArrayList<>();
            for(int j = 0; j < mat[i].length; ++j) {
                for(Integer n : row) {
                    nr.add(mat[i][j] + n);
                }
            }
            Collections.sort(nr);
            row = nr.subList(0, Math.min(k, nr.size()));
        }
        return row.get(k-1);
    }
}
