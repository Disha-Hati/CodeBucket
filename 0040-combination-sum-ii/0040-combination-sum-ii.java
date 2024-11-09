class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        
        funcCombi(0,target,curr,candidates,result);
        
        
        return result;
    }
    
    public void funcCombi(int index,int target,List<Integer> curr,int[] candidates,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(curr));
        }
        
        for(int i=index;i<candidates.length;i++){
           if(candidates[i]>target) break;
            
             if(i>index && candidates[i]==candidates[i-1]) continue;
            curr.add(candidates[i]);
            funcCombi(i+1,target-candidates[i],curr,candidates,result);
            curr.remove(curr.size()-1);
            
        }
    }
}