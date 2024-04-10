class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxiConsecutive=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>maxiConsecutive){
                    maxiConsecutive=count;
                }
            }else{
                count=0;
            }
        }
        
        
        return maxiConsecutive;
        
    }
}