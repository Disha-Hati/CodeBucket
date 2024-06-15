class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            
            if(nums[mid]<=nums[prev]){
                return nums[mid];
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return -1;
    }
}