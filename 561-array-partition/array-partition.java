import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // sort array
        int sum = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];  // take every even index
        }
        
        return sum;
    }
}
