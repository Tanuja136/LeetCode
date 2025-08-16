import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String curr, int open, int close, int n) {
        // If the current string has reached the maximum length (2*n), add to result
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        // Add an open parenthesis if possible
        if (open < n) {
            backtrack(result, curr + "(", open + 1, close, n);
        }

        // Add a close parenthesis if possible
        if (close < open) {
            backtrack(result, curr + ")", open, close + 1, n);
        }
    }
}
