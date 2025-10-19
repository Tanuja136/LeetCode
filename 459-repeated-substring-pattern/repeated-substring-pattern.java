class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;             // concatenate string with itself
        String trimmed = doubled.substring(1, doubled.length() - 1);  // remove first and last character
        return trimmed.contains(s);         // check if s exists inside
    }
}
