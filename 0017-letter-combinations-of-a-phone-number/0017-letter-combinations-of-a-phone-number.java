class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0||digits==null){
            return result;
        }
        
        String[] phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        StringBuilder curr=new StringBuilder();
        funcCombi(0,curr,digits,phone,result);
        
        return result;
    }
    
    public void funcCombi(int index, StringBuilder curr,String digits, String[] phone,List<String> result){
        if(curr.length()==digits.length()){
            result.add(curr.toString());
            return;
        }
        
        String possLet=phone[digits.charAt(index)-'0'];
        
        for(char letter:possLet.toCharArray()){
            curr.append(letter);
            funcCombi(index+1,curr,digits,phone,result);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
}