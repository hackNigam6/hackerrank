class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(!st.isEmpty()){
                switch(s.charAt(i))
                {
                    case '}': 
                        if(st.peek()=='{')st.pop();
                        else st.push(s.charAt(i));
                        break;
                    
                    case ']': 
                        if(st.peek()=='[')st.pop();
                        else st.push(s.charAt(i));
                        break;
                    
                    case ')': 
                        if(st.peek()=='(')st.pop();
                        else st.push(s.charAt(i));
                        break;
                        
                    default: st.push(s.charAt(i));
                        break;
                }
                
            }
            else{st.push(s.charAt(i));}
            
        }
        
        return st.isEmpty();
        
    }
}