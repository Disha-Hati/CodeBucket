class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        
        func(s,0,curr,ans);
        
        return ans;
    }
    
    public void func(String s,int index,List<String> curr,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=index;i<s.length();i++){
            if(isPalin(s,index,i)){
                curr.add(s.substring(index,i+1));
                func(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    
    public boolean isPalin(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        
        return true;
    }
}