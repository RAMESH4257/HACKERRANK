class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                     sum+=nums[j];
                 li.add(sum);
            }
        }
        Collections.sort(li);
        long ans=0;
        long mod=1000000007L;
        for(int i=left-1;i<=right-1;i++){
            ans=(ans+li.get(i))%mod;
        }
        return (int)ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna