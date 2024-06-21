class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        
        // Initial satisfaction count without using the secret technique
        int satisfiedCustomers = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                satisfiedCustomers += customers[i];
            }
        }
        
        // Find the best window of X minutes to apply the secret technique
        int additionalSatisfaction = 0;
        int currentWindowSatisfaction = 0;
        
        // Calculate the satisfaction for the first window of size X
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                currentWindowSatisfaction += customers[i];
            }
        }
        additionalSatisfaction = currentWindowSatisfaction;
        
        // Slide the window over the array and find the maximum additional satisfaction
        for (int i = minutes; i < n; i++) {
            if (grumpy[i] == 1) {
                currentWindowSatisfaction += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                currentWindowSatisfaction -= customers[i - minutes];
            }
            additionalSatisfaction = Math.max(additionalSatisfaction, currentWindowSatisfaction);
        }
        
        // Total satisfaction is the initial satisfaction plus the best possible additional satisfaction
        return satisfiedCustomers + additionalSatisfaction;
    }
}