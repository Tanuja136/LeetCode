class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length == 0) return 0;

        int i = 0; // pointer for last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move to next unique position
                nums[i] = nums[j]; // update the position with new unique value
            }
        }
        return i + 1; // number of unique elements
    }
}