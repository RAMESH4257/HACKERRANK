class Solution {
    public static int find(int row,int[][] mat,int n,int m){
        int maxele=Integer.MIN_VALUE,maxind=-1;
        for(int i=0;i<n;i++){
            if(mat[i][row]>maxele){
                maxele=mat[i][row];
                maxind=i;
            }
        }
        return maxind;
    }
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        int n=mat.length,m=mat[0].length;
      int low=0,high=m-1;
      while(low<=high){
        int mid=(low+high)/2;
        int rowMax=find(mid,mat,n,m);
        int left=mid-1>=0 ? mat[rowMax][mid-1]:Integer.MIN_VALUE;
        int right=mid+1<m ? mat[rowMax][mid+1]:Integer.MIN_VALUE;
        if(mat[rowMax][mid]>=left && mat[rowMax][mid] >=right){
            return new ArrayList<>(Arrays.asList(rowMax,mid));
        }else if(mat[rowMax][mid]<left){
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return new ArrayList<>(Arrays.asList(-1,-1));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna