class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combi(0,candidates,target,list,ans);
        
        return list;
    }
    
    public void combi(int index,int[] candidates, int target,List<List<Integer>> list,List<Integer> ans){
       if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        
         for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
            if (candidates[i] > target) break; // No need to continue if the candidate is greater than the target
            
            ans.add(candidates[i]);
            combi(i + 1, candidates, target - candidates[i], list, ans); // Move to the next index
            ans.remove(ans.size() - 1);
        }
    }
}