class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the number (may have multiple digits)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push current number and string onto stacks
                countStack.push(k);
                strStack.push(current);
                // Reset for the new bracketed substring
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop count and previous string, repeat current substring
                int repeatTimes = countStack.pop();
                StringBuilder decoded = strStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(current);
                }
                current = decoded;
            } else {
                // Regular character, append to current
                current.append(ch);
            }
        }

        return current.toString();
    }
}
