class Solution {
     public boolean search(int idx,int i,int j,char[][] board,String word){
        if(idx==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean ans=search(idx+1,i-1,j,board,word)||search(idx+1,i+1,j,board,word)||search(idx+1,i,j-1,board,word)||search(idx+1,i,j+1,board,word);
        board[i][j]=temp;
        return ans;
    }
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(search(0,i,j,mat,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna