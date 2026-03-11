class Solution {
    public void sortColors(int[] nums) {
        int zeros=0,ones=0,twos=0;
        for(int i:nums){
            if(i==0){
                zeros++;
            }else if(i==1){
                ones++;
            }else{
                twos++;
            }
        }
        int i=0,j=0;
        while(i<zeros){
            nums[j]=0;
            i++;
            j++;
        }
        i=0;
        while(i<ones){
            nums[j]=1;
            i++;
            j++;
        }
        i=0;
        while(i<twos){
            nums[j]=2;
            i++;
            j++;
        }
    }
}