class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        
        List<Integer> curr=new ArrayList<>();
        
        funcCombi(1,n,k,curr,result);
        
        
        return result;
    }
    
    public void funcCombi(int num,int n,int k,List<Integer> curr,List<List<Integer>> result){
        if(n==0 && curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=num;i<=9;i++){
            if(i>n) break;
            
            curr.add(i);
            funcCombi(i+1,n-i,k,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}