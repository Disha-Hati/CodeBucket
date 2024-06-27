class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        callRec(0,nums,list,ans);
        
        return list;
    }
    
    public void callRec(int index,int[] arr,List<List<Integer>> list,List<Integer> ans){
         
        if(index==arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(arr[index]);
        callRec(index+1,arr,list,ans);
        ans.remove(ans.size() - 1);
        callRec(index+1,arr,list,ans);
    }
}