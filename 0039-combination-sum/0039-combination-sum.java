class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> currCombi=new ArrayList<>();
        
        functionCombi(0,target,currCombi,candidates,result);
        
        return result;
    }
    
    public void functionCombi(int index,int target,List<Integer> currCombi,int[] candidates,List<List<Integer>> result ){
        if(index==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(currCombi));
            }
            return;
        }
        
        if(candidates[index]<=target){
            currCombi.add(candidates[index]);
            functionCombi(index,target-candidates[index],currCombi,candidates,result);
            currCombi.remove(currCombi.size()-1);
        }
        
        functionCombi(index+1,target,currCombi,candidates,result);
    }
}