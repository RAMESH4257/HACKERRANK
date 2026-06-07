class Solution {
    public int find(int[][] mat,int row,int n,int m){
        int maxele=-1,maxind=-1;
        for(int i=0;i<n;i++){
            if(mat[i][row]>maxele){
                maxele=mat[i][row];
                maxind=i;
            }
        }
        return maxind;
    }
    public int[] findPeakGrid(int[][] mat) {
       int n=mat.length,m=mat[0].length;
       int low=0,high=m-1;
       while(low<=high){
        int mid=(low+high)/2;
        int maxrowIndex=find(mat,mid,n,m);
        int left= mid-1>=0 ? mat[maxrowIndex][mid-1]:-1;
        int right=mid+1<m ? mat[maxrowIndex][mid+1]:-1;
        if(mat[maxrowIndex][mid] > left && mat[maxrowIndex][mid] > right ){
            return new int[]{maxrowIndex,mid};
        }else if(mat[maxrowIndex][mid] < left){
            high=mid-1;
        }else{
            low=mid+1;
        }
       } 
       return new int[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna