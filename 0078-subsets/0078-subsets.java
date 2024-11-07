class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        
        int n=nums.length;
        callFunc(0,ans,nums,n,list);
        
        return list;
    }
    
    public void callFunc(int index,List<Integer> ans,int[]nums,int n,List<List<Integer>> list){
        if(index==n){
            list.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(nums[index]);
        callFunc(index+1,ans,nums,n,list);
        ans.remove(ans.size() - 1);
        callFunc(index+1,ans,nums,n,list);
        
    }
}