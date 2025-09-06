class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;   // how many new bottles you get
            int remainder = numBottles % numExchange;   // leftover empty bottles

            totalDrunk += newBottles;                   // drink new bottles
            numBottles = newBottles + remainder;        // update total empty bottles
        }

        return totalDrunk;
    }
}
