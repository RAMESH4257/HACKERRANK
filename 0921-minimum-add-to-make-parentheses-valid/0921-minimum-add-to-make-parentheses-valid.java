class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }else{
                if(!st.isEmpty() && ch==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }else{
                        st.push(ch);
                    }
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna