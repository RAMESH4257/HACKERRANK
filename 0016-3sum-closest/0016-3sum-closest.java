class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closetsum=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
               for(int k=j+1;k<nums.length;k++){
                 int sum=nums[i]+nums[j]+nums[k];
                 if(sum>target){
                    if(diff > sum-target){
                        diff=sum-target;
                        closetsum=sum;
                    }
                 }else if(sum<target){
                    if(diff>target-sum){
                        diff=(target-sum);
                        closetsum=sum;
                    }
                 }
                 else{
                    return target;
                 }
               }
            }
        }
        return closetsum;
    }
}