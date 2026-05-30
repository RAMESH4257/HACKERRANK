class Solution {
    public void merge(int[] nums,int l,int mid,int h){
       int left=l;int right=mid+1;
       int high=h;
       List<Integer> li=new ArrayList<>();
       while(left<=mid && right<=high){
        if(nums[left]<=nums[right]){
            li.add(nums[left]);
            left++;
        }else{
            li.add(nums[right]);
            right++;

        }
       }
       while(left<=mid ){
        
            li.add(nums[left]);
            left++;
       }
       while(right<=high)
        {
            li.add(nums[right]);
            right++;
       }
       for(int i=l;i<=h;i++){
        nums[i]=li.get(i-l);
       }
    }
    public int pair(int[] nums,int l,int mid,int h){
       long c=0;
       int right=mid+1;
       for(int i=l;i<=mid;i++){
        while(right<=h && (long)nums[i]>(long)nums[right]*2){
            right++;
        }
        c+=(right-(mid+1));
       }
       return (int)c;
    }
    public int divide(int[] nums,int l,int h){
        if(l>=h){
            return 0;
        }
        int c=0;
        int mid=(l+h)/2;
        c+=divide(nums,l,mid);
        c+=divide(nums,mid+1,h);
        c+=pair(nums,l,mid,h);
        merge(nums,l,mid,h);
        return c;
    }
    public int reversePairs(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna