class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum = 0;

        for(int num : nums) {
            totalsum += num;
        }
        int left = 0;
        for(int i = 0; i< nums.length; i++) {
            int right = totalsum - left - nums[i];
            if(left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}