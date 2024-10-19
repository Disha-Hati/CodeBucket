class Solution {
    public boolean checkString(String s) {
        int peak=0;
        
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)<s.charAt(i+1)) {
                peak++;
            }else if(s.charAt(i)>s.charAt(i+1)) return false;
      }
        
        
        
        return peak<=1;
    }
}