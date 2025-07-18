class Solution {
    public int firstUniqChar(String s) {
      int[] freq = new int[26]; // Since only lowercase letters are used

        // Step 1: Count character frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}