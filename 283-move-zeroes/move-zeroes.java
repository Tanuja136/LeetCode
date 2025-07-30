class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0; // index to place the next non-zero element

        // First pass: move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }

        // Second pass: fill the rest with zeroes
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}