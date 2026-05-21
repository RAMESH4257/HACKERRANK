class Solution {
    public String makeGood(String s) {
        if(s.length()==1){
            return s;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int k=ch;
            if(st.isEmpty()){
                st.push(ch);
            }
           // char temp=Character.toLowerCase(ch);
            else {
                if(st.peek()>=97 && ch>=97){
                    st.push(ch);
                }
                else if(st.peek()<97 && ch<97){
                    st.push(ch);
                }
                else if(k<97){
                    char temp=Character.toLowerCase(ch);
                    if(st.peek()==temp){
                        st.pop();
                    }else{
                        st.push(ch);
                    }
                }else{
                    char ch2=st.peek();
                    char upper=Character.toLowerCase(ch2);
                    if(upper==ch){
                        st.pop();
                    }else{
                        st.push(ch);
                    }
                }
            
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna