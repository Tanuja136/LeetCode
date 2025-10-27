class Solution {
    public String reverseWords(String s) {
        // Step 1: Remove leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Step 2: Reverse the array using StringBuilder
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" "); // add space between words
        }
        
        return result.toString();
    }
}
