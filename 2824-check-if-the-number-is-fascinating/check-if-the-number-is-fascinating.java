class Solution {
    public boolean isFascinating(int n) {
        // Step 1: Concatenate n, 2*n, 3*n into a string
        String combined = "" + n + (2 * n) + (3 * n);
        
        // Step 2: If length is not 9, return false
        if (combined.length() != 9) return false;
        
        // Step 3: Check each digit from 1 to 9 exactly once
        boolean[] seen = new boolean[10]; // index 0-9
        
        for (char ch : combined.toCharArray()) {
            int digit = ch - '0';
            if (digit == 0 || seen[digit]) { 
                return false; // contains 0 or duplicate digit
            }
            seen[digit] = true;
        }
        
        return true; // Passed all checks
    }
}
