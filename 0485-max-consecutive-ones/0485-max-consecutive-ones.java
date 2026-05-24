class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mx=0;
        for(int i:nums){
            if(i==1){
                c++;
                mx=Math.max(mx,c);
            }else{
                c=0;
            }
        }
        return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna