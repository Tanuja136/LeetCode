class Solution {
    private static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        int p = countPrimes(n);
        long res = 1L;
        for (int i = 1; i <= p; i++) {
            res = (res * i) % MOD;
        }
        for (int i = 1; i <= n - p; i++) {
            res = (res * i) % MOD;
        }
        return (int) res;
    }

    private int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) if (isPrime[i]) count++;
        return count;
    }
}
