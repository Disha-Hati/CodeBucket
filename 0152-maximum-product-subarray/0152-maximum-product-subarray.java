class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        
        int prefPro=1;
        int suffPro=1;
        
        for(int i=0;i<nums.length;i++){
            if(prefPro==0) prefPro=1;
            if(suffPro==0) suffPro=1;
            
            prefPro*=nums[i];
            suffPro*=nums[nums.length-i-1];
            
            max=Math.max(max,Math.max(prefPro,suffPro));
        }
        
        return max;
    }
}