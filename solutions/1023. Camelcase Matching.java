class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>(queries.length);
        
        for(String query : queries) {
            boolean match = isMatch(query.toCharArray(), pattern.toCharArray());
            list.add(match);
        }
        return list;
    }
    
    public boolean isMatch(char[] query, char[] pattern) {
        int j = 0;
        for(int i = 0 ; i < query.length ; i++) {
            if(j < pattern.length && query[i] == pattern[j]) {
                j++;
            }
            else if(Character.isUpperCase(query[i])) {
                return false;
            }
        }
        return j == pattern.length;
    }
}
