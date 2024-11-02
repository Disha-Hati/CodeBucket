class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                
            }
        }
        int index=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                index=i;
                break;
            }
        }
        
        if(index==-1)  return nums;
        
        int j=index;
        int k=j+1;
        
        while(k<nums.length){
            if(nums[k]!=0){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j++;
            }
            k++;
        }
       
        
        return nums;
    }
}