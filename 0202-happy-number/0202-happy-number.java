class Solution {
    
    public int findSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        
        return sum;
    }
    
    public boolean isHappy(int n) {
        int hare=n;
        int turtle=n;
        
        do{
            hare=findSum(findSum(hare));
            turtle=findSum(turtle);
        }while(hare!=turtle);
        
        if(hare==1){
            return true;
        }
        
        return false;
        
    }
}