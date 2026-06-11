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
    public void sequences(int idx,int tar,int[] nums,ArrayList<Integer> li,ArrayList<ArrayList<Integer>> ans){
        if(tar==0){
            //ArrayList<Integer> a=te=new ArrayList<>();
            ans.add(new ArrayList<>(li));
            return;
        }
        if(tar<0 ||idx==nums.length) return;
        li.add(nums[idx]);
        sequences(idx+1,tar-nums[idx],nums,li,ans);
        li.remove(li.size()-1);
        int new_idx=upper_bound(nums,nums[idx]);
        sequences(new_idx,tar,nums,li,ans);
    }
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> li=new ArrayList<>();
        Arrays.sort(arr);
        sequences(0,target,arr,li,ans);
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna