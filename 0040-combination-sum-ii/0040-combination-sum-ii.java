class Solution {
    public int upper_bound(int[] nums,int x){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public void sub_sequences(int idx,int tar,int[] nums,List<Integer> li,List<List<Integer>> ans){
        if(tar==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(tar<0||nums.length==idx) return;
        li.add(nums[idx]);
        sub_sequences(idx+1,tar-nums[idx],nums,li,ans);
        li.remove(li.size()-1);
        // skip duplicate elements
        int new_idx=upper_bound(nums,nums[idx]);
        sub_sequences(new_idx,tar,nums,li,ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        // skip duplicates
        Arrays.sort(candidates);
        sub_sequences(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna