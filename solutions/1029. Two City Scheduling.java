class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // Approach 2
        Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
        int minCost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            minCost += costs[i][0]; // send first N to A
            minCost += costs[costs.length / 2 + i][1]; // send last N to B
        }
        return minCost;
    }
}
