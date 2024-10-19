class Solution {
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]) j++;
            else if(nums[i]!=nums[j]){
                swap(nums,i+1,j);
                i++;
                j++;
            }
        }
        
        return i+1;
    }
}