class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
       double max=Double.NEGATIVE_INFINITY;
       int c=0;
       double sum=0;
       for(int r=0;r<nums.length;r++){
         c++;
         sum+=nums[r];
        //  if(c==k){
        //     max=Math.max(sum/k,max);
        //  }
         while(c>k){
            sum-=nums[l];
            l++;
            c--;
         }
         if(c==k){
            max=Math.max(sum/k,max);
         }
       } 
       return max; 
    }
}