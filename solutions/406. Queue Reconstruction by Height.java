class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
    Arrays.sort(people,(x,y) -> x[0] == y[0] ? (x[1] - y[1]) : (y[0] - x[0]));
       List<int[]> list = new ArrayList<>();
       int len = people.length;
       for(int i = 0;i < len;i++)
       {
           int k = people[i][1];    
           list.add(k , people[i]);
       }
       
       return list.toArray(new int[len][2]);
    }
}
