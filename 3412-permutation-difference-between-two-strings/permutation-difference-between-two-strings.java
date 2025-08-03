import java.util.*;

class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> indexInS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            indexInS.put(s.charAt(i), i);
        }

        int totalDifference = 0;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int posInS = indexInS.get(ch);
            totalDifference += Math.abs(posInS - i);
        }

        return totalDifference;
    }
}
