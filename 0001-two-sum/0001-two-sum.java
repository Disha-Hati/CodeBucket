class Solution {
    public int[] twoSum(int[] nums, int target) {
        //loop through the array
        //rem=target-nums[i]
        //if map contains rem -> return else add {element, index } to map
        //return -1,-1 if no match
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}