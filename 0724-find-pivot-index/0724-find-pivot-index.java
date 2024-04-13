class Solution {
    public int pivotIndex(int[] nums) {
        int rsum=0,lsum=0;
        
        for(int i=0;i<nums.length;i++){
            rsum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            rsum=rsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        
        return -1;
    }
}