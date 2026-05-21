class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
       for(String s:logs){
        if(!st.isEmpty() && s.equals("../")){
            st.pop();
        }else if( s.equals("./")){
            continue;
        }else{
            if(s.charAt(0)!='.'){
                 st.push(s);
            }
            //st.push(s);
        }
       }
       return st.size();  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna