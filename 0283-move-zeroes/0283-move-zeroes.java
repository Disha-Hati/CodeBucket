class Solution {
    public void moveZeroes(int[] nums) {
        int index=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                index=i;
                break;
            }
        }
        
        if(index==-1) return; //no zeroes
        
        int j=index;
        int k=j+1;
        
        while(k<nums.length){
            if(nums[k]!=0){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                
                j++;
            }
            k++;
        }
    }
}