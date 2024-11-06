class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0; //return ans
        int l=0,r=0; //sliding window
        int count=0; //to keep track of k
        
        while(r<nums.length){
            if(nums[r]==0) count++;
            
            if(count>k){
                if(nums[l]==0)  count--;
                l++; //shift the window
            }
            
            ans=Math.max(ans,r-l+1);
            r++;
        }
        
        return ans;
    }
}