class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;  // Start by drinking all the initial bottles
        int emptyBottles = numBottles;  // These become empty bottles

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;  // Number of new full bottles from exchange
            totalDrunk += newBottles;  // Add these to the total count of drunk bottles
            emptyBottles = newBottles + (emptyBottles % numExchange);  // Update the number of empty bottles
        }

        return totalDrunk;
    }
}