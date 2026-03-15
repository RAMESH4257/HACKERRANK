class Solution {
    public int trap(int[] height) {
        int l=0;
      int r=height.length-1;
      int ans=0;
      int leftmax=0,rightmax=0;
      while(l<r){
        leftmax=Math.max(leftmax,height[l]);
        rightmax=Math.max(rightmax,height[r]);
        if(leftmax<rightmax){
            ans+=Math.abs(height[l]-leftmax);
            l++;
        }else{
            ans+=Math.abs(height[r]-rightmax);
            r--;
        }
      }  
      return ans;
    }
}