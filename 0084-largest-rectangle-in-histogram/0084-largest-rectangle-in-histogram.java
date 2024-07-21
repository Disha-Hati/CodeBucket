class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left=nsl(heights);
        int[] right=nsr(heights);
        
        int area=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int width=right[i]-left[i]-1;
            area=Math.max(area,width*heights[i]);
        }
        return area;
    }
    
    public int[] nsl(int[] heights){
        int[] ans=new int[heights.length];
        int k=0;
        
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<heights.length;i++){
            if(s.isEmpty()){
                ans[k++]=-1;
            }else if(!s.isEmpty() && heights[s.peek()]<heights[i]){
                ans[k++]=s.peek();
            }else if(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                
                if(s.isEmpty()){
                     ans[k++]=-1;
                }else{
                    ans[k++]=s.peek();
                }
            }
            s.push(i);
        }
        
        return ans;
    }
    
    public int[] nsr(int[] heights){
        int[] ans=new int[heights.length];
        int k=0;
        
        Stack<Integer> s=new Stack<>();
        
        for(int i=heights.length-1;i>=0;i--){
            if(s.isEmpty()){
                ans[k++]=heights.length;
            }else if(!s.isEmpty() && heights[s.peek()]<heights[i]){
                ans[k++]=s.peek();
            }else if(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                
                if(s.isEmpty()){
                     ans[k++]=heights.length;
                }else{
                    ans[k++]=s.peek();
                }
            }
            s.push(i);
        }
        reverse(ans);
        return ans;
    }
    
    public void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}