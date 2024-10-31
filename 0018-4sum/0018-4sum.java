class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        
        Arrays.sort(nums);
        
        int n=nums.length;
        
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                
                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }else if(sum==target){
                        List<Integer> sub=new ArrayList<>();
                        sub.add(nums[i]);
                        sub.add(nums[j]);
                        sub.add(nums[k]);
                        sub.add(nums[l]);
                        ans.add(sub);
                        k++;
                        l--;
                        
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;

                    }
                }
            }
        }
        
        
        
        
        
        return ans;
    }
}