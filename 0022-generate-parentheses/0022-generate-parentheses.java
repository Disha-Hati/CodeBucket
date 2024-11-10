class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        
        funcGen(n,0,0,curr,result);
        
        
        
        return result;
    }
    
    public void funcGen(int n,int open,int close,StringBuilder curr,List<String> result){
        if(open==n && close==n){
            result.add(curr.toString());
            return;
        }
        
        if(open<n){
            funcGen(n,open+1,close,curr.append('('),result);
            curr.deleteCharAt(curr.length()-1);
        }
        
        if(close<open){
            funcGen(n,open,close+1,curr.append(')'),result);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
}