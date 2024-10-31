class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length==0)  return 0;
        int longest=Integer.MIN_VALUE;
        int prev=Integer.MIN_VALUE;
        int count=1;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==prev){
                count++;
                prev=nums[i];
            }else if(nums[i]!=prev){
                count=1;
                prev=nums[i];
            }
            longest=Math.max(longest,count);
        }
        
        return longest;
    }
}