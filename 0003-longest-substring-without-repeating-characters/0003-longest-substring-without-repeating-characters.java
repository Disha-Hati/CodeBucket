class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=0;
        HashSet<Character> set=new HashSet<>();
        
        int l=0,r=0;
        
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxCount=Math.max(maxCount,r-l+1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        
        return maxCount;
    }
}