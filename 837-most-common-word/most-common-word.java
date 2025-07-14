import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Normalize paragraph: lowercase and replace punctuations with space
        String normalized = paragraph.toLowerCase().replaceAll("[!?',;\\.]", " ");

        String[] words = normalized.split("\\s+"); // Split by whitespace

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        String mostCommon = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}
