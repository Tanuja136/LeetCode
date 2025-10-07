import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        boolean[] seen = new boolean[total + 1];
        
        int repeated = -1;
        int missing = -1;
        
        // Step 1: Find the repeated number
        for (int[] row : grid) {
            for (int num : row) {
                if (seen[num]) {
                    repeated = num; // Found the repeated one
                }
                seen[num] = true;
            }
        }
        
        // Step 2: Find the missing number
        for (int i = 1; i <= total; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }
        
        return new int[]{repeated, missing};
    }
}
