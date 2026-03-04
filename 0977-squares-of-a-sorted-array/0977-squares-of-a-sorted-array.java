class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(arr);
        // return arr;
        // optimal
        int[] temp=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
             if(Math.abs(nums[l])>=Math.abs(nums[r])){
                temp[i]=nums[l]*nums[l];
                l++;
             }else{
                temp[i]=nums[r]*nums[r];
                r--;
             }
        }
        return temp;
    }
}