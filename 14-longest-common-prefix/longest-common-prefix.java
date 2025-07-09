class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];  // Start with the first string

        for (int i = 1; i < strs.length; i++) {
            // While the current word does not start with prefix
            while (!strs[i].startsWith(prefix)) {
                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
}
}