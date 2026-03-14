class Solution {
    public int countPartitions(int[] nums) {
        int[] ans=new int[nums.length];
        int cu=0;
        int c=0;
        int leftsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=0;
           for(int j=i+1;j<nums.length;j++){
             rightsum+=nums[j];
           }
           if((rightsum-leftsum)%2==0){
            c++;
           }
        }
        return c;



    }
}