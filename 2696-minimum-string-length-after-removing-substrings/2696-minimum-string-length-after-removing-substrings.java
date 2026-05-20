class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1){
            return 1;
        }
       for(char ch:s.toCharArray()){
        if(ch=='B'){
            if(!st.isEmpty() && st.peek()=='A'){
                st.pop();
            }else{
                st.push(ch);
            }
        }else if(ch=='D'){
            if(!st.isEmpty() && st.peek()=='C'){
                st.pop();
            }else{
                st.push(ch);
            }
        }else{
            st.push(ch);
        }
       }
       return st.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna