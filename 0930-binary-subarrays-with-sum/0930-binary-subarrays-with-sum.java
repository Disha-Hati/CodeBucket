class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    
        return SubarraySumatmostK(nums,goal)-SubarraySumatmostK(nums,goal-1);
    }
    public int SubarraySumatmostK(int[] nums,int k){
        if(k<0)  return 0;
        int l=0,r=0;
        
        int count=0;
        int sum=0;
        
        while(r<nums.length){
            sum+=nums[r];
            
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            
            count+=r-l+1;
            r++;
        }
        
        
        return count;
    }
}