class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> st=new Stack<>();
        int acnt=0,bcnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch=='b' && st.peek()=='a'){
                st.pop();
            }else  if(!st.isEmpty() && ch=='a' && st.peek()=='b'){
                st.pop();
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