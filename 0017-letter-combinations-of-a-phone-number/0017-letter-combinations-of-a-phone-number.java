class Solution {
    public List<String> letterCombinations(String digits) {
       List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Map each digit to corresponding letters
        String[] phoneMap = new String[]{
            "",     "",     "abc",  "def",  "ghi",  "jkl",
            "mno",  "pqrs", "tuv",  "wxyz"
        };
        
        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }
    
    private void backtrack(List<String> result, String[] phoneMap, String digits, int index, StringBuilder path) {
        // If the path is complete, add it to the results
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        
        // Get the letters that the current digit can represent
        String possibleLetters = phoneMap[digits.charAt(index) - '0'];
        
        // Loop through all letters and backtrack
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);                // Add letter to current path
            backtrack(result, phoneMap, digits, index + 1, path);  // Recurse to next digit
            path.deleteCharAt(path.length() - 1); // Backtrack to explore new letter
        }
    }
}