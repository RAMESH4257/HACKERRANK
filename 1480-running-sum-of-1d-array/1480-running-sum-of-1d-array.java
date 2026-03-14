class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            ans[i]=currsum;
        }
        return ans; 
    }
}