class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        
        // Check if it's possible to make m bouquets with k flowers each
        if ((long)m * k > n) return -1; 
        
        int start=getMin(bloomDay);
        int end=getMax(bloomDay);
        
        while(start<end){
            int mid=start+(end-start)/2;
            
            if(possible(bloomDay,mid,m,k)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        
         return start;
    }
    
    public boolean possible(int[] bloomDay,int day,int m,int k){
        int count=0,bouquets=0;
        
       for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
                // If we have enough flowers for one bouquet
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        
        return bouquets >= m;
    }
    
    public int getMin(int[] bloomDay){
        int min=bloomDay[0];
        
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        
        return min;
    }
    
    public int getMax(int[] bloomDay){
        int max=bloomDay[0];
        
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        
        return max;
    }
}