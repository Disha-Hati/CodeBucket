class Solution {
    public void moveZeroes(int[] nums) {
        int i=0; //to track 
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        
        while(i<nums.length){
            nums[i++]=0;
        }
    }
}