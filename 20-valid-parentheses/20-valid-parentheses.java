class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack1.push(c);
            }else if(c==')'){
                if (stack1.size()==0 || stack1.peek() != '('){
                    return false;
                }else{
                    stack1.pop();
                }
            }
            else if(c=='}'){
                if (stack1.size()==0 || stack1.peek() !='{'){
                    return false;
                }else{
                    stack1.pop();
                }
        }
            else if(c==']'){
                if (stack1.size()==0|| stack1.peek() !='['){
                    return false;
                }else{
                    stack1.pop();
                }
    }
            
}
        
        if(stack1.size()==0){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}