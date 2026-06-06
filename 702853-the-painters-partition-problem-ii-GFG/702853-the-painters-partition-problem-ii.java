class Solution {
    public int split(int[] nums,int lim){
        int c=1,howMuchPaint=0;
        for(int i:nums){
            if(i+howMuchPaint<=lim){
                howMuchPaint+=i;
            }else{
                howMuchPaint=i;
                c++;
            }
        }
        return c;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int max=Integer.MIN_VALUE;
    int high=0;
    for(int i:arr){
        high+=i;
        max=Math.max(i,max);
    }
    int low=max;
    int ans=0;
    while(low<=high){
        int mid=(low+high)/2;
        int cnt=split(arr,mid);
        if(cnt>k){
            low=mid+1;
        }else{
            ans=mid;
            high=mid-1;
        }
    }
    return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna