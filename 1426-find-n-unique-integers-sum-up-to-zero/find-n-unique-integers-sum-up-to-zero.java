class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Fill pairs
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;     // positive number
            result[index++] = -i;    // negative number
        }

        // If odd, middle element will be 0 (already initialized by default)
        // So we don't need to explicitly add 0, but for clarity:
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
