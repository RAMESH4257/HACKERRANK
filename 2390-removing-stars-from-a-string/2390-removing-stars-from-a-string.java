class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && ch=='*'){
                st.pop();
            }else{
                st.push(ch);
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