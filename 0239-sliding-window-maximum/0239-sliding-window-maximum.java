class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int x=0;
        
        Deque<Integer> dq=new LinkedList<>();
        
        for(int i=0;i<nums.length;i++){
            
            //Maintaining Window Size
            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            
            //removing the lesser elements before the current element
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])  dq.removeLast();
            
            dq.addLast(i); // pushing the index to Queue
            
            if(i>=k-1) ans[x++]=nums[dq.peekFirst()];
            
            
        }
        
        return ans;
    }
}