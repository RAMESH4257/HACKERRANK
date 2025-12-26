class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(k<=9){
                sum+=k;
            }else{
                sum1+=k;
            }
        }
        return sum!=sum1;
    }
}