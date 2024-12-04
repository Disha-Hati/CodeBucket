class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        HashSet<Character> set=new HashSet<>();
        int ansCount=0;
        int l=0,r=0;
        
        while(r<s.length()){
            char currentChar = s.charAt(r);

            // If the character already exists in the set, shrink the window
            while (set.contains(currentChar)) {
                set.remove(s.charAt(l));
                l++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Check for "good substring" only when window size is exactly 3
            if (r - l + 1 == 3) {
                ansCount++;
                // Shrink window by removing the leftmost character
                set.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        
        return ansCount;
    }
}