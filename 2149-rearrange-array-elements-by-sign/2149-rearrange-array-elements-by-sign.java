class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex=0, negativeIndex=1;
        
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[positiveIndex]=nums[i];
                positiveIndex+=2;
            }else{
                ans[negativeIndex]=nums[i];
                negativeIndex+=2;
            }
        }
        
        return ans;
    }
}