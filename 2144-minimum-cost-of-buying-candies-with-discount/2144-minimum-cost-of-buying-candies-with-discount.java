class Solution {
    public int minimumCost(int[] cost) {
         Arrays.sort(cost);
        int sum=0;
        int c=0;
        for(int i=cost.length-1;i>=0;i--){
            if(c==2){
                c=0;
                continue;
            }
            sum+=cost[i];
            c++;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna