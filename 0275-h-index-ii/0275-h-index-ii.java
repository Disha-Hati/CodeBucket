class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int s=0;
        int e=n-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(n-mid>citations[mid]) s=mid+1;
            else if(n-mid<citations[mid]) e=mid-1;
            else return n-mid;
        }
        
        return n-s;
    }
}