class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        // Array to mark which numbers (1 to 50) are covered
        boolean[] covered = new boolean[51];
        
        // Mark all covered numbers as true
        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                covered[i] = true;
            }
        }
        
        // Check if all numbers in [left, right] are covered
        for (int i = left; i <= right; i++) {
            if (!covered[i]) {
                return false;
            }
        }
        
        return true;
    }
}
