class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> st=new Stack<>();
        List<String> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        for(int i:target){
            temp.add(i);
        }
        int i=1;
        while(true)
        {
            boolean isvalid = li.equals(temp);
            if(isvalid){
                break;
            }
            st.add(i);
            li.add(i);
            int check=i;
            ans.add("Push");
            if(!temp.contains(i))
            {
                    ans.add("Pop");
                    st.pop();
                    li.remove(li.indexOf(i));
                    i++;
            }else{
                i++;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna