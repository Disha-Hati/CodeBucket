class MinStack {
     Stack<Integer> stk=new Stack<>();
        Stack<Integer> newS=new Stack<>();
//     public MinStack() {
       
//     }
    
    public void push(int val) {
        stk.push(val);
        
        if(newS.isEmpty() || val<=newS.peek()){
            newS.push(val);
        }
    }
    
    public void pop() {
        int top=stk.peek();
        
        if(newS.peek()==top){
            newS.pop();
        }
        
        
        stk.pop();
        
        
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        if(newS.isEmpty()) return -1;
        return newS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */