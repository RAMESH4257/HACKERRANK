class Solution {
    public int minSwaps(String s) {
        int c=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                st.push(ch);
            }else{
                 if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                 }else{
                    c++;
                 }
            }
        }
        return (c+1)/2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna