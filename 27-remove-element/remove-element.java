class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // Points to where the next valid element goes

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // Overwrite nums[j] with valid element
                j++;
            }
        }

        return j; // Number of elements not equal to val
    
    }
}