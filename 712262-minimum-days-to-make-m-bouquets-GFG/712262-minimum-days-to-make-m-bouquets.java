class Solution {
    public static boolean possible(int[] nums,long day,int m,int k){
        int make_bouquets=0,c=0;
        for(int i:nums){
            if(i<=day){
                c++;
            }else{
                make_bouquets+=c/k;
                c=0;
            }
        }
        make_bouquets+=c/k;
        return make_bouquets>=m;
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i:arr){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        long low=min,high=max,ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(possible(arr,mid,m,k)){
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