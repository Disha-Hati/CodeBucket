class Solution {
    public int lengthOfLongestSubstring(String s) {
         int ans = 0;
        HashSet<Character> set = new HashSet<>();
        
        int l = 0, r = 0;
        
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                ans = Math.max(ans, r - l+1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
                
        return ans;
    }
}