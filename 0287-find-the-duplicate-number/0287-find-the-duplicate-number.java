class Solution {
    public int findDuplicate(int[] nums) {
        int hare=nums[0];
        int turtle=nums[0];
        
        do{
           hare = nums[nums[hare]]; // Move hare by 2 steps
        turtle = nums[turtle];    // Move turtle by 1 step
        } while (hare != turtle);
        
        hare = nums[0]; // Reset hare to the start
        while (hare != turtle) {
            hare = nums[hare];
            turtle = nums[turtle];
        }
    
    return hare;
    }
}