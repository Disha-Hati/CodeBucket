class Solution {
    public int findMin(int[] nums) {
       int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than the end element,
            // then the smallest value is in the right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // Otherwise, the smallest value is in the left half
                end = mid;
            }
        }
        // At the end of loop, start == end and pointing to the smallest number
        return nums[end];
    }
}