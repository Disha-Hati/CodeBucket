class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>nums.length/3){
                ans.add(e.getKey());
            }
        }
        
        
        
        return ans;
    }
}