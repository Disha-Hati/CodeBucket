class Solution {
    public int arrangeCoins(int n) {
        //kth row total has k(k+1)/2
        //k(k+1)/2<=n
        
        int start=1;
        int end=n;
        int ans=0;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            long coins=(long)mid*(mid+1)/2;
            
            if(coins<=n){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }     
        
        return ans;
        
    }
}