class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=findFirst(nums,target,true);
        ans[1]=findFirst(nums,target,false);
        
        return ans;
    }
    
    public int findFirst(int[] nums, int target,boolean first){
        int ans=-1; //if target not found
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(target>nums[mid]) start=mid+1;
            else if(target<nums[mid]) end=mid-1;
            else{
                ans=mid;
                if(first) end=mid-1;
                else start=mid+1;
            }
        }
        
        
        
        
        
        return ans;
    }
}