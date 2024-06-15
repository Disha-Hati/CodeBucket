class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
    int end = nums.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        // Check if mid is even or odd and adjust accordingly
        if (mid % 2 == 1) {
            mid--; // Ensure mid is even
        }

        // Compare the pair elements
        if (nums[mid] == nums[mid + 1]) {
            start = mid + 2; // Move to the right half
        } else {
            end = mid; // Move to the left half
        }
    }

    return nums[start];
    }
}