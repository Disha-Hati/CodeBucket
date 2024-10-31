class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)  return 0;
        
        int longestSeq=0;
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        
        for(int num:nums){
            int count=1;
            if(!set.contains(num-1)) {
                int curr=num;
                
                
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
            }
            longestSeq=Math.max(longestSeq,count);
        }
        
        
        
        return longestSeq;
    }
}