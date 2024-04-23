class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findPosition(nums,target,true);//start
        int last=findPosition(nums,target,false);//end
        
        return new int[]{first,last};
    }
    
    public int findPosition(int[] nums,int target, boolean isStart){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans=mid;
                if(isStart){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        
        return ans;
    }
}