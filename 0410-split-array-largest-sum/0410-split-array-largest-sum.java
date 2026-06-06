class Solution {
    // return the number of subbarrays are formed based on sum_limit
    public int split(int[] nums,int sum_limit){
        int subarr_cnt=1,sum=0;
        for(int i:nums){
            if(i+sum<=sum_limit){
                sum+=i;
            }else{
                sum=i;
                subarr_cnt++;
            }
        }
        return subarr_cnt;
    }
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int high=0;
        for(int i:nums){
            max=Math.max(max,i);
            high+=i;
        }
        int low=max;
        int ans=0;
        while(low<=high){
            // subb array sum;
            int mid=(low+high)/2;
            // gives number of sub-array are formed
            int cnt=split(nums,mid);
            // more subarrays so increse the subarrays sum limit
            if(cnt>k){
                low=mid+1;
            }
            //may be answer decrease the limit
            else{
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