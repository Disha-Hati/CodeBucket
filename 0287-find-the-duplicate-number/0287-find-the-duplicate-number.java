class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            while (nums[i] != nums[nums[i] - 1]) { // Check if the current element is in its correct position
                int correct = nums[i] - 1;
                // Swap elements to place nums[i] in its correct position
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return nums[i];
        }
        
        
        return -1;
        
    }
}