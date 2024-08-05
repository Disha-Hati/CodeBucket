class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int l=0,r=0;
        int count=0;
        
        while(r<nums.length){
            if(nums[r]==0) count++;
            
            while(count>k){
                if(nums[l]==0) count--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        
        return ans;
    }
}