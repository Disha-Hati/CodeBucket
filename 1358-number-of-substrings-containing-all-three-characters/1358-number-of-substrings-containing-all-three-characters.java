class Solution {
    public int numberOfSubstrings(String s) {
       int count = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            // Check if the current window contains at least one of each 'a', 'b', and 'c'
            while (map.size() == 3) {
                // All substrings starting from current `left` to `right` are valid
                count += s.length() - right;
                
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
        }
        
        return count;
    }
}