class Solution {
    public int arrangeCoins(int n) {
        long low=1,high=n;
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            long cal=mid*(mid+1)/2;
            if(cal<=n){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna