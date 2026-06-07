class Solution {
     public int upperBound(int[] arr,int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int  blackbox(int[][] mat,int n,int m,int x){
        int c=0;
        for(int i=0;i<n;i++){
            c+=upperBound(mat[i],m,x);
        }
        return c;
    }
    public int median(int[][] mat) {
        // code here
         int n=mat.length,m=mat[0].length;
      int low=Integer.MAX_VALUE;
      int high=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        low=Math.min(mat[i][0],low);
        high=Math.max(mat[i][m-1],high);
      }
      int req=(n*m)/2;
      int ans=0;
      while(low<=high){
        int mid=low+(high-low)/2;
        int smallerequals=blackbox(mat,n,m,mid);
        if(smallerequals<=req){
            low=mid+1;
        }else{
            ans=mid;
            high=mid-1;
        }
      }
      return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna