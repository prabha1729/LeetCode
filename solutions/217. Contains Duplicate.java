class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (!set.add(x)) return true;
        // set.add(x);
    }
    return false;
    }
}
