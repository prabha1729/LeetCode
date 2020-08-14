class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] res = new int[rows*cols];
        int l=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[l]= matrix[i][j];
                l++;
            }
        }
        Arrays.sort(res);
        return res[k-1];
        // List<Integer> list =new ArrayList();
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         list.add(matrix[i][j]);
        //     }
        // }
        // Collections.sort(list);
        // return list.get(k-1);
    }
}
