import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                a.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'&&!a.isEmpty()&&a.peek()=='('){
                 a.pop();
            }
            else if(s.charAt(i)=='}'&&!a.isEmpty()&&a.peek()=='{'){
                 a.pop();
            }
            else if(s.charAt(i)==']'&&!a.isEmpty()&&a.peek()=='[') {
                 a.pop();
            }
            else return false;
        }
        return a.isEmpty();
    }
}