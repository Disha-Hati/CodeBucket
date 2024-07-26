class Solution {
    public int sumSubarrayMins(int[] arr) {       
//         int sum=0;
//         int mod = (int)1e9 +7;
        
//         for(int i=0;i<arr.length;i++){
//             int min = Integer.MAX_VALUE; 
//             for(int j=i;j<arr.length;j++){
//                 min=Math.min(min,arr[j]);
//                 sum=(sum+min)%mod;
//             }
//         }
        
//         return sum;        
        int sum=0, mod = (int)1e9 +7;
        
        int[] lse=nsl(arr);
        int[] rse=nsr(arr);

        for(int i=0;i<arr.length;i++){
            int left=i-lse[i];
            int right=rse[i]-i;
            
            long total = (long) left * right % mod; // Use long to avoid overflow
            long contribution = total * arr[i] % mod;
            
            sum = (int)((sum + contribution) % mod);
        }
        return sum;
    }
    
    public int[] nsl(int[] arr){
        int[] lse = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
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
    
    public int[] nsr(int[] arr){
        int[] rse=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()) rse[i]=arr.length;
            else rse[i]=s.peek();
            
            s.push(i);
        }
               
       // reverse(rse);
        return rse;
        
    }
}