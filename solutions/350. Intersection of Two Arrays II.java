public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 =new ArrayList<Integer>();
        List<Integer> l2 =new ArrayList<Integer>();
        for(int i:nums1){
            l1.add(i);
        }
        for(int j:nums2){
            if(l1.contains(j)){
                l2.add(j);
                l1.remove((Integer)j);
            }
        }
        return l2.stream().mapToInt(i -> i).toArray();
    }
}
