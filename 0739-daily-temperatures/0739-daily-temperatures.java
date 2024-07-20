class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length]; //ans
        int k=0; //to track ans index
        Stack<Integer> s=new Stack<>();
        
        for(int i=temp.length-1;i>=0;i--){
            if(s.isEmpty()){
                ans[k++]=i;
            }else if(!s.isEmpty() && temp[s.peek()]>temp[i]){
                ans[k++]=s.peek();
            }else if(!s.isEmpty() && temp[s.peek()]<=temp[i]){
                while(!s.isEmpty() && temp[s.peek()]<=temp[i]){
                    s.pop();
                }
                
                if(s.isEmpty()){
                    ans[k++]=i;
                }else{
                    ans[k++]=s.peek();
                }
            }
            s.push(i);
        }
        
         reverse(ans);
        for(int i=0;i<temp.length;i++){
            ans[i]=ans[i]-i;
        }
        
        
        
        return ans;
    }
    
    public void reverse(int[] ans){
        int s=0;
        int e=ans.length-1;
        
        while(s<=e){
            int temp=ans[s];
            ans[s]=ans[e];
            ans[e]=temp;
            
            s++;
            e--;
        }
    }
}