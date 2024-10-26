class Solution {
    public void nextPermutation(int[] nums) {
        //find the breaking point
        int breakIndex=-1;
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakIndex=i;
                break;
            }
        }
        
        if(breakIndex==-1){
            reverse(nums,0,nums.length-1); //The given array is the last permutation
            return;
        }  
        
        for(int i=nums.length-1;i>breakIndex;i--){
            if(nums[i]>nums[breakIndex]){
                swap(nums,i,breakIndex);
                break;
            }
        }
        
        reverse(nums,breakIndex+1,nums.length-1);
    }
    
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
    public void reverse(int[] nums,int s,int e){
        while(s<=e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}