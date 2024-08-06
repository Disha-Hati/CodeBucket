class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMost(nums,k)-countAtMost(nums,k-1);
    }
    
    public int countAtMost(int[] nums,int k){
        int l=0,r=0;
        int sum=0;
        int ans=0;
        
        while(r<nums.length){
            if(nums[r]%2==0){
                sum+=0;
            }else{
                sum+=1;
            }
            while(sum>k){
                if(nums[l]%2!=0) sum-=1;
                l++;
            }
            
            
            
            ans+=r-l+1;
            r++;
        }
        
        
        
        
        
        
        return ans;
    }
}