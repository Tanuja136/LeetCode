class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) sb.append(" "); // add space except after last word
        }

        return sb.toString();
    }
}
