class Solution {
    public void generate(int idx,String s,int open,int close,List<String> li,int n){
        if(open>n) return;
        if(open+close==2*n && open==close){
            li.add(s);
            return;
        }
        generate(idx+1,s+"(",open+1,close,li,n);
        if(open>close){
             generate(idx+1,s+")",open,close+1,li,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        int open=0,close=0;
        String s="";
        generate(0,s,open,close,li,n);
        return li;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna