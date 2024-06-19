class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=getMax(nums);
        
        while(start<end){
            int mid=start+(end-start)/2;
            
            if(sumD(nums,mid)>threshold){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        
        return start;
    }
    
    public int sumD(int[] nums,int mid){
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return sum;
    }
    
    public int getMax(int[] nums){
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
        return max;
    }
}