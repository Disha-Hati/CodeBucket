class Solution {
    public void moveZeroes(int[] nums) {
        // 0 1 0 3 12
        /*
        zi=0
        
        j=1 1<5 
        1!=0(T)    1 0 0 3 12   zi=1
        
        j=2 2<5
        0!=0(F)    
        
        j=3 3<5
        3!=0(T)    1 3 0 0 12    
        */
        int zeroIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroIndex=i;
                break;
            }
        }
        
        if(zeroIndex==-1) return;
        
        int i=zeroIndex;
        
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]!=0){
                nums[zeroIndex]=nums[j];
                nums[j]=0;
                 zeroIndex++;
            }
        }
    }
}