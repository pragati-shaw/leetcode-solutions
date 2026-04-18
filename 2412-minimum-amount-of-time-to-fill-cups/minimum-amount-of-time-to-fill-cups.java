class Solution {
    public int fillCups(int[] amount) {
        int max = 0;
        int sum = 0;
        
        for (int a : amount) {
            max = Math.max(max, a);
            sum += a;
        }
        
        // Scenario A: If max is more than half the sum, max is the limiting factor
        if (max >= sum - max) {
            return max;
        }
        
        // Scenario B: Balanced amounts. Every second we fill 2 cups 
        // until we have at most 1 cup left.
        return (sum + 1) / 2;
    }
}