class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length;
         int low=0,high=n*m-1;
         while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m,col=mid%m;
            if(mat[row][col]==x) return true;
            else if(mat[row][col]<x) low=mid+1;
            else high=mid-1;
         }
         return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna