class Solution {
    public void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) { //finding the first non zero number
                j=i;
                break;
            }
        }
        if(nums[j]==0) return;   //It has all zeroes
        
        swap(nums,0,j); 
        
        int i=0;
        j=1;
        while(j<nums.length){
            if(nums[j]!=0){
                swap(nums,i+1,j);
                i++;
            }
            j++;
        }
    }
}