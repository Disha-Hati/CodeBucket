class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        long totalWaitingTime = 0;
        
        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int prepTime = customer[1];
            
            // The chef starts preparing the current customer's order at max(currentTime, arrivalTime)
            currentTime = Math.max(currentTime, arrivalTime) + prepTime;
            totalWaitingTime += (currentTime - arrivalTime);
        }
        
        return (double) totalWaitingTime / customers.length;
    }
}