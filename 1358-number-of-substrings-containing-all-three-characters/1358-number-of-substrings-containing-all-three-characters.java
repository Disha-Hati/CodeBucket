class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            
            while(map.size()==3){
                count+=s.length()-r;
                
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                map.remove(s.charAt(l),0);
                l++;
            }
            
            r++;
        }
        
        
        return count;
    }
}