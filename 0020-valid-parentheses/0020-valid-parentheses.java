class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true; 
        
        if (s.length() % 2 != 0) return false; 
        
        if(s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{' ||
           s.charAt(s.length() - 1) == '[') return false; 
        
        
        Stack<Character> myStack = new Stack(); 
        
        for (char c: s.toCharArray()) {
            if (c == '(') {
                myStack.push(')');
            } else if (c == '[') {
                myStack.push(']');
            } else if (c == '{') {
                myStack.push('}'); 
            } else {
                if(myStack.isEmpty() || myStack.pop() != c) return false;
            }
        } 
        return myStack.isEmpty(); 
    }
}