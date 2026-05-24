class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int tot=0;
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                //tot+=a;
                int b=st.peek();
                //tot+=b;
                int sum=a+b;
                tot+=sum;
                st.push(a);
                st.push(sum);
            }else if(s.equals("D")){
                int a=st.peek();
                int neww=2*a;
                tot+=neww;
                st.push(neww);
            }else if(s.equals("C")){
                int x=st.pop();
                tot-=x;
            }else{
                int x=Integer.parseInt(s);
                st.push(x);
                tot+=x;
            }
        }
        return tot;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna