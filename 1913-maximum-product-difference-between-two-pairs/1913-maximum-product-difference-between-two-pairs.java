class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[nums.length-2];
        int d=nums[nums.length-1];
        int small=b*a;
        int big=d*c;
        return big-small;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna