class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer=new int[queries.length];
        
        Arrays.sort(nums); //1,2,4,5
        
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        
        //1,3,7.12
        
        for(int i=0;i<queries.length;i++){
            int idx=bs(prefix,queries[i]);
            answer[i]=idx+1;
        }
        
        return answer;
    }
    
    public int bs(int[] prefix,int target){
        int start=0;
        int end=prefix.length-1;
        int ans=-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            
            if(prefix[mid]<=target){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        return ans;
    }
}