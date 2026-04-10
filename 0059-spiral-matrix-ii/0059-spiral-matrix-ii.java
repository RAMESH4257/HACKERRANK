class Solution {
    public int[][] generateMatrix(int n) {
         int[][] ans=new int[n][n];
        int left=0,right=ans[0].length-1;
        int top=0,bottom=ans.length-1;
        int k=n*n;
        int temp=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
              ans[top][i]=temp;
              temp++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=temp;
                temp++;
            }
            right--;
            if(top<=bottom){
               for(int i=right;i>=left;i--){
                ans[bottom][i]=temp;
                temp++;
            }
            bottom--;
            }
            if(left<=right){
                 for(int i=bottom;i>=top;i--){
                ans[i][left]=temp;
                temp++;
            }
            left++;
            }
        }
        return ans;
    }
}