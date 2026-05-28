class Solution {
    public void flip(int idx,int[] nums){
        for(int i=idx;i<idx+3;i++){
            if(nums[i]==0){
                nums[i]=1;
            }else{
                nums[i]=0;
            }
            
        }
    }
    public int minOperations(int[] nums) {
       
       
        int c=0;
        
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==0){
              flip(i,nums);
              c++;
            }
        }
        for(int i:nums){
            if(i==0){
                return -1;
            }
        }
        return c;

       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna