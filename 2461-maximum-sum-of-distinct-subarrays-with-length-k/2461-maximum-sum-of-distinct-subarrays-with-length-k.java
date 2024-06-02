class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0,right=0;
        long window_sum=0;
        long max_sum=0;
        HashSet<Integer> set=new HashSet<>();
        
        while(right<nums.length){
           if (set.contains(nums[right])) {
            while (nums[left] != nums[right]) {
                window_sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            // Move left pointer one step further to exclude the duplicate
            window_sum -= nums[left];
            set.remove(nums[left]);
            left++;
        } else {
            window_sum += nums[right];
            set.add(nums[right]);
            if (right - left + 1 == k) {
                max_sum = Math.max(max_sum, window_sum);
                window_sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            right++;
        } 
        }
        
        
        return max_sum;
    }
}