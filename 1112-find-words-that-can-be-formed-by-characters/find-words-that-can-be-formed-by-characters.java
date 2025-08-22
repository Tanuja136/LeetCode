class Solution {
    public int countCharacters(String[] words, String chars) {
        // count chars frequencies
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int sum = 0;
        
        for (String word : words) {
            if (canForm(word, freq)) {
                sum += word.length();
            }
        }
        
        return sum;
    }
    
    private boolean canForm(String word, int[] freq) {
        int[] count = new int[26];
        
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
            if (count[c - 'a'] > freq[c - 'a']) {
                return false; // needs more letters than available
            }
        }
        return true;
    }
}
