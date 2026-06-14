class Solution {
    public boolean ismetrules(int row,int col,int[][] board,int di){
        int startro=(row/3)*3,startcol=(col/3)*3;
        for(int i=0;i<9;i++){
            if(board[row][i]==di) return false;
            if(board[i][col]==di) return false;
            if(board[(startro+(i/3))][(startcol+(i%3))]==di) return false;
        }
        return true;
    }
    public boolean fun(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(ismetrules(i,j,board,k)){
                            board[i][j]=k;
                            boolean val=fun(board);
                            if(val){
                               return true;
                            }else{
                                board[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(int[][] mat) {
        // code here
        fun(mat);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna