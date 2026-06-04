class Solution {
    public boolean possible(int[] nums,long day,int m,int k){
        long noOfBouge=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                c++;
            }else{
                noOfBouge+=(c/k);
                c=0;
            }
        }
        noOfBouge+=(c/k);
        return noOfBouge>=m;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
       long val=(m*k);
        if(n<val){
            return -1;
        }
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i:bloomDay){
        min=Math.min(min,i);
        max=Math.max(max,i);
       }
       long ans=-1;
       long low=min,high=max;
        while(low<=high){
           long mid=(low+high)/2;
           if(possible(bloomDay,mid,m,k)){
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