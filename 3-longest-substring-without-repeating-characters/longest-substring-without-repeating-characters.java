import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // If duplicate found, move left until it's removed
            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
