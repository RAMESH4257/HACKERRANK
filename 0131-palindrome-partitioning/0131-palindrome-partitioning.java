class Solution {
    boolean check(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public void divide(int idx,String s,List<String> li,List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                li.add(s.substring(idx,i+1));
                divide(i+1,s,li,ans);
                li.remove(li.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        divide(0,s,new ArrayList<>(),ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna