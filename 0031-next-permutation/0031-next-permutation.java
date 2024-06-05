class Solution {
    public void nextPermutation(int[] nums) {
        int p= -1;
        //scanning from right to left,finding element less than its previous
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                p = i - 1;//p=lesser one index
                break;
            }
        }
        
        //last order where we need to return lowest
        if (p == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
 
        //from right finding element greater than p
        int q= nums.length-1;
        for (int i = nums.length-1; i >= p+1; i--) {
            if (nums[i] > nums[p]) {
                q = i;
                break;
             }
        }
        
        //int q=p+1;
        
        //swap p and q
        swap(nums, p, q);
        
        reverse(nums, p+1 , nums.length - 1);
    }
    
     private void swap(int[] nums,int p,int q){
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }
    
    private void reverse(int[] nums, int i, int j) {
    while (i < j) {
        swap(nums, i, j);
        i++;
        j--;
        }   
    }
}