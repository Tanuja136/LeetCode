class Solution {
    public int firstUniqChar(String s) {
         Map<Character, Integer> charCount = new HashMap<>();

        // Step 1: Count character frequency
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found 
    }
}