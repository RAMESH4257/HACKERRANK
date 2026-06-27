class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int t=0,wtTime=0;
        for(int i=0;i<bt.length;i++){
            wtTime+=t;
            t+=bt[i];
        }
        return wtTime/bt.length;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna