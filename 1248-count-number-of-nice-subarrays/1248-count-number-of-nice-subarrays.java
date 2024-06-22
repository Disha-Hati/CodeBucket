class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        prefix[0] = 1;
        int count = 0, odd = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                odd++;
            }
            if (odd >= k) {
                count += prefix[odd - k];
            }
            prefix[odd]++;
        }
        
        return count;
    }
}