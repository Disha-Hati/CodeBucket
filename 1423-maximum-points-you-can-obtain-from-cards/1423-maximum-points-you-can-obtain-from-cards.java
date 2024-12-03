class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //initially take the complete left sum
        // that will be the max sum
        // then keep deducting from left and keep adding right, don't forget to maximize the sum
        
        
        int lsum=0;
        int rsum=0;
        
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        
        int maxScore=lsum;
        
        int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[r--];
            
            maxScore=Math.max(maxScore,lsum+rsum);
        }
               
        
        return maxScore;
    }
}