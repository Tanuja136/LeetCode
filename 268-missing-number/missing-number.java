class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedsum = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return expectedsum - sum;
    }
}