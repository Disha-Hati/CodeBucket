class Solution {
    void reverse(int[] arr,int s,int e){
        int start=s;
        int end=e;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        
        
        //1234567
        //5671234
        //7654321--reverse whole
        //5671234-- reverse 0 to k-1 ,k to n-1
        
        int n=nums.length;
        
        k=k%n;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        
        
    }
}