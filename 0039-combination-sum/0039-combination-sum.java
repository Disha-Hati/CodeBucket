class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combi(0,candidates,target,list,ans);
        
        return list;
    }
    
    public void combi(int index,int[] candidates, int target,List<List<Integer>> list,List<Integer> ans){
        if(index==candidates.length){
            if(target==0){
                list.add(new ArrayList<>(ans));
            }
            return;
        }
        
        
        if(candidates[index]<=target){
           ans.add (candidates[index]);
            combi(index,candidates,target-candidates[index],list,ans);
            ans.remove(ans.size() - 1);
        }
        combi(index+1,candidates,target,list,ans);
    }
}