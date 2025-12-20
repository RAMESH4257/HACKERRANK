class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        double[] arr=new double[n];
        int idx=0;
        int i=0,j=nums.length-1;
        while(i<j){
            //System.out.println(nums[i]+" "+nums[j]);
            double k=(nums[i]+nums[j])/2.0;
            arr[idx++]=k;
            i++;
            j--;
        }
        Arrays.sort(arr);
        double ans=arr[0];
        return ans;
    }
}