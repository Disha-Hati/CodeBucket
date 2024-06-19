class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int left = 1;
        int right = getMax(piles);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (hoursNeeded(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
     private int getMax(int[] piles) {
        int max = piles[0];
        for (int i=1;i<piles.length;i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
    
    private int hoursNeeded(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // This is equivalent to ceil(pile / k)
        }
        return hours;
    }
}