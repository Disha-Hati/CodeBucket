class Solution {
    public int addDigits(int num) {
        /*
        38 
        while(num>0){ 
        int rem=num%10  8  3
        sum+=rem    11  0
         num=num/10; 3 0
        if(num ==0 && sum>10){    
        num=sum;   num= 11
        sum=0
        }
        }
        */
        
       if(num<10){
           return num;
       }
        
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        
        
        return sum;
    }
}