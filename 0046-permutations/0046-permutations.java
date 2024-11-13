class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        
        backtrack(nums,ans,curr);
        return ans;
    }
    
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            backtrack(nums,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}