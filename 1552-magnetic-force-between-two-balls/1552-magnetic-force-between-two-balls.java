class Solution {
    // aggresive cows in gfg
    public boolean canweplace(int[] nums,long dis,int cow){
        int cowcnt=1,last_cow=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last_cow>=dis){
                cowcnt++;
                last_cow=nums[i];
            }
        }
        return cowcnt>=cow;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        long ans=0;
        long low=1,high=position[n-1]-position[0];
        while(low<=high){
            long mid=(low+high)/2;
            if(canweplace(position,mid,m)){
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
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna