import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        // Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Compare all counts to the first one we see
        int expected = -1;
        for (int count : freq.values()) {
            if (expected == -1) {
                expected = count;      // first frequency
            } else if (count != expected) {
                return false;          // mismatch
            }
        }
        return true; // all matched (or string empty)
    }
}
