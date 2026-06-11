class Solution {
     public void sub_sequences(int idx,int[] nums,ArrayList<Integer> li,ArrayList<ArrayList<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        sub_sequences(idx+1,nums,li,ans);
        li.remove(li.size()-1);
        sub_sequences(idx+1,nums,li,ans);
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
         ArrayList<Integer> li=new ArrayList<>();
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        sub_sequences(0,arr,li,ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna