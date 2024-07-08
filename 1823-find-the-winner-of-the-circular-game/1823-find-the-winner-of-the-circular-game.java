class Solution {
    public int findTheWinner(int n, int k) {
        int position = 0;  // Initial position, zero-indexed for simplicity

        // Iterate to find the position of the last remaining person
        for (int i = 2; i <= n; i++) {
            position = (position + k) % i;
        }

        // Convert zero-indexed position to one-indexed
        return position + 1;
    }
}