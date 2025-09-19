import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);                       // Step 1: sort the array
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2]; // initial best guess

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];

                // Update closest if current sum is nearer to target
                if (Math.abs(currSum - target) < Math.abs(closest - target)) {
                    closest = currSum;
                }

                if (currSum < target) {
                    left++;      // need a larger sum
                } else if (currSum > target) {
                    right--;     // need a smaller sum
                } else {
                    return target; // exact match, can't get closer
                }
            }
        }
        return closest;
    }
}
