class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stk.push(ch);
            }else{
                 if(stk.isEmpty())  return false;
                if(ch==')' && stk.peek()!='(' || ch=='}' && stk.peek()!='{' || ch==']' && stk.peek()!='[' ){
                    return false;
                }else{
                    stk.pop();
                }
            }
           
        }
        
        
        return stk.isEmpty();
    }
}