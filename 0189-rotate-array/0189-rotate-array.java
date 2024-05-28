class Solution {
    public void reverse(int[] arr, int s,int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        /*
        1 2 3 4 5 6 7   -1 -100 3 99
        5 6 7 1 2 3 4    3   99 -1  -100 
        
        7 6 5 4 3 2 1
        
        4 3 2 1   
        7 6 5
        
        4 3 2 1 7 6 5
        5 6 7 1 2 3 4 
        */
        
        int n=nums.length;
        
        k=k%n;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
}