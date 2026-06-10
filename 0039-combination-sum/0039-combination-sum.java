class Solution {
    public void sequences(int idx,int[] arr,int sum,List<Integer> li,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(sum<0 || idx==arr.length) return;
        li.add(arr[idx]);
        sequences(idx,arr,sum-arr[idx],li,ans);
        li.remove(li.size()-1);
        sequences(idx+1,arr,sum,li,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        sequences(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna