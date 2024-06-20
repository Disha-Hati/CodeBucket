class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position); // Sort the positions
        
        int left = 1;
        int right = position[position.length - 1] - position[0];
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Corrected middle calculation
            if (canPlaceBalls(position, m, mid)) {
                result = mid; // If it is possible, update the result
                left = mid + 1; // Try for a bigger minimum distance
            } else {
                right = mid - 1; // Try for a smaller minimum distance
            }
        }
        
        return result;
    }
    
    private boolean canPlaceBalls(int[] position, int m, int minDist) {
        int count = 1; // Place the first ball in the first basket
        int lastPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minDist) {
                count++;
                lastPosition = position[i];
            }
            if (count >= m) {
                return true;
            }
        }
        
        return false;
    }
}