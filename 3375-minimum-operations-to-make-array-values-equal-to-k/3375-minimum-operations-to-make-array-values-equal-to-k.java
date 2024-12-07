class Solution {
    public int minOperations(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;
            }
            if (nums[i] != k) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            }
        }
        return map.size();
    }
}