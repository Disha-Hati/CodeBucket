class Solution {
    public int commonFactors(int a, int b) {
        int end=0;
        if(a>b){
            end =a;
        }else{
            end=b;
        }
        
        int count=0;
        for(int i=1;i<=end;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        
        
        
        return count;
    }
}