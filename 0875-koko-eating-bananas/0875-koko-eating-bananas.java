class Solution {
     public long check(int[] nums,long lim){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long a=(nums[i]+lim-1)/lim; // ceil formul
            sum+=a;
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
         for(int i:piles){
            max=Math.max(max,i);
         }
         long low=1,high=max;
         long ans=1;
         while(low<=high){
            long mid=(low+high)/2;
            if(check(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna