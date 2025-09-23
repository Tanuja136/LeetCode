class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int n : nums) {
            if (n == 0) {
                return 0;                 // product is zero
            }
            if (n < 0) {
                negativeCount++;          // track negatives
            }
        }

        // If we have an odd number of negatives, product is negative
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
