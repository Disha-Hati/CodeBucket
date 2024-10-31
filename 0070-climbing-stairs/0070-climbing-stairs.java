class Solution {
    public int climbStairs(int n) {
        // tle on recursion
//         if(n<0)  return 0;
//         if(n == 0 || n == 1 || n == 2) return n;
        
//         return climbStairs(n-1)+climbStairs(n-2);
        
        if(n==1 || n==2) return n;
        int a=1;
        int b=1;
        int c=0;
        
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        
        return c;
        
        
    }
}