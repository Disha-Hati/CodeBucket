class Solution {
    public long subArrayRanges(int[] nums) {
        long total = 0;
        int[] lse = leftsmall(nums);
        int[] rse = rightsmall(nums);
        int[] lge = leftgreat(nums);
        int[] rge = rightgreat(nums);
        
        for (int i = 0; i < nums.length; i++) {
            long lefts = i - lse[i];
            long rights = rse[i] - i;
            
            long min = lefts * rights * nums[i];
            
            long leftg = i - lge[i];
            long rightg = rge[i] - i;
            
            long max = leftg * rightg * nums[i];
            
            long range = max - min;
            
            total += range;
        }
        
        return total;
    }
    
    public int[] leftsmall(int[] nums){
        int[] lse = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                lse[i] = -1;
            } else {
                lse[i] = s.peek();
            }
            
            s.push(i);
        }
        
        return lse;
    }
    
    public int[] rightsmall(int[] nums){
         Stack<Integer> s=new Stack<>();
        int[] rse=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
             while(!s.isEmpty() && nums[s.peek()]>nums[i])  s.pop();
            
            if(s.isEmpty())  rse[i]=nums.length;
            else rse[i]=s.peek();
            
            s.push(i);
        }
        
        return rse;
        
    }
    public int[] leftgreat(int[] nums){
         Stack<Integer> s=new Stack<>();
        int[] lge=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i])    s.pop();
            
            if(s.isEmpty())  lge[i]=-1;
            else lge[i]=s.peek();
            
            s.push(i);
        }
        
        return lge;
        
    }
    public int[] rightgreat(int[] nums){
         Stack<Integer> s=new Stack<>();
        int[] rge=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<nums[i])   s.pop();
            
            if(s.isEmpty())  rge[i]=nums.length;
            else rge[i]=s.peek();
            
            s.push(i);
        }
        
        return rge;
        
    }
}