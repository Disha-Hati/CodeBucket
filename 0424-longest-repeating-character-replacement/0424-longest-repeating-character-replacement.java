class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;
        
        int[] count=new int[26]; //to keep count of each character
        int maxCount=0;  //maxFrequency
        int ans=0;
        
        while(r<s.length()){
            count[s.charAt(r)-'A']++; //updating count of thet char at r
            
            maxCount=Math.max(maxCount,count[s.charAt(r)-'A']);
            
            if(r-l+1-maxCount>k){
                count[s.charAt(l)-'A']--; //decreasing count of that character
                l++;  //shrinking window
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        
        
        
        
        return ans;
    }
}