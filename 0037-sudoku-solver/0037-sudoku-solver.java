class Solution {
    public boolean ispossible(int row,int col,char[][] grid,char di){
        int startro=(row/3)*3,startcol=(col/3)*3;
        for(int i=0;i<9;i++){
            if(grid[row][i]==di) return false;
            if(grid[i][col]==di) return false;
            if(grid[(startro+(i/3))][(startcol+(i%3))]==di) return false;
        }
        return true;
    }
    public boolean func(char[][] grid){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(ispossible(i,j,grid,k)){
                            grid[i][j]=k;
                            boolean val=func(grid);
                            if(val) return true;
                            else{
                                grid[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        func(board);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna