class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Step 1: Sort the array in ascending order
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // Number of papers with at least citations[i] citations
            if (citations[i] >= h) {
                return h; // Found the h-index
            }
        }
        
        return 0; 
    }
}