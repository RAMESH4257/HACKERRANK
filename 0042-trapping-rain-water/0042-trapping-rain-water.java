class Solution {
    public int[] prefixmax(int[] arr){
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=Math.max(ans[i-1],arr[i]);
        }
        return ans;
    }
    public int[] suffixmax(int[] arr){
        int[] ans=new int[arr.length];
        ans[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            ans[i]=Math.max(ans[i+1],arr[i]);
        }
        return ans;
    }
    public int trap(int[] height) {
    // int[] leftmax=prefixmax(height);
    // int[] rightmax=suffixmax(height);
    // int c=0;
    // for(int i=0;i<height.length;i++){
    //     int val=Math.min(leftmax[i],rightmax[i]);
    //     c+=(val-height[i]);
    // }
    // return c;
    
    // o(n)-jl
        int l=0;
      int r=height.length-1;
      int ans=0;
      int leftmax=0,rightmax=0;
      while(l<r){
      
        if(height[l]<=height[r]){
           if(height[l]<leftmax){
            ans+=(leftmax-height[l]);
           }else{
            leftmax=height[l];
           }
           l++;
        }else{
           if(height[r]<rightmax){
            ans+=rightmax-height[r];
           }else{
            rightmax=height[r];
           }
           r--;
        }
      }  
      return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna