class Solution {
    public static int allocation(int[] nums,int lim){
        int stu=1,stude_pag=0;
        for(int i:nums){
            if(i+stude_pag<=lim){
                stude_pag+=i;
            }else{
                stude_pag=i;
                stu++;
            }
        }
        return stu;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int min=Integer.MIN_VALUE,max=0;
        for(int i:arr){
            min=Math.max(i,min);
            max+=i;
        }
        int low=min,high=max,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int req=allocation(arr,mid);
            if(req>k){
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