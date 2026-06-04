class Solution {
    public int check(int[] nums,int lim){
        int sum=0;
        for(int i:nums){
            double a=(double)i/lim;
            double b=Math.ceil(a);
            sum+=(int)b;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(i,max);
        }
        int low=1,high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna