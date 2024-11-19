class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lessthan = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                count++;
            }
            if (nums[i] < target) {
                lessthan++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}