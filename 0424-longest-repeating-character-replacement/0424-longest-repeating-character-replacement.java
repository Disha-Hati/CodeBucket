class Solution {
    public int characterReplacement(String s, int k) {
         int[] count = new int[26]; // Array to keep track of character counts
        int maxCount = 0; // Maximum count of a single character in the current window
        int maxLength = 0; // Maximum length of the substring found
        int left = 0; // Left pointer for the sliding window

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++; // Increment count of the current character
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']); // Update maxCount

            // Check if the current window is valid
            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--; // Decrement count of the leftmost character
                left++; // Shrink the window from the left
            }

            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength
        }

        return maxLength;
    }
}