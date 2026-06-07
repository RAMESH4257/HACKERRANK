class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n=mat.length,m=mat[0].length;
         int row=0,col=m-1;
         while(row<n && col>=0){
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col]<x){
                row++;
            }
            else{
                col--;
            }
         }
          return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna