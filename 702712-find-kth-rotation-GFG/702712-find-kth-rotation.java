class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int[] nums=arr;
         int low=0;int high=nums.length-1;
       int idx=-1,ans=Integer.MAX_VALUE;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[low]<=nums[high]){
            if(ans>nums[low]){
                idx=low;
                ans=nums[low];
                break;
            }
        }
        if(nums[low]<=nums[mid]){
            if(ans>nums[low]){
                idx=low;
                ans=nums[low];
            }
            low=mid+1;
        }else{
            if(ans>nums[mid]){
                idx=mid;
                ans=nums[mid];
            }
            high=mid-1;
        }
       }
       return idx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna