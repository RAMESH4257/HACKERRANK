class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer>  li=new ArrayList<>();
       for(int i:nums2){
        li.add(i);
       }
       int[] ans=new int[nums1.length];
       Arrays.fill(ans,-1);
       boolean isval=false;
       for(int i=0;i<nums1.length;i++){
           int a=nums1[i];
           int idx=li.indexOf(a);
           if(idx==nums2.length-1){
            ans[i]=-1;
            isval=true;
           }
           for(int j=idx+1;j<nums2.length;j++){
            if(nums2[j]>a){
                ans[i]=nums2[j];
                isval=true;
                break;
            }
           }
           if(isval==false){
            ans[i]=-1;
           }
        //    if(idx==nums2.length-1){
        //     ans[i]=-1;
        //    }
        //    else if(nums2[idx+1]>a){
        //     ans[i]=nums2[idx+1];
        //    }else{
        //     ans[i]=-1;
        //    }
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna