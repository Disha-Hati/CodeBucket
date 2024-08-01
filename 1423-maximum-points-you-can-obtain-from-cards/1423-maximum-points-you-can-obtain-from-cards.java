class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        
        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        
        int maxPoints=lsum;
        int rsum=0;
        int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[r--];
            
            maxPoints=Math.max(maxPoints, lsum+rsum);
        }
        
        
        
        return maxPoints;
    }
}