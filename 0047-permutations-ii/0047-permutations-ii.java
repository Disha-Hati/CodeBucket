class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        
         boolean[] used = new boolean[nums.length];
        backtrack(results, new ArrayList<>(), nums, used);
        return results;
    }
    
    private void backtrack(List<List<Integer>> results, List<Integer> current, int[] nums, boolean[] used) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            backtrack(results, current, nums, used);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}