class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0,vote=0;
        for(int i=0;i<nums.length;i++){
            if(vote==0) candidate=nums[i];
            
            if(candidate==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        
        return candidate;
    }
}