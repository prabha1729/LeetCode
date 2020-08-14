class Solution {
  public List<Boolean> camelMatch(String[] queries, String pattern) {
        String newPattern = "[a-z]*" + String.join("[a-z]*", pattern.split("")) + "[a-z]*";
        List<Boolean> ans = new ArrayList<>(queries.length);
        for (String q : queries) { ans.add(q.matches(newPattern)); }
        return ans;
    }
}
