class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        
        backtrack(n,k,result,curr,1);
        
        return result;
    }
    
    public void backtrack(int n, int k,List<List<Integer>> result,List<Integer> curr,int index){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=index;i<=n;i++){
            if(curr.contains(i)) continue;
            
            curr.add(i);
            backtrack(n,k,result,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}