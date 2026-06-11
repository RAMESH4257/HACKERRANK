class Solution {
    public void sub_sequences(int sum,int last,int k,int n,ArrayList<Integer> li,ArrayList<ArrayList<Integer>> ans){
       if(sum==0 && li.size()==k){
        ans.add(new ArrayList<>(li));
        return;
       }
       if(sum<0 || li.size()>k) return;
       for(int i=last;i<=9;i++){
        if(i<=sum){
            li.add(i);
            sub_sequences(sum-i,i+1,k,n,li,ans);
            li.remove(li.size()-1);
        }
       }
    }
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> li= new ArrayList<>();
        sub_sequences(n,1,k,n,li,ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna