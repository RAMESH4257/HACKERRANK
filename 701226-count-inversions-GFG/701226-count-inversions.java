class Solution {
    public static int merge(int[] nums,int low,int mid,int high){
        long c=0;
        int l=low;
        int r=mid+1;
        List<Integer> li=new ArrayList<>();
        while(l<=mid && r<=high){
            if(nums[l]<=nums[r]){
                li.add(nums[l]);
                l++;
            }else{
                li.add(nums[r]);
                c+=(mid-l+1);
                r++;
            }
        }
         while(l<=mid){
                li.add(nums[l]);
                l++;
        }
         while(r<=high){
                li.add(nums[r]);
                //c++;
                r++;
        }
        for(int i = low; i <= high; i++){
        nums[i] = li.get(i - low);
    }
        return (int)c;
    }
    public static int divide(int[] nums,int low,int high){
        long c=0;
        if(low>=high){
            return 0;
        }
        int mid=(low+high)/2;
        c+=divide(nums,low,mid);
        c+=divide(nums,mid+1,high);
        c+=merge(nums,low,mid,high);
        return (int)c;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        return divide(arr,0,arr.length-1);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna