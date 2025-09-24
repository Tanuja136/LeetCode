class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find smallest and largest numbers
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        // Return GCD of min and max
        return gcd(min, max);
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
