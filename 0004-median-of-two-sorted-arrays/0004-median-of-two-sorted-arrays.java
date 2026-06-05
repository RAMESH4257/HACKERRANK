class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // binary search 
          int n1=nums1.length,n2=nums2.length;
         int n=n1+n2;
         if(n1>n2) return findMedianSortedArrays(nums2,nums1);
         int left=(n1+n2+1)/2;
         int low=0,high=n1;
         while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                return (double) (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
         }
         return 0;
        // int i=0,j=0,k=0;
        // int n1=nums1.length;
        // int n2=nums2.length;
        // int []arr=new int[n1+n2];
        // while(i<n1&&j<n2){
        //  if(nums1[i]<=nums2[j]){
        //     arr[k++]=nums1[i++];
        //  }else{
        //     arr[k++]=nums2[j++];
        //  }
        // }
        // while(i<n1){
        //     arr[k++]=nums1[i++];
        // }
        // while(j<n2){
        //     arr[k++]=nums2[j++];
        // }
        // int n=arr.length;
        // if(n%2==1){
        //     return arr[n/2];
        // }else{
        //     return (arr[n/2-1]+arr[n/2])/2.0;
        // }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna