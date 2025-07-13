class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder cleanedStr = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                cleanedStr.append(c);
            }
        }
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
    if ((cleanedStr.charAt(left)) != (cleanedStr.charAt(right))) {
        return false;
    }
    left++;
    right--;
}

        return true;

    }
}