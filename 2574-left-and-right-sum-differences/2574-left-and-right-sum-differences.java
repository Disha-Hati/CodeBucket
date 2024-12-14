class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum=new int[nums.length];
        
        for(int i=1;i<nums.length;i++){
            lsum[i] = lsum[i - 1] + nums[i - 1];
        }
        
        int[] rsum=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            rsum[i] = rsum[i + 1] + nums[i + 1];
        }
        
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(lsum[i]-rsum[i]);
        }
        
        
        return ans;
    }
}