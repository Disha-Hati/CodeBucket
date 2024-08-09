class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        
        if(nums.length==1) return true;
        
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex)  return false;
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        
        
        
       
        
        return true;
    }
}