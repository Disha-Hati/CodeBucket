class Solution {
    public int minDifference(int[] nums) {
         int n = nums.length;
        
        // If there are 4 or fewer elements, we can make them all the same with at most 3 moves
        if (n <= 4) {
            return 0;
        }
        
        // Sort the array to easily access the smallest and largest elements
        Arrays.sort(nums);
        
        // We have 4 options, remove 3 largest or 3 smallest or combination of them
        int option1 = nums[n - 1] - nums[3];
        int option2 = nums[n - 2] - nums[2];
        int option3 = nums[n - 3] - nums[1];
        int option4 = nums[n - 4] - nums[0];
        
        // Return the minimum difference from the 4 options
        return Math.min(Math.min(option1, option2), Math.min(option3, option4));
    }
}