class Solution {
    public int maxProductDifference(int[] nums) {
        // Sort array
        Arrays.sort(nums);
        int n = nums.length;
        
        int max1 = nums[n - 1];     // largest
        int max2 = nums[n - 2];     // 2nd largest
        int min1 = nums[0];         // smallest
        int min2 = nums[1];         // 2nd smallest
        
        return (max1 * max2) - (min1 * min2);
    }
}
