class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;   // No primes below 2

        boolean[] isPrime = new boolean[n];
        // Mark all numbers ≥ 2 as potential primes
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                // Mark all multiples of p starting from p*p
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
