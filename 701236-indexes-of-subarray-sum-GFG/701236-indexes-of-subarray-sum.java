
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        int l=0;
        int sum=0;
    //    int r=arr.length-1;
         for(int r=0;r<arr.length;r++){
             sum+=arr[r];
             while(sum>target && l<r){
                 sum-=arr[l];
                 l++;
             }
             if(sum==target){
                 li.add(l+1);
                 li.add(r+1);
                 return li;
                 //break;
             }
         }
        li.add(-1);
         return li;
    }
}
