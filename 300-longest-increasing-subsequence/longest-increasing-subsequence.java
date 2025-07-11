import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int n = nums.length;
        int[] dp = new int[n];
        int maxLen = 1;

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i] , dp[j] +1);
                }
            }
            maxLen = Math.max(maxLen , dp[i]);
        }
        return maxLen;
        
    }
}