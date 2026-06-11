class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans=new int[queries.length];
        int idx=0;
       for(int i=0;i<queries.length;i++){
        int a=queries[i];
        int c=0;
         int sum=0;
        for(int j=0;j<nums.length;j++){
            int b=nums[j];
            if((sum+b)<=a){
                sum+=b;
                c++;
            }else{
                break;
            }
        }
        ans[idx++]=c;
       }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna