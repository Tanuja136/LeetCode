import java.util.*;

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int longest = 0;
        
        // Step 2: Check for harmonious pairs
        for (int key : freq.keySet()) {
            if (freq.containsKey(key + 1)) {
                longest = Math.max(longest, freq.get(key) + freq.get(key + 1));
            }
        }
        
        return longest;
    }
}
