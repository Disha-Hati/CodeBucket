class Solution {
  
    public int secondHighest(String s) {
        int high=-1;
        int secHigh=-1;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                int num = Character.getNumericValue(ch);
                if(num>high){
                    secHigh=high;
                    high=num;
                }else if(num>=secHigh &&num!=high){
                    secHigh=num;
                }
            }
        }
           
        return secHigh;
    }
}