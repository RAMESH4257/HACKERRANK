class Solution {
     public void subsequences(int idx,List<Integer> li,List<List<Integer>> ans,int[] nums,int n){
        if(idx==n){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        subsequences(idx+1,li,ans,nums,n);
        li.remove(li.size()-1);
        subsequences(idx+1,li,ans,nums,n);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        subsequences(0,li,ans,nums,nums.length);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna