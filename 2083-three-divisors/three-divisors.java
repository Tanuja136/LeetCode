public class Solution {
    public boolean isThree(int n) {
        // n must be a perfect square
        int root = (int) Math.sqrt(n);
        if (root * root != n) {
            return false;
        }

        // check if the square root is prime
        return isPrime(root);
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

}
