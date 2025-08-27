class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        
        // Sum of full weeks
        int fullWeeksSum = 28 * weeks + 7 * (weeks * (weeks - 1)) / 2;
        
        // Sum of remaining days
        int remainingSum = 0;
        for (int i = 1; i <= days; i++) {
            remainingSum += weeks + i;
        }
        
        return fullWeeksSum + remainingSum;
    }
}
