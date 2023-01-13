import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c = ' ';
        char r = ' ';
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            
            if(c == '(' || c == '{' || c == '['){
                stack.add(c);
            }else{
                if(stack.empty()){
                    return false;
                }else{
                    if(c == ')'){
                        if(stack.peek() != '('){
                            return false;
                        }else{
                            stack.pop();
                        }
                    }else if(c == '}'){
                        if(stack.peek() != '{'){
                            return false;
                        }else{
                            stack.pop();
                        }
                    }else if(c == ']'){
                        if(stack.peek() != '['){
                            return false;
                        }else{
                            stack.pop();
                        }
                    }
                }
            }
            
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}