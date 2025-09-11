class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        // For each element in arr1
        for (int a : arr1) {
            boolean isValid = true;

            // Check against every element in arr2
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    isValid = false;
                    break;  // No need to check further
                }
            }

            if (isValid) count++;
        }

        return count;
    }
}
