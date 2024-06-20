class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=getMax(weights);
        int end=sum(weights);
        
        while(start<end){
            int mid=start+(end-start)/2;
            
            int dayReq=helper(weights,mid);
            
            if(dayReq>days){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        
        return start;
    }
    
    public int helper(int[] weights,int mid){
        int day=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load>mid){
                day++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return day;
    }
    
    public int getMax(int[] weights){
        int max=weights[0];
        
        for(int i=1;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        
        return max;
    }
    
    public int sum(int[] weights){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
}