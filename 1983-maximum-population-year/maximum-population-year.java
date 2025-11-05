class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearCount = new int[2051]; // Index from 1950 to 2050

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            yearCount[birth]++;   // increase population from birth year
            yearCount[death]--;   // decrease starting from death year
        }

        int maxPopulation = 0;
        int maxYear = 1950;
        int currentPopulation = 0;

        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += yearCount[year]; // prefix sum logic

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
