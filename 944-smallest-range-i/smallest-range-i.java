class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum values in the array
        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        // Apply the formula: max(0, (max - min) - 2 * k)
        int range = max - min - 2 * k;
        return Math.max(0, range);
    }
}
