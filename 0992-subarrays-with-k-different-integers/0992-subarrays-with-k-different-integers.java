class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    
    public int atMostK(int[] nums,int k){
        int l=0,r=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                map.remove(nums[l],0);
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        
        return ans;
    }
}