class Solution {
    public String getPermutation(int n, int k) {
        // List to store numbers from 1 to n
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder result = new StringBuilder();

        // Create factorial lookup table and populate numbers
        factorial[0] = 1; // 0! = 1
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
            numbers.add(i);
        }

        // Convert k to 0-based index
        k--;

        // Build the k-th permutation
        for (int i = n; i > 0; i--) {
            int fact = factorial[i - 1]; // (n-1)!
            int index = k / fact;       // Determine the index of the number to pick
            result.append(numbers.get(index)); // Append the selected number
            numbers.remove(index);     // Remove the used number from the list
            k %= fact;                 // Update k for the next iteration
        }

        return result.toString();

    }
}