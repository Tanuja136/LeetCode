class Solution {
    public int totalNumbers(int[] digits) {
 Set<Integer> uniqueNumbers = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) { // hundreds place
            if (digits[i] == 0) continue; // no leading zero

            for (int j = 0; j < n; j++) { // tens place
                if (j == i) continue; // can't reuse same index

                for (int k = 0; k < n; k++) { // ones place
                    if (k == i || k == j) continue; // can't reuse index
                    if (digits[k] % 2 != 0) continue; // must be even

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    uniqueNumbers.add(num);
                }
            }
        }

        return uniqueNumbers.size();
    }
}