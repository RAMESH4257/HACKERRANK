class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int prod=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            prod=((nums[i]-1)*(nums[i+1]-1));
            max=Math.max(max,prod);
        }
        return max;
    }
}