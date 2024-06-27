class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        callRec(0,nums,list,ans);
        
        return list;
    }
    public static void callRec(int index, int[] arr, List<List<Integer>> list, List<Integer> ans) {
        list.add(new ArrayList<>(ans));
        
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue; // skip duplicates
            }
            ans.add(arr[i]);
            callRec(i + 1, arr, list, ans);
            ans.remove(ans.size() - 1);
        }
    }
}